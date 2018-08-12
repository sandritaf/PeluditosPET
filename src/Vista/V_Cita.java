
package Vista;

import Controlador.C_Cita;
import Controlador.C_Fecha;
import Controlador.C_Juridico;
import Controlador.C_Mascota;
import Controlador.C_Natural;
import Controlador.C_Propietario;
import Controlador.C_Servicio;
import Controlador.C_Trabajador;
import Modelo.M_Cita;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import Modelo.M_Trabajador;
import Modelo.M_Servicio;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Cita extends javax.swing.JPanel {
    
    M_Cita modelo;
    C_Cita controlador;
//    C_Propietario cPropietario; M_Propietario mPropietario;
    C_Natural cNatural; M_Natural mNatural;
    C_Juridico cJuridico; M_Juridico mJuridico;
    C_Servicio cServicio; M_Servicio mServicio;
    C_Trabajador cTrabajador; M_Trabajador mTrabajador;
    C_Mascota cMascota; M_Mascota mMascota;
    C_Fecha cFecha; 
    String servicio, dueño, trabajador, mascota, fecha, diagnosticoFinal, tratamiento;
    Date date;
    
    public V_Cita() {
        initComponents();
        controlador = new C_Cita();
        cServicio = new C_Servicio();
        cTrabajador = new C_Trabajador();
        cMascota = new C_Mascota();
//        cPropietario = new C_Propietario();
        cNatural = new C_Natural();
        cJuridico = new C_Juridico();
        cFecha = new C_Fecha();

        cServicio.cargarServicios(cmbServicio);
        cTrabajador.cargarTrabajadores(cmbTrabajador);
        cMascota.cargarDuenos(cmbDueño);
        reiniciarValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Guardar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Cita = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Servicio = new javax.swing.JLabel();
        Trabajador = new javax.swing.JLabel();
        cmbServicio = new javax.swing.JComboBox<>();
        Fecha = new javax.swing.JLabel();
        cmbTrabajador = new javax.swing.JComboBox<>();
        DiagnosticoFinal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiagnosticoFinal = new javax.swing.JTextArea();
        Mascota = new javax.swing.JLabel();
        cmbMascota = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        Dueño = new javax.swing.JLabel();
        Tratamiento = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTratamiento = new javax.swing.JTextArea();
        cmbDueño = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(145, 498));

        Guardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar48.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Guardar.setVerifyInputWhenFocusTarget(false);
        Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });

        Modificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editar48.png"))); // NOI18N
        Modificar.setText("Modificar");
        Modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Modificar.setVerifyInputWhenFocusTarget(false);
        Modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/eliminar48.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Eliminar.setVerifyInputWhenFocusTarget(false);
        Eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        Cita.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Cita.setForeground(new java.awt.Color(255, 255, 255));
        Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cita72.png"))); // NOI18N
        Cita.setText("Cita");
        Cita.setFocusable(false);
        Cita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CitaMouseClicked(evt);
            }
        });

        Limpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/escoba48.png"))); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Limpiar.setVerifyInputWhenFocusTarget(false);
        Limpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiarMouseClicked(evt);
            }
        });

        VerLista.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        VerLista.setForeground(new java.awt.Color(255, 255, 255));
        VerLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ver48.png"))); // NOI18N
        VerLista.setText("Ver Lista");
        VerLista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VerLista.setVerifyInputWhenFocusTarget(false);
        VerLista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        VerLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerListaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Cita)
                    .addComponent(Guardar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Limpiar)
                    .addComponent(VerLista))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Cita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerLista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        Servicio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Servicio.setText("Servicio");

        Trabajador.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Trabajador.setText("Trabajador");

        cmbServicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Fecha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Fecha.setText("Fecha");

        cmbTrabajador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        DiagnosticoFinal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DiagnosticoFinal.setText("Diagnóstico Final");

        txtDiagnosticoFinal.setColumns(20);
        txtDiagnosticoFinal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDiagnosticoFinal.setRows(5);
        jScrollPane1.setViewportView(txtDiagnosticoFinal);

        Mascota.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Mascota.setText("Mascota");

        cmbMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMascotaActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setText("yyyy-mm-dd");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        Dueño.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Dueño.setText("Dueño");

        Tratamiento.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Tratamiento.setText("Tratamiento");

        txtTratamiento.setColumns(20);
        txtTratamiento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTratamiento.setRows(5);
        jScrollPane3.setViewportView(txtTratamiento);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Servicio)
                            .addComponent(Trabajador)
                            .addComponent(Fecha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cmbServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTrabajador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mascota)
                            .addComponent(Dueño))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbMascota, 0, 150, Short.MAX_VALUE)
                            .addComponent(cmbDueño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Tratamiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(DiagnosticoFinal)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 134, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Servicio)
                    .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dueño)
                    .addComponent(cmbDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Trabajador)
                    .addComponent(cmbTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mascota))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DiagnosticoFinal)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Tratamiento)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaCitas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaCitasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCitas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para guardar");
        }
        else{
            
            servicio = getComboSelected(cmbServicio);
            dueño = getIDComboSelected(cmbDueño);
            mascota = getIDComboSelected(cmbMascota);
            trabajador = getIDComboSelected(cmbTrabajador);
            fecha = getText(txtFecha);
            diagnosticoFinal = txtDiagnosticoFinal.getText();
            tratamiento = txtTratamiento.getText();
            
            mTrabajador = cTrabajador.getPersona(trabajador);
            if(tipoDueño(cmbDueño).equals("V")){
                mNatural = cNatural.getPersona(dueño);
                mMascota = cMascota.getMascota(mascota, mNatural);
            }
            else if(tipoDueño(cmbDueño).equals("J")){
                mJuridico = cJuridico.getPersona(dueño);
                mMascota = cMascota.getMascota(mascota, mJuridico);
            }
            mServicio = cServicio.getServicio(servicio);      
            
            modelo = new M_Cita(controlador.getNumCitasExistentes()+1, mMascota, mTrabajador, mServicio, fecha, diagnosticoFinal, tratamiento);
            controlador.guardarCita(modelo);
           
            reiniciarValores();
            limpiarCajas();
            tablaCitas.setModel(this.controlador.cargarTabla());
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para guardar");
        }
        else{
            
            //modelo = new M_Mascota(id, nombre, especie, raza, edad, observaciones,obtenerDueno(cmbDueno));

            //controlador.modificarMascota(auxID,auxNombre,auxObservaciones, modelo,id,controlador.buscarDueno(auxID,auxNombre));

            reiniciarValores();
            limpiarCajas();
//            tablaMascotas.setModel(this.controlador.cargarTabla());
        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para guardar");
        }
        else{
        
        //    controlador.eliminarMascota(id,nombre,observaciones,obtenerDueno(cmbDueno));

            reiniciarValores();
            limpiarCajas();
//            tablaMascotas.setModel(this.controlador.cargarTabla());
        }
    }//GEN-LAST:event_EliminarMouseClicked

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
//        controlador.listarMascotas();    // TODO add your handling code here:
    }//GEN-LAST:event_VerListaMouseClicked

    private void tablaCitasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMousePressed
    
    }//GEN-LAST:event_tablaCitasMousePressed

    private void cmbMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMascotaActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed

    }//GEN-LAST:event_txtFechaActionPerformed

    private void CitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CitaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CitaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cita;
    private javax.swing.JLabel DiagnosticoFinal;
    private javax.swing.JLabel Dueño;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Mascota;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Servicio;
    private javax.swing.JLabel Trabajador;
    private javax.swing.JLabel Tratamiento;
    private javax.swing.JLabel VerLista;
    private javax.swing.JComboBox<String> cmbDueño;
    private javax.swing.JComboBox<String> cmbMascota;
    private javax.swing.JComboBox<String> cmbServicio;
    private javax.swing.JComboBox<String> cmbTrabajador;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextArea txtDiagnosticoFinal;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextArea txtTratamiento;
    // End of variables declaration//GEN-END:variables

    private void limpiarCajas(){
//        txtPK.setText(null);
//        txtNombre.setText(null);
        txtFecha.setText(null);
//        txtDueno.setText(null);
        txtDiagnosticoFinal.setText(null);
        cmbDueño.setSelectedIndex(0);
        cmbMascota.setSelectedIndex(0);
        cmbServicio.setSelectedIndex(0);
        cmbTrabajador.setSelectedIndex(0);
    }
    
    //Devuelve el string de la opcion seleccionada en un combo
    public String getComboSelected(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = "";
        
        int guion = codigo.indexOf(" -");
        codigoFinal = codigo.substring(0, guion);
        
        return codigoFinal;
    }

    //Devuelve el string de la opcion seleccionada en un combo
    public String getNombreComboSelected(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = "";
        
        int guion = codigo.indexOf("- ");
        codigoFinal = codigo.substring(0, guion);
        
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
    
    public boolean txtVacio(JTextField txt){
        if(txt.getText().isEmpty())
            return true;
        return false;
    }
    
    public boolean cajasVacias(){
        if(txtVacio(txtFecha))
            return true;
        if(txtDiagnosticoFinal.getText().isEmpty())
            return true;
        if(txtTratamiento.getText().isEmpty())
            return true;
        return false;
    }
    
    public void reiniciarValores(){
        servicio = null;
        dueño = null; 
        trabajador = null;
        mascota = null;
        fecha = null;
        diagnosticoFinal = null;
        tratamiento = null;
    }
    
    public String getText(JTextField txt){
        return txt.getText();
    }
    
    public String getTextCombo(JComboBox cmb){
        return (String) cmb.getSelectedItem();
    }
    
    public String tipoDueño(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = codigo.substring(0,1);
        return codigoFinal;
    }
    
}
