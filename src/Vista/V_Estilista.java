
package Vista;

import Controlador.C_Estilista;
import Modelo.M_Estilista;
import Modelo.M_Trabajador;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Estilista extends javax.swing.JPanel {

    M_Estilista modelo;
    C_Estilista controlador;
    String nombre, apellido, cedula, rif, telefono, nivelI, profesion;
    int edad, aniosE;
    
    public V_Estilista() {
        initComponents();
        txtPK.setVisible(false);
        controlador = new C_Estilista();
        tablaEstilistas.setModel(this.controlador.cargarTabla());
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
        Estilista = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        primerNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        segundoNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        RIF = new javax.swing.JLabel();
        txtAniosE = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        NivelInstruccion = new javax.swing.JLabel();
        aniosExperiencia = new javax.swing.JLabel();
        txtRIF = new javax.swing.JTextField();
        Profesion = new javax.swing.JLabel();
        txtProfesion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNivelI = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        txtPK = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstilistas = new javax.swing.JTable();

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

        Estilista.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Estilista.setForeground(new java.awt.Color(255, 255, 255));
        Estilista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/peluquero72.png"))); // NOI18N
        Estilista.setText("Estilista");
        Estilista.setFocusable(false);
        Estilista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Estilista.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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
                    .addComponent(VerLista)
                    .addComponent(Limpiar)
                    .addComponent(Estilista)
                    .addComponent(Eliminar)
                    .addComponent(Modificar)
                    .addComponent(Guardar))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Estilista)
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

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        primerNombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        primerNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtCedula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        Cedula.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Cedula.setText("Cédula");

        Edad.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Edad.setText("Edad");

        segundoNombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        segundoNombre.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        RIF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RIF.setText("RIF");

        txtAniosE.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtEdad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        NivelInstruccion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NivelInstruccion.setText("Nivel de Instrucción");

        aniosExperiencia.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        aniosExperiencia.setText("Años de Experiencia");

        txtRIF.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Profesion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Profesion.setText("Profesion");

        txtNivelI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Telefono.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Telefono.setText("Teléfono");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aniosExperiencia)
                    .addComponent(NivelInstruccion)
                    .addComponent(primerNombre)
                    .addComponent(Cedula)
                    .addComponent(Telefono))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtAniosE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(txtNivelI, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Profesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(segundoNombre)
                    .addComponent(RIF)
                    .addComponent(Edad)
                    .addComponent(txtPK))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProfesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRIF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoNombre)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cedula)
                    .addComponent(RIF)
                    .addComponent(txtRIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniosExperiencia)
                    .addComponent(txtAniosE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelInstruccion)
                    .addComponent(Profesion)
                    .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivelI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono)
                    .addComponent(txtPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaEstilistas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaEstilistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEstilistas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
            
            nombre = getText(txtNombre);
            apellido = getText(txtApellido);
            cedula = getText(txtCedula);
            rif = getText(txtRIF);
            telefono = getText(txtTelefono);
            aniosE = Integer.parseInt(getText(txtAniosE));
            profesion = getText(txtProfesion);
            nivelI = getText(txtNivelI);
            edad = Integer.parseInt(getText(txtEdad));
            
            modelo = new M_Estilista(nombre, apellido, cedula, rif, edad, nivelI, profesion, aniosE, telefono);
            controlador.guardarEstilista(modelo);
            
            reiniciarValores();
            limpiarCajas();
            tablaEstilistas.setModel(this.controlador.cargarTabla());
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        
        if(getText(txtCedula).equals("")){
            JOptionPane.showMessageDialog(null, "El campo de Cedula debe estar lleno para realizar ésta acción");
        }
        else{
            
            cedula = getText(txtCedula);
            
            char valor = cedula.charAt(0);
            char v = 'V';            
            
            if(!(valor == v) ){
                cedula = "V"+cedula;
            }
            
            controlador.eliminarEstilista(cedula);
            
            reiniciarValores();
            limpiarCajas();
            tablaEstilistas.setModel(this.controlador.cargarTabla());
        }
        
    }//GEN-LAST:event_EliminarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
            
            nombre = getText(txtNombre);
            apellido = getText(txtApellido);
            cedula = getText(txtCedula);
            rif = getText(txtRIF);
            telefono = getText(txtTelefono);
            aniosE = Integer.parseInt(getText(txtAniosE));
            profesion = getText(txtProfesion);
            nivelI = getText(txtNivelI);
            edad = Integer.parseInt(getText(txtEdad));
            
            modelo.actualizar(nombre, apellido, cedula, rif, edad, nivelI, profesion, aniosE, telefono);
            
            controlador.modificarEstilista(cedula,modelo);
            
            reiniciarValores();
            limpiarCajas();
            tablaEstilistas.setModel(this.controlador.cargarTabla());
        }
        
    }//GEN-LAST:event_ModificarMouseClicked

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
        tablaEstilistas.setModel(this.controlador.cargarTabla());
    }//GEN-LAST:event_VerListaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Estilista;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel NivelInstruccion;
    private javax.swing.JLabel Profesion;
    private javax.swing.JLabel RIF;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel VerLista;
    private javax.swing.JLabel aniosExperiencia;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel primerNombre;
    private javax.swing.JLabel segundoNombre;
    private javax.swing.JTable tablaEstilistas;
    private javax.swing.JTextField txtAniosE;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNivelI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPK;
    private javax.swing.JTextField txtProfesion;
    private javax.swing.JTextField txtRIF;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCajas(){
        txtAniosE.setText(null);
        txtCedula.setText(null);
        txtEdad.setText(null);
        txtApellido.setText(null);
        txtNombre.setText(null);
        txtRIF.setText(null);
        txtNivelI.setText(null);
        txtTelefono.setText(null);
        txtPK.setText(null);
        txtProfesion.setText(null);
    }
    
    //Devuelve el codigo de la opcion seleccionada en un combo
    public int getComboSelected(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = "";
        
        int guion = codigo.indexOf(" -");
        codigoFinal = codigo.substring(1, guion);
        
        return Integer.parseInt(codigoFinal);
    }
    
    public boolean txtVacio(JTextField txt){
        return (txt.getText().isEmpty());
         //   return true;
       // return false;
    }
    
    //Verifica si hay txtFields sin llenar
    public boolean cajasVacias(){
        if(txtVacio(txtNombre))
            return true;
        if(txtVacio(txtApellido))
            return true;
        if(txtVacio(txtCedula))
            return true;
        if(txtVacio(txtTelefono))
            return true;
        if(txtVacio(txtRIF))
            return true;
        if(txtVacio(txtAniosE))
            return true;
        if(txtVacio(txtProfesion))
            return true;        
        if(txtVacio(txtEdad))
            return true;        
        return false;
    }
    
    //Coloca en null los atributos de la empresa
    public void reiniciarValores(){
        nombre = null;
        apellido = null;
        cedula = null;
        aniosE = 0;
        nivelI = null; 
        profesion = null;
        edad = 0;
        telefono = null;
        rif = null;
    }
    
    //Devuelve el valor de un txtField
    public String getText(JTextField txt){
        return txt.getText();
    }
}
