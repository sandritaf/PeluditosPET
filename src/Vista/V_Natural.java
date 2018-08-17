
package Vista;

import Controlador.C_Natural;
import Controlador.C_Persona;
import Modelo.M_Natural;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Natural extends javax.swing.JPanel {

    M_Natural modelo;
    C_Natural controlador;
    C_Persona cPersona;
    String nombre, apellido, cedula, telefono, direccion, auxCI;
    
    public V_Natural() {
        initComponents();
        controlador = new C_Natural();
        cPersona = new C_Persona();
        reiniciarValores();
        tablaNaturales.setModel(controlador.cargarTabla());
        limpiarCajas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Guardar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Natural = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNaturales = new javax.swing.JTable();

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

        Natural.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Natural.setForeground(new java.awt.Color(255, 255, 255));
        Natural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/prop72.png"))); // NOI18N
        Natural.setText("P. Natural");
        Natural.setFocusable(false);
        Natural.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Natural.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(VerLista)
                    .addComponent(Limpiar)
                    .addComponent(Natural)
                    .addComponent(Eliminar)
                    .addComponent(Modificar)
                    .addComponent(Guardar))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Natural)
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

        Nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Nombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtCedula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        Cedula.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Cedula.setText("Cédula");

        Apellido.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Apellido.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Telefono.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Telefono.setText("Teléfono");

        Direccion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Direccion.setText("Dirección");

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Direccion)
                    .addComponent(Nombre)
                    .addComponent(Cedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(txtCedula))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido)
                            .addComponent(Telefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cedula)
                    .addComponent(Telefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Direccion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaNaturales.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaNaturales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaNaturales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaNaturalesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaNaturales);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
        reiniciarValores();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked

        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{      
            
            modelo = new M_Natural();
            
            nombre = getText(txtNombre);
            apellido = getText(txtApellido);
            telefono = getText(txtTelefono);
            cedula = getText(txtCedula); //Hay que verificar que no exista
            direccion = txtDireccion.getText();
            
            if(modelo.esNumero(cedula) && modelo.esNumero(telefono)){
                
                if(!cPersona.personaExiste("V"+cedula)){
                    
                    modelo = new M_Natural(direccion, telefono, nombre, apellido, cedula);            
                    controlador.guardarNatural(modelo);

                    reiniciarValores();
                    limpiarCajas();
                    tablaNaturales.setModel(this.controlador.cargarTabla());
                }
                else{
                    JOptionPane.showMessageDialog(null, "La cédula ingresada coincide con una persona ya registrada. Intente de nuevo");    
                }

            }
            else
                JOptionPane.showMessageDialog(null, "Por favor ingrese los datos números de forma correcta");                
        }
        
    }//GEN-LAST:event_GuardarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked

        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{      
            
            modelo = new M_Natural();
            
            nombre = getText(txtNombre);
            apellido = getText(txtApellido);
            telefono = getText(txtTelefono);
            cedula = getText(txtCedula);
            direccion = txtDireccion.getText();
            
            if(modelo.esNumero(cedula) && modelo.esNumero(telefono)){

                if(!cPersona.personaExiste("V"+cedula)){
                
                    modelo.actualizar(direccion, telefono, nombre, apellido, cedula);            
                    controlador.modificarNatural(auxCI,"V"+cedula,modelo);

                    reiniciarValores();
                    limpiarCajas();
                    tablaNaturales.setModel(this.controlador.cargarTabla());
                }
                else{
                    JOptionPane.showMessageDialog(null, "La cédula ingresada coincide con una persona ya registrada. Intente de nuevo");    
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Por favor ingrese los datos números de forma correcta");
            }
                
        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        
        if(getText(txtCedula).equals("")){
            JOptionPane.showMessageDialog(null, "El campo de Cedula debe estar lleno para realizar ésta acción");
        }
        else{
    
            controlador.eliminarNatural(auxCI);
            
            reiniciarValores();
            limpiarCajas();
            tablaNaturales.setModel(this.controlador.cargarTabla());
        }

    }//GEN-LAST:event_EliminarMouseClicked

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
        controlador.listarNaturales();
        tablaNaturales.setModel(controlador.cargarTabla());
    }//GEN-LAST:event_VerListaMouseClicked

    private void tablaNaturalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNaturalesMousePressed
        Modificar.setEnabled(true);
        Eliminar.setEnabled(true);
        Limpiar.setEnabled(true);
        Guardar.setEnabled(false);
        
        modelo = controlador.getPersona(tablaNaturales.getValueAt(tablaNaturales.getSelectedRow(), 0).toString());
        
        auxCI = modelo.getCedula();
        txtNombre.setText(modelo.getNombre());
        txtApellido.setText(modelo.getApellido());
        txtTelefono.setText(modelo.getTelefono());
        txtCedula.setText(modelo.subString(1));
        txtDireccion.setText(modelo.getDireccion());
        
    }//GEN-LAST:event_tablaNaturalesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Natural;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel VerLista;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaNaturales;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void limpiarCajas(){
        txtCedula.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtTelefono.setText(null);
        txtDireccion.setText(null);
        txtTelefono.setText(null);
        Guardar.setEnabled(true);
        Eliminar.setEnabled(false);
        Modificar.setEnabled(false);
    }
    
    public String getCedula(String c){ 
        String codigoFinal = "";        
        int guion = c.length();
        codigoFinal = c.substring(1, guion);
        
        return codigoFinal;
    }
    
    public boolean txtVacio(JTextField txt){
        return (txt.getText().isEmpty());
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
        if(txtDireccion.getText().isEmpty())
            return true;
        return false;
    }
    
    //Coloca en null los atributos de la empresa
    public void reiniciarValores(){
        Modificar.setEnabled(false);
        Eliminar.setEnabled(false);
        Limpiar.setEnabled(false);
        Guardar.setEnabled(true);
        nombre = null;
        apellido = null;
        direccion = null;
        telefono = null;
        cedula = null;
        auxCI = null;
    }
    
    //Devuelve el valor de un txtField
    public String getText(JTextField txt){
        return txt.getText();
    }
    
}
