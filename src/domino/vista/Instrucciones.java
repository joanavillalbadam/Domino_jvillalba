/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

/**
 *
 * @author Daniel
 */
public class Instrucciones extends javax.swing.JFrame {

    /**
     * Creates new form Instrucciones
     */
    public Instrucciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 255, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Instrucciones Domino!\n\nModo de Juego 1:\n\t- En este modo se juega con 4 jugadores, tu contra 3.\n\t- El funcionamiento es sencillo, cada jugador tiene 7 fichas al iniciarse el juego,\n\tel jugador que tenga el seis doble sera el primero en sacar esta ficha, cuando sea \n\ttu turno se te preguntara mediante una cajita con dos botones, si quieres pasar o jugar\n\trecuerda que siempre puedes ver tus fichas en el tablero, por lo tanto puedes observar \n\tlas fichas para decidir, si decides pasar, jugara el siguiente, si decides jugar te pedira \n\tque selecciones una ficha, y cuando la selecciones en que lado de la mesa la quieres \n\tponer 'Iquierda o Derecha', selecciona la que mas de convenga.\n\t- Diviertete!\nModo de Juego 2:\n\t- En este modo se juega con 2 jugadores tu contra el otro.\n\t-El funcionamiento es sencillo, cada jugador tiene 7 fichas al iniciarse el juego,\n\tel jugador que tenga el seis doble sera el primero en sacar esta ficha, cuando sea \n\ttu turno se te preguntara mediante una cajita con dos botones, si quieres pasar o jugar\n\trecuerda que siempre puedes ver tus fichas en el tablero, por lo tanto puedes observar \n\tlas fichas para decidir, si decides pasar, jugara el siguiente, si decides jugar te pedira \n\tque selecciones una ficha, y cuando la selecciones en que lado de la mesa la quieres \n\tponer 'Iquierda o Derecha', selecciona la que mas de convenga.\n\t- Diviertete!\n");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
