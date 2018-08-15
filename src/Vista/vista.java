/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Conexion.Conexion;
import Controlador.C_Mascota;
import Controlador.C_Cita;
import Controlador.C_Fecha;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author brenda
 */
public class vista extends javax.swing.JFrame {

    C_Mascota c;
    C_Cita cita;
    Conexion con;
    Date fecha;
    C_Fecha cfecha;
    
    public vista() {
        initComponents();
        c = new C_Mascota();
        cita = new C_Cita();
        cfecha = new C_Fecha();
        
        String opc = "Juridico";
        
        fecha = cfecha.deStringToDate(jTextField1.getText());
        
        String f = cfecha.deDateToString(fecha);
        System.out.println(f);
        
        cita.eliminarCita(2);
        cita.eliminarCita(3);
        
        cita.listarCitas();
        getIDComboSelected(jComboBox1);
    //    c.cargarDuenos(jComboBox1/*, opc*/);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        Cargar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V27 - Sandra Farreras" }));

        Cargar.setText("Cargar");
        Cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMouseClicked(evt);
            }
        });

        jTextField1.setText("2018-01-01");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(Cargar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Cargar)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseClicked
        JOptionPane.showMessageDialog(null, getNombreComboSelected(jComboBox1));        // TODO add your handling code here:
    }//GEN-LAST:event_CargarMouseClicked

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    //Devuelve el string de la opcion seleccionada en un combo
    public String getNombreComboSelected(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = "";
        
        codigoFinal = codigo.substring(0,1);
        
     //   codigoFinal = (String) codigo.lastIndexOf(codigo);
        
//        int guion = codigo.lastIndexOf(codigo);//indexOf(" - ");
//        codigoFinal = codigo.substring(0, guion);
        
        return codigoFinal;
    }

    
    //Devuelve el codigo de la opcion seleccionada en un combo
    public String getIDComboSelected(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = "";
        
        int guion = codigo.indexOf(" -");
        codigoFinal = codigo.substring(0, guion);
        
        return codigoFinal;
    }
    
}
