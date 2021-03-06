package Vista;

import Controlador.C_Juridico;
import Controlador.C_Mascota;
import Controlador.C_Natural;
import Controlador.C_Propietario;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Mascota extends javax.swing.JPanel {
    
    M_Mascota modelo;
    C_Mascota controlador;
    C_Propietario controladorDueno;
    String id, nombre, raza, especie, observaciones, auxID, auxNombre, auxObservaciones, sexo;
    int edad, codigo;
    
    public V_Mascota() {
        initComponents();
        
        controlador = new C_Mascota();        
        controlador.cargarDuenos(cmbDueno);
        controlador.cargarEspecies(cmbEspecie);

        if(controlador.getNumMascotasExistentes() > 0)
            tablaMascotas.setModel(this.controlador.cargarTabla());

        reiniciarValores();
        reiniciarBotones();
        limpiarCajas();
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
        Mascota = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Especie = new javax.swing.JLabel();
        cmbEspecie = new javax.swing.JComboBox<>();
        Raza = new javax.swing.JLabel();
        cmbRaza = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        Edad = new javax.swing.JLabel();
        Observaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        Dueno = new javax.swing.JLabel();
        cmbDueno = new javax.swing.JComboBox<>();
        Dueno1 = new javax.swing.JLabel();
        Femenino = new javax.swing.JRadioButton();
        Masculino = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();

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

        Mascota.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Mascota.setForeground(new java.awt.Color(255, 255, 255));
        Mascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/perro72.png"))); // NOI18N
        Mascota.setText("Mascota");
        Mascota.setFocusable(false);
        Mascota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Mascota.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Mascota)
                    .addComponent(Guardar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Limpiar)
                    .addComponent(VerLista))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Mascota)
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

        Nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Nombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Especie.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Especie.setText("Especie");

        cmbEspecie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbEspecie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEspecieItemStateChanged(evt);
            }
        });

        Raza.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Raza.setText("Raza");

        cmbRaza.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtEdad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Edad.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Edad.setText("Edad");

        Observaciones.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Observaciones.setText("Observaciones");

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        Dueno.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Dueno.setText("Dueño");

        Dueno1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Dueno1.setText("Sexo");

        Femenino.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(Femenino);
        Femenino.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Femenino.setSelected(true);
        Femenino.setText("F");

        Masculino.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(Masculino);
        Masculino.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Masculino.setText("M");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Especie)
                    .addComponent(Raza)
                    .addComponent(Edad)
                    .addComponent(Nombre)
                    .addComponent(Observaciones)
                    .addComponent(Dueno)
                    .addComponent(Dueno1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(cmbRaza, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEspecie, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbDueno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Femenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Masculino)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Especie)
                    .addComponent(cmbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Raza)
                    .addComponent(cmbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Observaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dueno)
                    .addComponent(cmbDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dueno1)
                    .addComponent(Femenino)
                    .addComponent(Masculino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaMascotas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMascotasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaMascotas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para guardar");
        }
        else{                    

            if (esNumero(getText(txtEdad))){
                edad = Integer.parseInt(getText(txtEdad));
            } else {
                edad = -1;
            }
            
            id = getCedulaCombo(cmbDueno);
            nombre = getText(txtNombre);
            especie = getTextCombo(cmbEspecie);
            raza = getTextCombo(cmbRaza);
            observaciones = txtObservaciones.getText();
            
            if(Femenino.isSelected())
                sexo = "F";
            if(Masculino.isSelected())
                sexo = "M";
            
            if (id != null && id != "" && edad > -1){
                modelo = new M_Mascota(controlador.getNumMascotasExistentes()+1,id, nombre, especie, raza, edad, observaciones, sexo);
                controlador.guardarMascota(modelo,obtenerDueno(cmbDueno));
                reiniciarValores();
                reiniciarBotones();
                limpiarCajas();
                tablaMascotas.setModel(this.controlador.cargarTabla());
            } else JOptionPane.showMessageDialog(null, "´La información debe estar ompleta y correcta para guardar");
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
        controlador.listarMascotas();    // TODO add your handling code here:
    }//GEN-LAST:event_VerListaMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para guardar");
        }
        else{               
            
            id = getCedulaCombo(cmbDueno);
            nombre = getText(txtNombre);
            edad = Integer.parseInt(getText(txtEdad));
            especie = getTextCombo(cmbEspecie);
            raza = getTextCombo(cmbRaza);
            observaciones = txtObservaciones.getText();
            
            if(Femenino.isSelected())
                sexo = "F";
            if(Masculino.isSelected())
                sexo = "M";
            
            modelo.actualizar(codigo,id, nombre, especie, raza, edad, observaciones,obtenerDueno(cmbDueno), sexo);
            
            controlador.modificarMascota(codigo,auxID,auxNombre, modelo,id,controlador.buscarDueno(auxID,auxNombre));
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaMascotas.setModel(this.controlador.cargarTabla());
        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void tablaMascotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMascotasMousePressed
        txtNombre.setText(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 2).toString());
        txtEdad.setText(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 5).toString());
        txtObservaciones.setText(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 6).toString());
        
        controlador.setCodigoComboSelected(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 1).toString(), cmbDueno);
        controlador.setComboSelected(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 3).toString(), cmbEspecie);
        controlador.setComboSelected(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 4).toString(), cmbRaza);
       
        codigo = Integer.parseInt(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0).toString());
        
        auxID = tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 1).toString();
        auxNombre = txtNombre.getText();
        auxObservaciones = txtObservaciones.getText();
        
        modelo = new M_Mascota();
        modelo = controlador.getMascota(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0).toString(), getCedulaCombo(cmbDueno));
        
        if(modelo.getSexo().equals("F")){
            Femenino.setSelected(true);
            Masculino.setSelected(false);
        }
        if(modelo.getSexo().equals("M")){
            Masculino.setSelected(true);
            Femenino.setSelected(false);
        }
        
        Guardar.setEnabled(false);
        Modificar.setEnabled(true);
        Eliminar.setEnabled(true);

    }//GEN-LAST:event_tablaMascotasMousePressed

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para guardar");
        }
        else{     
            id = getCedulaCombo(cmbDueno);
            nombre = getText(txtNombre);
            
            controlador.eliminarMascota(codigo,id,nombre,obtenerDueno(cmbDueno));
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaMascotas.setModel(this.controlador.cargarTabla());
        }
    }//GEN-LAST:event_EliminarMouseClicked

    private void cmbEspecieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEspecieItemStateChanged
        controlador.cargarRazas(cmbRaza, getTextCombo(cmbEspecie));
    }//GEN-LAST:event_cmbEspecieItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dueno;
    private javax.swing.JLabel Dueno1;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Especie;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Mascota;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Observaciones;
    private javax.swing.JLabel Raza;
    private javax.swing.JLabel VerLista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDueno;
    private javax.swing.JComboBox<String> cmbEspecie;
    private javax.swing.JComboBox<String> cmbRaza;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaMascotas;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

    
    private M_Propietario obtenerDueno(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = "";        
        int guion = codigo.indexOf(" -");
        codigoFinal = codigo.substring(0, guion);
        
        C_Juridico controladorJuridico = new C_Juridico();
        M_Juridico dueno = controladorJuridico.getPersona(codigoFinal);
        if (dueno != null)
            return dueno;
        else {
            C_Natural controladorNatural = new C_Natural();
            M_Natural dueno2 = controladorNatural.getPersona(codigoFinal);
            return dueno2;
        }        
    }
    
    private void limpiarCajas(){
        Femenino.setSelected(false);
        Masculino.setSelected(false);
        txtNombre.setText(null);
        txtEdad.setText(null);
        txtObservaciones.setText(null);
//        cmbDueno.setSelectedIndex(0);
//        cmbEspecie.setSelectedIndex(0);
//        cmbRaza.setSelectedIndex(0);
    }
    
    //Devuelve el codigo de la opcion seleccionada en un combo
    public String getCedulaCombo(JComboBox combito){
        String codigoFinal = "";
        if (combito.getItemCount()>0){
            String codigo = combito.getSelectedItem().toString(); 
            int guion = codigo.indexOf(" -");
            codigoFinal = codigo.substring(0, guion);
        }
        return codigoFinal;
    }
    
    public boolean txtVacio(JTextField txt){
        if(txt.getText().isEmpty())
            return true;
        return false;
    }
    
    public boolean cajasVacias(){
        if(txtVacio(txtNombre))
            return true;
        if(txtVacio(txtEdad))
            return true;
        if(txtObservaciones.getText().isEmpty())
            return true;
        if(!Femenino.isSelected() && !Masculino.isSelected())
            return true;
        if(cmbEspecie.getItemCount() < 1 || cmbRaza.getItemCount() < 1)
            return true;
        return false;
    }
    
    public void reiniciarValores(){
        id = null;
        nombre = null;
        raza = null;
        observaciones = null;
        especie = null;
        edad = 0;
        auxID = null;
        auxNombre = null;
        auxObservaciones = null;
        codigo = 0;
        sexo = null;
    }
     
    public String getText(JTextField txt){
        return txt.getText();
    }
    
    public String getTextCombo(JComboBox cmb){
        return (String) cmb.getSelectedItem();
    }
    
    public void reiniciarBotones(){
        Guardar.setEnabled(true);
        Eliminar.setEnabled(false);
        Modificar.setEnabled(false);
    }

    public boolean datosCompletos(){
        return false;
    }
    
    public boolean esNumero(String cadena){
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            System.out.println("Tratando de averiguar si es numero: "+cadena+", capturada excepcion: "+excepcion);
            return false;
        }
    }
}
