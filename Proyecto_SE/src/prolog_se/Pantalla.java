package prolog_se;

import java.awt.Color;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author eduar
 */
public class Pantalla extends javax.swing.JFrame {

    String archivo, pregunta, preg;
    Query q1;
    Map<String, Term>[] vect;

    public Pantalla() {
        initComponents();
        this.setTitle("Implementacion de Prolog");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#FFCCCC"));
    }

    public void solucion() {
        vect = q1.allSolutions();

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Es: " + vect[i] + "\n");
            TxtA.append(String.valueOf(vect[i]) + "\n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtA = new javax.swing.JTextArea();
        BtnA = new javax.swing.JButton();
        Box1 = new javax.swing.JComboBox<>();
        Box2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(297, 420));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("De");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("A");

        TxtA.setColumns(20);
        TxtA.setRows(5);
        jScrollPane1.setViewportView(TxtA);

        BtnA.setBackground(new java.awt.Color(0, 204, 255));
        BtnA.setForeground(new java.awt.Color(255, 255, 255));
        BtnA.setText("Aceptar");
        BtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAActionPerformed(evt);
            }
        });

        Box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "recibidor", "puerta1", "corredor", "puerta2", "sala", "puerta3", "comedor", "puerta4", "cocina" }));
        Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1ActionPerformed(evt);
            }
        });

        Box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "recibidor", "puerta1", "corredor", "puerta2", "sala", "puerta3", "comedor", "puerta4", "cocina" }));
        Box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Recursividad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(BtnA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAActionPerformed
        TxtA.setText("");
        try {
            String conexion = "consult('sexto.pl')";
            Query con = new Query(conexion);
            System.out.println(conexion + "" + (con.hasMoreSolutions() ? "Aceptado" : "Fallado"));
            pregunta = "paso(" + Box1.getSelectedItem() + "," + Box2.getSelectedItem() + ").";
            q1 = new Query(pregunta);
            TxtA.setText(q1.hasSolution() ? "True" : "False");
            TxtA.append("\n");            
            if (q1.hasSolution() && true) {
                solucion();
            } 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnAActionPerformed

    private void Box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1ActionPerformed

    }//GEN-LAST:event_Box1ActionPerformed

    private void Box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Box1;
    private javax.swing.JComboBox<String> Box2;
    private javax.swing.JButton BtnA;
    public static javax.swing.JTextArea TxtA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
