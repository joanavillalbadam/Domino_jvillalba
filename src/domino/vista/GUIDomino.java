/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import domino.controlador.gestioDomino;
import domino.controlador.gestioDominoMod2;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author ALUMNEDAM
 */
public class GUIDomino extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;
    public JTextField textfield1;
    public JLabel label1;
    public JButton boton1;
    JLabel instrucciones;

    public GUIDomino() {
        setLayout(null);
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        mi1 = new JMenuItem("Jugar!");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2 = new JMenuItem("Instrucciones modo de juego");
        mi2.addActionListener(this);
        menu1.add(mi2);

    }

    public void actionPerformed(ActionEvent e) {

        Container f = this.getContentPane();

        if (e.getSource() == mi1) {
            f.removeAll();
            mi1.removeAll();
            f.setBackground(new Color(204, 255, 153));

            JButton bot1 = new JButton("Jugar Modo 1");
            bot1.setBounds(100, 10, 200, 150);
            add(bot1);

            JButton bot2 = new JButton("Jugar Modo 2");
            bot2.setBounds(100, 140, 200, 150);
            add(bot2);

            bot1.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    gestioDomino gesD = new gestioDomino();
                    gesD.Iniciar();

                }

            });

            bot2.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    gestioDominoMod2 gesD2 = new gestioDominoMod2();
                    gesD2.Iniciar();

                }

            });

        }
        if (e.getSource() == mi2) {

            Instrucciones inst = new Instrucciones();
            inst.setVisible(true);

        }

    }

}
