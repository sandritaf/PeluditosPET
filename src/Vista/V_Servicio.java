
package Vista;

import Controlador.C_Servicio;
import Modelo.M_Servicio;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Servicio extends javax.swing.JPanel {

    C_Servicio controlador;
    M_Servicio modelo;
    String nombre, viejoNombre, descripcion, observaciones, tipo;
    int precio;
    
    public V_Servicio() {
        initComponents();
        //txtPK.setVisible(false);
        controlador = new C_Servicio();
    
        reiniciarValores();
        reiniciarBotones();
        limpiarCajas();
        
        if(controlador.getServicios() != null)
            tablaServicios.setModel(controlador.cargarTabla());
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        PanelLateral = new javax.swing.JPanel();
        Guardar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Servicio = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Descripcion = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        Observaciones = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        TipoTrabajador = new javax.swing.JLabel();
        Veterinario = new javax.swing.JRadioButton();
        Estilista = new javax.swing.JRadioButton();

        PanelFondo.setBackground(new java.awt.Color(153, 204, 255));

        PanelLateral.setBackground(new java.awt.Color(102, 102, 102));
        PanelLateral.setPreferredSize(new java.awt.Dimension(145, 498));

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

        Servicio.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Servicio.setForeground(new java.awt.Color(255, 255, 255));
        Servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salud72.png"))); // NOI18N
        Servicio.setText("Servicio");
        Servicio.setFocusable(false);
        Servicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Servicio.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Guardar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Servicio)
                    .addComponent(Limpiar)
                    .addComponent(VerLista))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addComponent(Servicio)
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

        tablaServicios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaServiciosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaServicios);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        Nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Nombre.setText("Nombre");

        Descripcion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Descripcion.setText("Descripción");

        Precio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Precio.setText("Precio");

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Observaciones.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Observaciones.setText("Observaciones");

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtObservaciones.setRows(5);
        jScrollPane3.setViewportView(txtObservaciones);

        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        TipoTrabajador.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TipoTrabajador.setText("Trabajador");

        Veterinario.setBackground(new java.awt.Color(153, 204, 255));
        Veterinario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Veterinario.setText("Veterinario");

        Estilista.setBackground(new java.awt.Color(153, 204, 255));
        Estilista.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Estilista.setText("Estilista");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Descripcion)
                    .addComponent(Nombre)
                    .addComponent(Precio)
                    .addComponent(Observaciones)
                    .addComponent(TipoTrabajador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Veterinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Estilista))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDescripcion)
                        .addComponent(txtNombre)
                        .addComponent(txtPrecio)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Precio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Observaciones)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoTrabajador)
                    .addComponent(Veterinario)
                    .addComponent(Estilista))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(PanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
        
    }//GEN-LAST:event_VerListaMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
    
            nombre = getText(txtNombre);
            observaciones = txtObservaciones.getText();
            descripcion = txtDescripcion.getText();
            precio = Integer.parseInt(txtPrecio.getText());
            
            if(Veterinario.isSelected())
                tipo = "Veterinario";
            if(Estilista.isSelected())
                tipo = "Estilista";
            
            modelo = new M_Servicio(nombre, descripcion, observaciones, precio, tipo);
            controlador.guardarServicio(modelo);
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaServicios.setModel(controlador.cargarTabla());
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
            
            nombre = getText(txtNombre);
            observaciones = txtObservaciones.getText();
            descripcion = txtDescripcion.getText();
            precio = Integer.parseInt(txtPrecio.getText());
            if(Veterinario.isSelected())
                tipo = "Veterinario";
            if(Estilista.isSelected())
                tipo = "Estilista";
            
            modelo.actualizar(nombre, descripcion, observaciones, precio, tipo);
            if(viejoNombre!=null)
                controlador.modificarServicio(nombre, viejoNombre, modelo);
            else
                JOptionPane.showMessageDialog(null, "No hay viejoNombre");
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaServicios.setModel(controlador.cargarTabla());
        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void tablaServiciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaServiciosMousePressed
        modelo = controlador.getServicio(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), 0).toString());
        
        if(modelo != null){
            viejoNombre = modelo.getNombre(); System.out.println(viejoNombre);
            txtNombre.setText(modelo.getNombre()); 
            txtObservaciones.setText(modelo.getObservaciones());
            txtDescripcion.setText(modelo.getDescripción());
            txtPrecio.setText(Integer.toString(modelo.getPrecio()));
            
            if(modelo.getTipoTrabajador().equals("Veterinario"))
                Veterinario.setSelected(true);
            if(modelo.getTipoTrabajador().equals("Estilista"))
                Estilista.setSelected(true);
            
            Guardar.setEnabled(false);
            Modificar.setEnabled(true);
            Eliminar.setEnabled(true);
        }

    }//GEN-LAST:event_tablaServiciosMousePressed

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        
        if(txtVacio(txtNombre)){
            JOptionPane.showMessageDialog(null, "Debe llenar al menos el campo Nombre para realizar ésta acción");
        }
        else{
            
            nombre = getText(txtNombre);
            
            controlador.eliminarServicio(nombre);
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaServicios.setModel(controlador.cargarTabla());
        }
        
    }//GEN-LAST:event_EliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descripcion;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JRadioButton Estilista;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Observaciones;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Servicio;
    private javax.swing.JLabel TipoTrabajador;
    private javax.swing.JLabel VerLista;
    private javax.swing.JRadioButton Veterinario;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaServicios;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    
    
    private void reiniciarValores(){
        nombre = null;
        viejoNombre = null;
        descripcion = null;
        precio = 0;
        observaciones = null;
    }

    private void limpiarCajas(){
        Veterinario.setSelected(false);
        Estilista.setSelected(false);
        txtObservaciones.setText(null);
        txtDescripcion.setText(null);
        txtNombre.setText(null);
        txtPrecio.setText(null);
    }
    
    public boolean txtVacio(JTextField txt){
        if(txt.getText().isEmpty())
            return true;
        return false;
    }
    
    public boolean cajasVacias(){
        if(txtObservaciones.getText().isEmpty())
            return true;
        if(txtDescripcion.getText().isEmpty())
            return true;
        if(txtVacio(txtNombre))
            return true;
        if(txtVacio(txtPrecio))
            return true;
        if(!Estilista.isSelected() && !Veterinario.isSelected())
            return true;
        return false;
    }
    
    //Devuelve el valor de un txtField
    public String getText(JTextField txt){
        return txt.getText();
    }
    
    public void reiniciarBotones(){
        Guardar.setEnabled(true);
        Modificar.setEnabled(false);
        Eliminar.setEnabled(false);
    }
}
