package metodoburbuja;

import javax.swing.DefaultListModel;

public class adventist extends javax.swing.JFrame {

    DefaultListModel fuentes;
    jf jenny = new jf();

    public adventist() {
        initComponents();
        fuentes = new DefaultListModel();
        jList1.setModel(fuentes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton3.setText("ORDENAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("DESORDENAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(jButton4)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        fuentes.clear();
        fuentes.addElement(jenny.ordenar(0));
        fuentes.addElement(jenny.ordenar(1));
        fuentes.addElement(jenny.ordenar(2));
        fuentes.addElement(jenny.ordenar(3));
        fuentes.addElement(jenny.ordenar(4));
        fuentes.addElement(jenny.ordenar(5));
        fuentes.addElement(jenny.ordenar(6));
        fuentes.addElement(jenny.ordenar(7));
        fuentes.addElement(jenny.ordenar(8));
        fuentes.addElement(jenny.ordenar(9));
        fuentes.addElement(jenny.ordenar(10));
        fuentes.addElement(jenny.ordenar(11));
        fuentes.addElement(jenny.ordenar(12));
        fuentes.addElement(jenny.ordenar(13));
        fuentes.addElement(jenny.ordenar(14));
        fuentes.addElement(jenny.ordenar(15));
        fuentes.addElement(jenny.ordenar(16));
        fuentes.addElement(jenny.ordenar(17));
        fuentes.addElement(jenny.ordenar(18));
        fuentes.addElement(jenny.ordenar(19));
        fuentes.addElement(jenny.ordenar(20));
        fuentes.addElement(jenny.ordenar(21));
        fuentes.addElement(jenny.ordenar(22));
        fuentes.addElement(jenny.ordenar(23));
        fuentes.addElement(jenny.ordenar(24));
        fuentes.addElement(jenny.ordenar(25));
        fuentes.addElement(jenny.ordenar(26));
        fuentes.addElement(jenny.ordenar(27));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        fuentes.clear();
        fuentes.addElement(jenny.desor(0));
        fuentes.addElement(jenny.desor(1));
        fuentes.addElement(jenny.desor(2));
        fuentes.addElement(jenny.desor(3));
        fuentes.addElement(jenny.desor(4));
        fuentes.addElement(jenny.desor(5));
        fuentes.addElement(jenny.desor(6));
        fuentes.addElement(jenny.desor(7));
        fuentes.addElement(jenny.desor(8));
        fuentes.addElement(jenny.desor(9));
        fuentes.addElement(jenny.desor(10));
        fuentes.addElement(jenny.desor(11));
        fuentes.addElement(jenny.desor(12));
        fuentes.addElement(jenny.desor(13));
        fuentes.addElement(jenny.desor(14));
        fuentes.addElement(jenny.desor(15));
        fuentes.addElement(jenny.desor(16));
        fuentes.addElement(jenny.desor(17));
        fuentes.addElement(jenny.desor(18));
        fuentes.addElement(jenny.desor(19));
        fuentes.addElement(jenny.desor(20));
        fuentes.addElement(jenny.desor(21));
        fuentes.addElement(jenny.desor(22));
        fuentes.addElement(jenny.desor(23));
        fuentes.addElement(jenny.desor(24));
        fuentes.addElement(jenny.desor(25));
        fuentes.addElement(jenny.desor(26));
        fuentes.addElement(jenny.desor(27));
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(adventist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adventist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adventist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adventist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adventist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
