/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.frontend;

import com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.backend.OrdenamientoPorBurbuja;
import com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.backend.OrdenamientoPorInsercion;

/**
 *
 * @author jose
 */
public class OrdenamientoInsercionFrame extends javax.swing.JFrame {

    private Etiqueta[] etiquetas;

    //private OrdenamientoPorInsercion ordenamiento;
    /**
     * Creates new form OrdenamientoInsercionFrame
     */
    public OrdenamientoInsercionFrame() {
        etiquetas = new Etiqueta[]{new Etiqueta(8),
            new Etiqueta(11),
            new Etiqueta(7),
            new Etiqueta(30),
            new Etiqueta(20),
            new Etiqueta(24),
            new Etiqueta(23),
            new Etiqueta(22),
            new Etiqueta(15),
            new Etiqueta(1)
        };
        initComponents();
        mostrarEtiquetas();
        //ordenamiento = new OrdenamientoPorInsercion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrdenar = new javax.swing.JButton();
        pnlEtiquetas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        pnlEtiquetas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlEtiquetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrdenar)
                        .addGap(0, 614, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnOrdenar)
                .addGap(33, 33, 33)
                .addComponent(pnlEtiquetas, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        try {
            etiquetas = new Etiqueta[]{new Etiqueta(8),
                new Etiqueta(11),
                new Etiqueta(7),
                new Etiqueta(30),
                new Etiqueta(20),
                new Etiqueta(24),
                new Etiqueta(23),
                new Etiqueta(22),
                new Etiqueta(15),
                new Etiqueta(1)
            };
            //etiquetas = ordenamiento.ordenarEtiquetas(etiquetas);

            OrdenamientoPorBurbuja ordenamiento = new OrdenamientoPorBurbuja(this);
            ordenamiento.setArregloNoOrdenado(etiquetas);
            ordenamiento.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        mostrarEtiquetas();
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(OrdenamientoInsercionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenamientoInsercionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenamientoInsercionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenamientoInsercionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenamientoInsercionFrame().setVisible(true);
            }
        });
    }

    public void mostrarEtiquetas() {
        pnlEtiquetas.removeAll();
        for (int i = 0; i < etiquetas.length; i++) {
            Etiqueta etiqueta = etiquetas[i];
            pnlEtiquetas.add(etiqueta);
        }
        pnlEtiquetas.validate();
        pnlEtiquetas.repaint();
    }
    
    public void desactivarBtnOrdenamiento() {
        this.btnOrdenar.setEnabled(false);
    }
    
    public void activarBtnOrdenamiento() {
        this.btnOrdenar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JPanel pnlEtiquetas;
    // End of variables declaration//GEN-END:variables
}
