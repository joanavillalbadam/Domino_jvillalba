/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import domino.model.Torn;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ALUMNEDAM
 */
public class FinestraJoc2J extends JFrame implements ActionListener {

    private JPanel pNord, pImatges, PSud, PEst, POest, pCenter;
    public Scanner lector = new Scanner(System.in);
    private Joc joc;
    private Torn torn;

    public FinestraJoc2J() {
        super("Exemple BorderLayout");
        configuracio();
        this.pack();
        this.setVisible(true);
    }

    FinestraJoc2J(String num, String fitx) {

        super("Exemple BorderLayout");
        configuracio();
        this.pack();
        this.setVisible(true);
        //boolean cx = num.isEmpty();
        System.out.println(num);
        if (num.equals("4")) {
            System.out.println("Aqui hay algo :D" + num);
        } else {
            System.out.println("Aqui no hay na");
        }

    }

    public void configuracio() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 300);
        this.setPreferredSize(new Dimension(600, 400));
        this.setLayout(new BorderLayout());

        pNord = new JPanel();
        PSud = new JPanel();
        PEst = new JPanel();
        POest = new JPanel();
        pCenter = new JPanel();

        this.add(pNord, BorderLayout.NORTH);
        this.add(PSud, BorderLayout.SOUTH);
        this.add(PEst, BorderLayout.WEST);
        this.add(POest, BorderLayout.EAST);
        this.add(pCenter, BorderLayout.CENTER);

    }

    public void MostrarNombreJugador(String string, String string0) {

        PEst.removeAll();
        POest.removeAll();
        pNord.removeAll();
        PSud.removeAll();
        JLabel lbl1 = new JLabel("Jug1:" + string);
        pNord.add(lbl1, BorderLayout.NORTH);

        JLabel lbl4 = new JLabel("Jug2:" + string0);
        PSud.add(lbl4, BorderLayout.SOUTH);
    }

    public String MostrarTurnoJugador(Jugador jugador) {

        return jugador.nom;
    }

    public void MostrarFitxasJugador(ArrayList<Fitxa> fitxes, ArrayList<Fitxa> fitxes0) {

        ImageIcon iconB = new ImageIcon("imagenes/backv.gif");
        ImageIcon iconB2 = new ImageIcon("imagenes/back.gif");

        for (int i = 0; i < fitxes.size(); i++) {
            JLabel lblT = new JLabel(" ");
            lblT.setPreferredSize(new Dimension(50, 50));
            lblT.setIcon(iconB);
            pNord.add(lblT, BorderLayout.NORTH);
            PSud.setLayout(new GridLayout(1, 8));
            System.out.println("**" + fitxes.get(i).valors[0] + "|" + fitxes.get(i).valors[1] + "**");
        }
        for (int i = 0; i < fitxes0.size(); i++) {
            ImageIcon icon = new ImageIcon("imagenes/" + fitxes0.get(i).valors[0] + fitxes0.get(i).valors[1] + "v.gif");
            JLabel lblT = new JLabel(" ");
            lblT.setPreferredSize(new Dimension(50, 50));
            lblT.setIcon(icon);
            PSud.add(lblT, BorderLayout.SOUTH);
            PSud.setLayout(new GridLayout(1, 8));

        }
        PEst.updateUI();
        POest.updateUI();
        pNord.updateUI();
        PSud.updateUI();
    }

    public void MostrarFitxasMesa(ArrayDeque<Fitxa> fitxesJugades) {

        pCenter.removeAll();

        for (Fitxa fitxa : fitxesJugades) {
            System.out.println("*fitxasMesa*" + fitxa.getValors()[0] + "|" + fitxa.getValors()[0] + "**");

            ImageIcon icon = new ImageIcon("imagenes/" + fitxa.getValors()[0] + fitxa.getValors()[1] + ".gif");
            JLabel lblFM = new JLabel(" ");

            lblFM.setPreferredSize(new Dimension(50, 50));
            lblFM.setIcon(icon);
            pCenter.add(lblFM);

        }

        pCenter.updateUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Color")) {
            this.pNord.setBackground(Color.red);
        }

    }

    public String mostraMenu() {
        String p;
        String[] options = {"Passar", "jugar"};
        int opcion = JOptionPane.showOptionDialog(null, "Escoje una Opcion:", "opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        p = String.valueOf(opcion);
        return p;
    }

    public boolean elejirLado() {

        boolean conseguido = false;
        String p;
        String[] options = {"Izquiera", "Derecha"};
        int opcion = JOptionPane.showOptionDialog(null, "En que lado quieres colocar la ficha?", "opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        int x = opcion;
        if (x == 0) {
            conseguido = true;
        }
        if (x == 1) {
            conseguido = false;
        }
        pCenter.removeAll();
        return conseguido;
    }

    public int elejirFitxa(ArrayList<Fitxa> fitxes) {

        String p;
        int numbot = fitxes.size();

        String[] options = {"", "", "", "", "", "", ""};

        ImageIcon[] Image = {
            new ImageIcon(""),
            new ImageIcon(""),
            new ImageIcon(""),
            new ImageIcon(""),
            new ImageIcon(""),
            new ImageIcon(""),
            new ImageIcon("")
        };

        for (int i = 0; i < fitxes.size(); i++) {
            ImageIcon icon = new ImageIcon("imagenes/" + fitxes.get(i).valors[0] + fitxes.get(i).valors[1] + ".gif");
            Image[i] = icon;
        }
        int pos = JOptionPane.showOptionDialog(null, "Selecciona la ficha con la que jugar", "opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Image, Image[0]);

        System.out.println("Has escollit **" + fitxes.get(pos).valors[1] + "|" + fitxes.get(pos).valors[0] + "**");

        return pos;
    }

    public void decirGanador(Jugador guanyador) {

        PEst.updateUI();
        POest.updateUI();
        pNord.updateUI();
        PSud.updateUI();

        JOptionPane.showMessageDialog(null, "Ha ganado: " + guanyador.getNom());
    }

}
