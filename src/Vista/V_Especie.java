package Vista;

import Controlador.C_Especie;
import Modelo.M_Especie;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Especie extends javax.swing.JPanel {

    M_Especie modelo, aux;
    C_Especie controlador;
    String especie, raza, nombreViejo;
    Menu m;
    
    public V_Especie() {
        initComponents();
        controlador = new C_Especie();
        reiniciarValores();
        limpiarCajas();
        
        if(controlador.getEspecies() != null)
            tablaEspecies.setModel(controlador.cargarTabla());
        
        controlador.cargarEspecies(cmbEspecieExistente);
        //setSize(m.getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Guardar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Especie = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtEspecie = new javax.swing.JTextField();
        Raza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AgregarEspecie = new javax.swing.JRadioButton();
        Existente = new javax.swing.JRadioButton();
        cmbEspecieExistente = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEspecies = new javax.swing.JTable();

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

        Especie.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Especie.setForeground(new java.awt.Color(255, 255, 255));
        Especie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/especie72.png"))); // NOI18N
        Especie.setText("Especie");
        Especie.setFocusable(false);
        Especie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Especie.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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
                    .addComponent(Especie)
                    .addComponent(Eliminar)
                    .addComponent(Modificar)
                    .addComponent(Guardar))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Especie)
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

        txtEspecie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Raza.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Raza.setText("Raza");

        txtRaza.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Verifique que la especie a ingresar no exista");

        AgregarEspecie.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(AgregarEspecie);
        AgregarEspecie.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AgregarEspecie.setText("Agregar Especie");
        AgregarEspecie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarEspecieMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AgregarEspecieMousePressed(evt);
            }
        });

        Existente.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(Existente);
        Existente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Existente.setText("Existente");
        Existente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExistenteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExistenteMousePressed(evt);
            }
        });

        cmbEspecieExistente.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(AgregarEspecie)
                        .addGap(4, 4, 4)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Existente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEspecieExistente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Raza)
                        .addGap(4, 4, 4)
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarEspecie)
                    .addComponent(Existente)
                    .addComponent(cmbEspecieExistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Raza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaEspecies.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaEspecies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Especie", "Razas Existentes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaEspecies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaEspeciesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaEspecies);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");            
        }
        else{
            
            raza = getText(txtRaza);
            
            if(AgregarEspecie.isSelected()){
                especie = getText(txtEspecie);
                modelo = new M_Especie(especie, raza);
                controlador.guardarEspecie(especie,raza);
            }
                
            if(Existente.isSelected()){
                especie = getComboSelected(cmbEspecieExistente);
                modelo = new M_Especie(especie);
                controlador.modificarEspecie(especie,especie, raza);                
            }
                
            reiniciarValores();
            limpiarCajas();
            tablaEspecies.setModel(controlador.cargarTabla());
        }
    
    }//GEN-LAST:event_GuardarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");            
        }
        else{
            
            raza = getText(txtRaza);
            
            if(AgregarEspecie.isSelected()){
                especie = getText(txtEspecie);
                modelo = new M_Especie();
                controlador.modificarEspecie(nombreViejo, especie, raza);// guardarEspecie(especie,raza);
            }
                
            if(Existente.isSelected()){
                especie = getComboSelected(cmbEspecieExistente);
                modelo = new M_Especie();
                controlador.modificarEspecie(nombreViejo,especie, raza);                
            }
                
            reiniciarValores();
            limpiarCajas();
            tablaEspecies.setModel(controlador.cargarTabla());
        } 
        

    }//GEN-LAST:event_ModificarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
            
        if(getText(txtEspecie).isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");            
        }
        else{
            
            if(AgregarEspecie.isSelected()){
                especie = getText(txtEspecie);
            }
            if(Existente.isSelected()){
                especie = getComboSelected(cmbEspecieExistente);
            }
            
           //controlador.eliminarEspecie(especie);
            
            reiniciarValores();
            limpiarCajas();
            tablaEspecies.setModel(controlador.cargarTabla());
//            controlador.imprimir();
        }
        
    }//GEN-LAST:event_EliminarMouseClicked

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
        controlador.listarEspecies();
    }//GEN-LAST:event_VerListaMouseClicked

    private void AgregarEspecieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarEspecieMouseClicked
        cmbEspecieExistente.setEnabled(false);
        txtEspecie.setEnabled(true);
    }//GEN-LAST:event_AgregarEspecieMouseClicked

    private void ExistenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExistenteMouseClicked
        txtEspecie.setEnabled(false);
        cmbEspecieExistente.setEnabled(true);
    }//GEN-LAST:event_ExistenteMouseClicked

    private void AgregarEspecieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarEspecieMousePressed
       cmbEspecieExistente.setEnabled(false);
        txtEspecie.setEnabled(true);
    }//GEN-LAST:event_AgregarEspecieMousePressed

    private void ExistenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExistenteMousePressed
        txtEspecie.setEnabled(false);
        cmbEspecieExistente.setEnabled(true);
    }//GEN-LAST:event_ExistenteMousePressed

    private void tablaEspeciesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEspeciesMousePressed
        Guardar.setEnabled(false);        // TODO add your handling code here:
        Modificar.setEnabled(true);
        Eliminar.setEnabled(true);

        AgregarEspecie.setEnabled(false);
        Existente.setEnabled(false);
        
        txtEspecie.setEnabled(true);
        
        modelo = controlador.getEspecie(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString());
        
        nombreViejo = modelo.getNombre();
        txtEspecie.setText(nombreViejo);
    }//GEN-LAST:event_tablaEspeciesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AgregarEspecie;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Especie;
    private javax.swing.JRadioButton Existente;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Raza;
    private javax.swing.JLabel VerLista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbEspecieExistente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEspecies;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private void limpiarCajas(){
        txtEspecie.setText(null);
        txtRaza.setText(null);
        controlador.cargarEspecies(cmbEspecieExistente);
        cmbEspecieExistente.setSelectedItem(0);
        cmbEspecieExistente.setEnabled(false);
        txtEspecie.setEnabled(false);
        Guardar.setEnabled(true);
        Eliminar.setEnabled(false);
        Modificar.setEnabled(false);
    }
    
    //Devuelve el codigo de la opcion seleccionada en un combo
    public int getIDComboSelected(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = "";
        
        int guion = codigo.indexOf(" -");
        codigoFinal = codigo.substring(1, guion);
        
        return Integer.parseInt(codigoFinal);
    }
    //Devuelve el codigo de la opcion seleccionada en un combo
    public String getComboSelected(JComboBox combito){
        return combito.getSelectedItem().toString();
    }
    
    public boolean txtVacio(JTextField txt){
        return (txt.getText().isEmpty());
    }
    
    //Verifica si hay txtFields sin llenar
    public boolean cajasVacias(){
        if(txtVacio(txtRaza))      
            return true;
        // si se seleccionó especie pero no se escribió nada en el txtField
        if(AgregarEspecie.isSelected() && !Existente.isSelected()){
            if(txtVacio(txtEspecie))
                return true;
        }
        // si no se seleccionó ninguna opción
        if(!AgregarEspecie.isSelected() && !Existente.isSelected()){
            return true;
        }
        return false;
    }
    
    //Coloca en null los atributos de la empresa
    public void reiniciarValores(){
        especie = null;
        raza = null;
        nombreViejo = null;
    }
    
    //Devuelve el valor de un txtField
    public String getText(JTextField txt){
        return txt.getText();
    }
}
