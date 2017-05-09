package domino;

import domino.controlador.gestioDomino;
import domino.vista.GUIDomino;

public class Domino {

    public static void main(String[] args) {

        GUIDomino guidom = new GUIDomino();
        guidom.setBounds(10, 20, 500, 500);
        guidom.setVisible(true);
    }
}
