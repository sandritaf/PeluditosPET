
package Vista;

import Controlador.C_Juridico;
import Controlador.C_Persona;
import Modelo.M_Juridico;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Juridico extends javax.swing.JPanel {
    
    M_Juridico modelo;
    C_Juridico controlador;
    C_Persona cPersona;
    String razonSocial, nombreGerente, rif, telefono, direccion, auxRIF, mision, tipo;
    
    public V_Juridico() {
        initComponents();
        controlador = new C_Juridico();
        cPersona = new C_Persona();
        
        if(controlador.getJuridicos() != null)
            tablaJuridicos.setModel(this.controlador.cargarTabla());
        
        limpiarCajas();
        reiniciarValores();
        reiniciarBotones();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Guardar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Juridico = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJuridicos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        RazonSocial = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        txtRIF = new javax.swing.JTextField();
        RIF = new javax.swing.JLabel();
        NivelInstruccion = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        txtNombreGerente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        Mision = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMision = new javax.swing.JTextArea();
        J = new javax.swing.JRadioButton();
        G = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();

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

        Juridico.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Juridico.setForeground(new java.awt.Color(255, 255, 255));
        Juridico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/empresa72.png"))); // NOI18N
        Juridico.setText("P. Juridica");
        Juridico.setFocusable(false);
        Juridico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Juridico.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(VerLista)
                    .addComponent(Limpiar)
                    .addComponent(Juridico)
                    .addComponent(Eliminar)
                    .addComponent(Modificar)
                    .addComponent(Guardar))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Juridico)
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

        tablaJuridicos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaJuridicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaJuridicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaJuridicosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaJuridicos);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        RazonSocial.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RazonSocial.setText("Razón Social");

        txtRazonSocial.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        Cedula.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Cedula.setText("Teléfono");

        txtRIF.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        RIF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RIF.setText("RIF");

        NivelInstruccion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NivelInstruccion.setText("Gerente");

        Direccion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Direccion.setText("Dirección");

        txtNombreGerente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        Mision.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Mision.setText("Misión");

        txtMision.setColumns(20);
        txtMision.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMision.setRows(5);
        jScrollPane3.setViewportView(txtMision);

        J.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(J);
        J.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        J.setText("J");

        G.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(G);
        G.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        G.setText("G");

        C.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(C);
        C.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        C.setText("C");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mision)
                    .addComponent(Direccion)
                    .addComponent(RazonSocial)
                    .addComponent(Cedula))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RIF)
                            .addComponent(NivelInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtRIF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(J)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C))))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RazonSocial)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RIF)
                    .addComponent(J)
                    .addComponent(G)
                    .addComponent(C))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cedula)
                    .addComponent(txtNombreGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NivelInstruccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Direccion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mision))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
        reiniciarValores();
        reiniciarBotones();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{            
            
            modelo = new M_Juridico();
            
            rif = getText(txtRIF);
            telefono = getText(txtTelefono);
            nombreGerente = getText(txtNombreGerente);
            razonSocial = getText(txtRazonSocial);
            direccion = txtDireccion.getText();
            mision = txtMision.getText();

            if(J.isSelected())
                tipo = "J";
            else if(C.isSelected())
                tipo = "C";
            else
                tipo = "G";
            
            modelo = new M_Juridico();
            
            if(modelo.esNumero(telefono) && modelo.esNumero(rif)){
                
                if(!cPersona.rifExiste(tipo+rif)){
                    
                    modelo = new M_Juridico(direccion, telefono, razonSocial, nombreGerente, rif, razonSocial);            
                    controlador.guardarJuridico(modelo, tipo);

                    reiniciarValores();
                    reiniciarBotones();
                    limpiarCajas();
                    tablaJuridicos.setModel(this.controlador.cargarTabla());

                }
                else{
                    JOptionPane.showMessageDialog(null, "El rif ingresado coincide con una persona ya registrada. Intente de nuevo");    
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Por favor ingrese los datos números de forma correcta");
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
        controlador.listarJuridicos();
    }//GEN-LAST:event_VerListaMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
            
            modelo = new M_Juridico();
            
            rif = getText(txtRIF);
            telefono = getText(txtTelefono);
            nombreGerente = getText(txtNombreGerente);
            razonSocial = getText(txtRazonSocial);
            direccion = txtDireccion.getText();
            //auxRIF = "J"+txtRIF.getText(); //nuevo rif
            mision = txtMision.getText();
    
            if(J.isSelected())
                tipo = "J";
            else if(C.isSelected())
                tipo = "C";
            else
                tipo = "G";
            
            if(modelo.esNumero(telefono) && modelo.esNumero(rif)){

                if((tipo+rif).equals(auxRIF)){
                    modificar();
                }
                else if(!cPersona.rifExiste(tipo+rif)){
                    modificar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "El rif ingresado coincide con una persona ya registrada. Intente de nuevo");    
                }                    
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Por favor ingrese los datos números de forma correcta");
            }
        }
        
    }//GEN-LAST:event_ModificarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        
//        if(getText(txtRIF).equals("")){
//            JOptionPane.showMessageDialog(null, "El campo de RIF debe estar lleno para realizar ésta acción");
//        }
//        else{                       
            controlador.eliminarJuridico(auxRIF);
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaJuridicos.setModel(this.controlador.cargarTabla());
//        }
        
    }//GEN-LAST:event_EliminarMouseClicked

    private void tablaJuridicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJuridicosMousePressed
        Modificar.setEnabled(true);
        Eliminar.setEnabled(true);
        Limpiar.setEnabled(true);
        Guardar.setEnabled(false);
        
        modelo = new M_Juridico();
        
        modelo = controlador.getPersona(tablaJuridicos.getValueAt(tablaJuridicos.getSelectedRow(), 0).toString());
        
        //System.out.println(tablaJuridicos.getValueAt(tablaJuridicos.getSelectedRow(), 0).toString());
        
        auxRIF = modelo.getRIF();
        txtRazonSocial.setText(modelo.getRazonSocial());
        txtRIF.setText(modelo.subString(1));
        txtTelefono.setText(modelo.getTelefono());
        txtNombreGerente.setText(modelo.getNombreGerente());
        txtDireccion.setText(modelo.getDireccion());
        txtMision.setText(modelo.getMision());
        
        switch (modelo.getRIF().charAt(0)) {
            case 'G':
                G.setSelected(true);
                J.setSelected(false);
                C.setSelected(false);
                break;
            case 'J':
                G.setSelected(false);
                J.setSelected(true);
                C.setSelected(false);
                break;
            default:
                G.setSelected(false);
                J.setSelected(false);
                C.setSelected(true);
                break;
        }
        
    }//GEN-LAST:event_tablaJuridicosMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton C;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JRadioButton G;
    private javax.swing.JLabel Guardar;
    private javax.swing.JRadioButton J;
    private javax.swing.JLabel Juridico;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Mision;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel NivelInstruccion;
    private javax.swing.JLabel RIF;
    private javax.swing.JLabel RazonSocial;
    private javax.swing.JLabel VerLista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaJuridicos;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextArea txtMision;
    private javax.swing.JTextField txtNombreGerente;
    private javax.swing.JTextField txtRIF;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    
    // Vacia todos los txtField de la ventana
    public void limpiarCajas(){
        txtRazonSocial.setText(null);
        txtRIF.setText(null);
        txtNombreGerente.setText(null);
        txtMision.setText(null);
        txtTelefono.setText(null);
        txtDireccion.setText(null);
        G.setSelected(false);
        J.setSelected(false);
        C.setSelected(false);
    }
    
    public String getRIF(String c){ 
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
        if(txtVacio(txtRazonSocial))
            return true;
        if(txtVacio(txtNombreGerente))
            return true;
        if(txtVacio(txtRazonSocial))
            return true;
        if(txtVacio(txtTelefono))
            return true;
        if(txtVacio(txtRIF))
            return true;
        if(txtDireccion.getText().isEmpty())
            return true;
        if(txtMision.getText().isEmpty())
            return true;
        if(!J.isSelected() && !G.isSelected() && !C.isSelected())
            return true;
        return false;
    }
    
    //Coloca en null los atributos de la empresa
    public void reiniciarValores(){
        mision = null;
        nombreGerente = null;
        razonSocial = null;
        direccion = null;
        telefono = null;
        rif = null;
        auxRIF = null;
        tipo = null;
    }
    
    public void reiniciarBotones(){
        Modificar.setEnabled(false);
        Eliminar.setEnabled(false);
        Guardar.setEnabled(true);
    }
    
    //Devuelve el valor de un txtField
    public String getText(JTextField txt){
        return txt.getText();
    }
    
    public void modificar(){
        modelo.actualizar(direccion, telefono, razonSocial, nombreGerente, rif, mision);
        //auxrif no tiene valor aquí
        controlador.modificarJuridico(auxRIF,modelo,tipo+rif);

        reiniciarValores();
        reiniciarBotones();
        limpiarCajas();
        tablaJuridicos.setModel(this.controlador.cargarTabla());
    }
    
}
