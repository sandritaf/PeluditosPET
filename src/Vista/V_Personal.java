
package Vista;

import Controlador.C_Trabajador;
import Controlador.C_Persona;
import Modelo.M_Trabajador;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Personal extends javax.swing.JPanel {

    M_Trabajador modelo;
    C_Trabajador controlador;
    C_Persona cPersona;
    String nombre, apellido, cedula, rif, telefono, nivelI, profesion, auxCI, tipo;
    int edad, aniosE, precioTrabajo;
    
    public V_Personal() {
        initComponents();
        txtPK.setVisible(false);
        controlador = new C_Trabajador();
        cPersona = new C_Persona();
        
        reiniciarBotones();
        reiniciarValores();
        limpiarCajas();
        
        if(controlador.getTrabajadores() != null)
            tablaPersonal.setModel(controlador.cargarTabla());
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
        Personal = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        primerNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
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
        V = new javax.swing.JRadioButton();
        E = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();

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

        Personal.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Personal.setForeground(new java.awt.Color(255, 255, 255));
        Personal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/persona72.png"))); // NOI18N
        Personal.setText("Personal");
        Personal.setFocusable(false);
        Personal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Personal.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Guardar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Personal)
                    .addComponent(Limpiar)
                    .addComponent(VerLista))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Personal)
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

        tablaPersonal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaPersonalMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPersonal);

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

        Apellido.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Apellido.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        RIF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RIF.setText("RIF");

        txtAniosE.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtAniosE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAniosEActionPerformed(evt);
            }
        });

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
        Profesion.setText("Profesión");

        txtProfesion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtNivelI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Telefono.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Telefono.setText("Teléfono");

        V.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(V);
        V.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        V.setText("V");

        E.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(E);
        E.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        E.setText("E");

        P.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(P);
        P.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        P.setText("P");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aniosExperiencia)
                    .addComponent(NivelInstruccion)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(primerNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Cedula)
                    .addComponent(Telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNivelI)
                    .addComponent(txtAniosE)
                    .addComponent(txtTelefono)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P))
                    .addComponent(txtNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RIF)
                    .addComponent(Edad)
                    .addComponent(Profesion)
                    .addComponent(Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtRIF)
                    .addComponent(txtProfesion)
                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido)
                    .addComponent(txtPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(V)
                        .addComponent(E)
                        .addComponent(P))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cedula)
                        .addComponent(RIF)
                        .addComponent(txtRIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(Telefono))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
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
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
    
            modelo = new M_Trabajador();
            
            nombre = getText(txtNombre);
            apellido = getText(txtApellido);
            cedula = getText(txtCedula);
            rif = getText(txtRIF);
            telefono = getText(txtTelefono);
            aniosE = Integer.parseInt(getText(txtAniosE));
            profesion = getText(txtProfesion);
            nivelI = getText(txtNivelI);
            edad = Integer.parseInt(getText(txtEdad));

            if(V.isSelected())
                tipo = "V";
            else if(E.isSelected())
                tipo = "E";
            else
                tipo = "P";
            
            if(modelo.esNumero(cedula) && modelo.esNumero(telefono) && modelo.esNumero(rif)){

                if(!cPersona.personaExiste(tipo+cedula)){
                    
                    if(!cPersona.rifExiste(tipo+rif)){
                    
                        modelo = new M_Trabajador(nombre, apellido, cedula, rif, edad, nivelI, profesion, aniosE, telefono, precioTrabajo);
                        precioTrabajo = modelo.precioSegunAnios(aniosE);
                        modelo.setPrecioTrabajo(precioTrabajo);

                        controlador.guardarTrabajador(modelo,tipo);

                        reiniciarBotones();
                        reiniciarValores();
                        limpiarCajas();
                        tablaPersonal.setModel(this.controlador.cargarTabla());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El rif ingresado coincide con una persona ya registrada. Intente de nuevo");    
                    }                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "La cédula ingresada coincide con una persona ya registrada. Intente de nuevo");    
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Por favor ingrese los datos números de forma correcta");
            }
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        
        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
            
            modelo = new M_Trabajador();
            
            nombre = getText(txtNombre);
            apellido = getText(txtApellido);
            cedula = getText(txtCedula);
            rif = getText(txtRIF);
            telefono = getText(txtTelefono);
            aniosE = Integer.parseInt(getText(txtAniosE));
            profesion = getText(txtProfesion);
            nivelI = getText(txtNivelI);
            edad = Integer.parseInt(getText(txtEdad));
            precioTrabajo = modelo.precioSegunAnios(aniosE);
            
            if(V.isSelected())
                tipo = "V";
            else if(E.isSelected())
                tipo = "E";
            else
                tipo = "P";
            
            if(modelo.esNumero(cedula) && modelo.esNumero(telefono) && modelo.esNumero(rif)){

                // si no cambió la cédula
                if((tipo+cedula).equals(auxCI)){
                    modificar();
                }
                // si la cambió, y no existe
                else if(!cPersona.personaExiste(tipo+cedula)){
                    modificar();
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
            
            controlador.eliminarTrabajador(auxCI);
            
            reiniciarBotones();
            reiniciarValores();
            limpiarCajas();
            tablaPersonal.setModel(this.controlador.cargarTabla());
        }       
        
    }//GEN-LAST:event_EliminarMouseClicked

    private void tablaPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonalMousePressed
        Guardar.setEnabled(false);
        Modificar.setEnabled(true);
        Eliminar.setEnabled(true);
        
        modelo = controlador.getPersona(tablaPersonal.getValueAt(tablaPersonal.getSelectedRow(), 0).toString());
        
        auxCI = modelo.getCedula(); //System.out.println(auxCI);
        txtNombre.setText(modelo.getNombre());
        txtApellido.setText(modelo.getApellido());
        txtTelefono.setText(modelo.getTelefono());
        txtCedula.setText(modelo.subString(1));
        txtAniosE.setText(Integer.toString(modelo.getAniosExperiencia()));
        txtEdad.setText(Integer.toString(modelo.getEdad()));
        txtRIF.setText(modelo.getRIF());
        txtProfesion.setText(modelo.getProfesion());
        txtNivelI.setText(modelo.getNivelInstruccion());

        switch (modelo.getCedula().charAt(0)) {
            case 'V':
                V.setSelected(true);
                E.setSelected(false);
                P.setSelected(false);
                break;
            case 'E':
                V.setSelected(false);
                E.setSelected(true);
                P.setSelected(false);
                break;
            case 'P':
                V.setSelected(false);
                E.setSelected(false);
                P.setSelected(true);
                break;
        }
        
    }//GEN-LAST:event_tablaPersonalMousePressed

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtAniosEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAniosEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAniosEActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Cedula;
    private javax.swing.JRadioButton E;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel NivelInstruccion;
    private javax.swing.JRadioButton P;
    private javax.swing.JLabel Personal;
    private javax.swing.JLabel Profesion;
    private javax.swing.JLabel RIF;
    private javax.swing.JLabel Telefono;
    private javax.swing.JRadioButton V;
    private javax.swing.JLabel VerLista;
    private javax.swing.JLabel aniosExperiencia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel primerNombre;
    private javax.swing.JTable tablaPersonal;
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
        txtPK.setText(null);
        txtAniosE.setText(null);
        txtCedula.setText(null);
        txtEdad.setText(null);
        txtNombre.setText(null);
        txtRIF.setText(null);
        txtApellido.setText(null);
        txtNivelI.setText(null);
        txtProfesion.setText(null);
        txtTelefono.setText(null);
        txtPK.setText(null);
        V.setSelected(false);
        E.setSelected(false);
        P.setSelected(false);
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
        if(txt.getText().isEmpty())
            return true;
        return false;
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
        if(txtVacio(txtNivelI))
            return true;        
        if(txtVacio(txtEdad))
            return true;        
        if(!V.isSelected() && !E.isSelected() && !P.isSelected())
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
        auxCI = null;
        tipo = null;
    }
    
    public void reiniciarBotones(){
        Guardar.setEnabled(true);
        Modificar.setEnabled(false);
        Eliminar.setEnabled(false);
    }
    
    //Devuelve el valor de un txtField
    public String getText(JTextField txt){
        return txt.getText();
    }
    
    public void modificar(){
        if(!cPersona.rifExiste(tipo+rif)){

            modelo.actualizar(nombre, apellido, cedula, rif, edad, nivelI, profesion, aniosE, telefono, precioTrabajo);
            precioTrabajo = modelo.precioSegunAnios(aniosE);
            modelo.setPrecioTrabajo(precioTrabajo);

            controlador.modificarTrabajador(auxCI,tipo+cedula,modelo);

            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaPersonal.setModel(this.controlador.cargarTabla());
        }
        else{
            JOptionPane.showMessageDialog(null, "El rif ingresado coincide con una persona ya registrada. Intente de nuevo");    
        }
    }
    
}
