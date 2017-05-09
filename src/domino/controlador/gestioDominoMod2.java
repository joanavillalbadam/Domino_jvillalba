/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.controlador;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import domino.model.Torn;
import domino.vista.FinestraJoc;
import domino.vista.FinestraJoc2J;
import java.util.ArrayDeque;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class gestioDominoMod2 {

    private Joc joc;
    private Torn torn;
    private FinestraJoc2J vista;
    private Jugador jugador;
    private Fitxa fitxa;
    private String nombre[] = new String[4];

    public gestioDominoMod2() {
        this.joc = new Joc(2, 28, 7);
        this.torn = new Torn(joc);

    }

    public void introducirNombres() {

        nombre[0] = "Roni";
        nombre[1] = JOptionPane.showInputDialog("Introduce tu nombre: ");
        while (nombre[0].equals(nombre[1])) {
            nombre[1] = JOptionPane.showInputDialog("Este nombre ya lo tiene un jugador introduce otro: ");
        }

    }

    public void Iniciar() {

        introducirNombres();

        joc.iniciar(nombre);
        torn.inicial();

        vista = new FinestraJoc2J();

        while (!joc.isFinalitzat()) {

            vista.MostrarNombreJugador(nombre[0], nombre[1]);
            vista.MostrarFitxasJugador(joc.jugadors[0].getFitxes(), joc.jugadors[1].getFitxes());
            vista.MostrarFitxasMesa(joc.getFitxesJugades());
            String turnoJug = vista.MostrarTurnoJugador(joc.getJugadors()[joc.getTorn()]);

            if (turnoJug != nombre[1]) {
                JugadaMaquina();

            } else {
                respostaOpcioMenu();

            }
            joc.actualitzarEstat();

        }
        vista.MostrarNombreJugador(nombre[0], nombre[1]);
        vista.MostrarFitxasJugador(joc.jugadors[0].getFitxes(), joc.jugadors[1].getFitxes());
        vista.MostrarFitxasMesa(joc.getFitxesJugades());
        System.out.println(joc.getGuanyador());

        vista.decirGanador(joc.getGuanyador());
    }

    public void respostaOpcioMenu() {

        String accio = vista.mostraMenu();
        System.out.println(accio);
        switch (accio) {
            case "1":
                unaFitxa();
                break;
            case "0":
                Passar();
                break;
            default:
                respostaOpcioMenu();

        }
    }

    private void unaFitxa() {

        Fitxa f;
        int fitx;
        boolean extrem;
        boolean conseguido;

        fitx = vista.elejirFitxa(joc.jugadors[joc.getTorn()].getFitxes());
        f = joc.jugadors[joc.getTorn()].getFitxes().get(fitx);
        extrem = vista.elejirLado();

        conseguido = torn.colocarUnaFitxa(f, extrem);

    }

    private void Passar() {

        System.out.println("Has passat!");
        torn.passar();

    }

    private void JugadaMaquina() {

        boolean comprovarPassar = false;
        int primerValor = PrimeraFichaMesa(joc.getFitxesJugades());
        int ultimoValor = SegundaFichaMesa(joc.getFitxesJugades());

        System.out.println(primerValor);
        System.out.println(ultimoValor);
        for (int i = 0; i < joc.jugadors[joc.getTorn()].getFitxes().size(); i++) {
            int numIzq = joc.jugadors[joc.getTorn()].getFitxes().get(i).getValors()[0];
            int numDer = joc.jugadors[joc.getTorn()].getFitxes().get(i).getValors()[1];
            if (numIzq == primerValor || numDer == primerValor) {
                Fitxa f = joc.jugadors[joc.getTorn()].getFitxes().get(i);
                torn.colocarUnaFitxa(f, true);
                comprovarPassar = true;
                break;
            } else if (numIzq == ultimoValor || numDer == ultimoValor) {
                Fitxa f = joc.jugadors[joc.getTorn()].getFitxes().get(i);
                torn.colocarUnaFitxa(f, false);
                comprovarPassar = true;
                break;
            }
            System.out.println(joc.jugadors[joc.getTorn()].getFitxes().get(i).getValors()[0]);
        }
        if (comprovarPassar == false) {
            Passar();
        }
    }

    private int PrimeraFichaMesa(ArrayDeque<Fitxa> fitxesJugades) {

        return fitxesJugades.getFirst().getValors()[0];
    }

    private int SegundaFichaMesa(ArrayDeque<Fitxa> fitxesJugades) {

        return fitxesJugades.getLast().getValors()[1];
    }

}
