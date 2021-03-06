
package Vista;

import Controlador.C_Veterinario;
import Controlador.C_Persona;
import Modelo.M_Veterinario;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Veterinario extends javax.swing.JPanel {

    private M_Veterinario modelo;
    private C_Veterinario controlador;
    private C_Persona cPersona;
    private String nombre, apellido, cedula, rif, telefono, nivelI, profesion, universidad, especializacion, auxCI, tipo;
    private int edad, aniosE, precioTrabajo;
    
    public V_Veterinario() {
        initComponents();
        controlador = new C_Veterinario();
        cPersona = new C_Persona();
        
        if(controlador.getVeterinarios() != null)
            tablaVeterinarios.setModel(this.controlador.cargarTabla());
        
        limpiarCajas();
        reiniciarValores();
        reiniciarBotones();
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
        Veterinario = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
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
        Universidad = new javax.swing.JLabel();
        txtUniversidad = new javax.swing.JTextField();
        Especializacion = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNivelI = new javax.swing.JTextField();
        txtEspecializacion = new javax.swing.JTextField();
        V = new javax.swing.JRadioButton();
        E = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVeterinarios = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

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

        Veterinario.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Veterinario.setForeground(new java.awt.Color(255, 255, 255));
        Veterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/doctora72.png"))); // NOI18N
        Veterinario.setText("Veterinario");
        Veterinario.setFocusable(false);
        Veterinario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Veterinario.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Veterinario)
                    .addComponent(Guardar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Limpiar)
                    .addComponent(VerLista))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Veterinario)
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

        Universidad.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Universidad.setText("Universidad");

        txtUniversidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Especializacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Especializacion.setText("Especialización");

        Telefono.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Telefono.setText("Teléfono");

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtNivelI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtEspecializacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aniosExperiencia)
                    .addComponent(NivelInstruccion)
                    .addComponent(Universidad)
                    .addComponent(Especializacion)
                    .addComponent(Nombre)
                    .addComponent(Cedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAniosE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtNivelI, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUniversidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEspecializacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(V)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RIF)
                    .addComponent(Edad)
                    .addComponent(Profesion)
                    .addComponent(Telefono)
                    .addComponent(Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProfesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRIF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(V)
                        .addComponent(E)
                        .addComponent(P))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cedula)
                        .addComponent(txtRIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RIF)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aniosExperiencia)
                        .addComponent(txtAniosE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Edad))
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelInstruccion)
                    .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivelI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Profesion))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Universidad)
                        .addComponent(txtUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Telefono)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Especializacion)
                    .addComponent(txtEspecializacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tablaVeterinarios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaVeterinarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVeterinarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaVeterinariosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaVeterinarios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
       
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
       
    }//GEN-LAST:event_txtEdadActionPerformed

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        
        if(cajasVacias()){
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }else{
    
            modelo = new M_Veterinario();
            
            nombre = getText(txtNombre);
            apellido = getText(txtApellido);
            cedula = getText(txtCedula);
            rif = getText(txtRIF);
            telefono = getText(txtTelefono);
            aniosE = Integer.parseInt(getText(txtAniosE));
            profesion = getText(txtProfesion);
            nivelI = getText(txtNivelI);
            edad = Integer.parseInt(getText(txtEdad));
            universidad = getText(txtUniversidad);
            especializacion = getText(txtEspecializacion);
            
            if(V.isSelected())
                tipo = "V";
            else if(E.isSelected())
                tipo = "E";
            else
                tipo = "P";
            
            if(modelo.esNumero(telefono) && modelo.esNumero(cedula) && modelo.esNumero(rif)){                
                
                if(!cPersona.personaExiste(tipo+cedula)){

                    if(!cPersona.rifExiste(tipo+rif)){
                    
                        modelo = new M_Veterinario(especializacion, universidad, nombre, apellido, cedula, rif, edad, nivelI, profesion, aniosE, telefono, precioTrabajo);
                        controlador.guardarVeterinario(modelo, tipo);

                        reiniciarValores();
                        reiniciarBotones();
                        limpiarCajas();
                        tablaVeterinarios.setModel(this.controlador.cargarTabla());
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
            
            modelo = new M_Veterinario();
            
            nombre = getText(txtNombre);
            apellido = getText(txtApellido);
            cedula = getText(txtCedula);
            rif = getText(txtRIF);
            telefono = getText(txtTelefono);
            aniosE = Integer.parseInt(getText(txtAniosE));
            profesion = getText(txtProfesion);
            nivelI = getText(txtNivelI);
            edad = Integer.parseInt(getText(txtEdad));
            universidad = getText(txtUniversidad);
            especializacion = getText(txtEspecializacion);
            precioTrabajo = modelo.precioSegunAnios(aniosE);
            
            if(V.isSelected())
                tipo = "V";
            else if(E.isSelected())
                tipo = "E";
            else
                tipo = "P";
            
            if(modelo.esNumero(telefono) && modelo.esNumero(cedula) && modelo.esNumero(rif)){
            
                // Si no modificó la cédula
                if((tipo+cedula).equals(auxCI)){
                    modificar();
                }                
                // Si la modificó y no existe
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
            
            controlador.eliminarVeterinario(auxCI);
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaVeterinarios.setModel(this.controlador.cargarTabla());
        }
        
    }//GEN-LAST:event_EliminarMouseClicked

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
        tablaVeterinarios.setModel(this.controlador.cargarTabla());
    }//GEN-LAST:event_VerListaMouseClicked

    private void tablaVeterinariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVeterinariosMousePressed
        Guardar.setEnabled(false);
        Modificar.setEnabled(true);
        Eliminar.setEnabled(true);
        
        modelo = new M_Veterinario();
        modelo = controlador.getPersona(tablaVeterinarios.getValueAt(tablaVeterinarios.getSelectedRow(), 0).toString());
        
        auxCI = modelo.getCedula();
        txtNombre.setText(modelo.getNombre());
        txtRIF.setText(modelo.getRIF());
        txtTelefono.setText(modelo.getTelefono());
        txtApellido.setText(modelo.getApellido());
        txtUniversidad.setText(modelo.getUniversidad());
        txtProfesion.setText(modelo.getProfesion());
        txtEspecializacion.setText(modelo.getEspecializacion());
        txtEdad.setText(Integer.toString(modelo.getEdad()));
        txtNivelI.setText(modelo.getNivelInstruccion());
        txtAniosE.setText(Integer.toString(modelo.getAniosExperiencia()));
        txtCedula.setText(modelo.subString(1));
        
        switch (modelo.getCedula().charAt(0)) {
            case 'V':
                V.setSelected(true);
                E.setSelected(false);
                P.setSelected(false);
                break;
            case 'E':
                V.setSelected(false);
                P.setSelected(false);
                E.setSelected(true);
                break;
            case 'P':
                V.setSelected(false);
                E.setSelected(false);  
                P.setSelected(true);
                break;
        }
        
    }//GEN-LAST:event_tablaVeterinariosMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Cedula;
    private javax.swing.JRadioButton E;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Especializacion;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel NivelInstruccion;
    private javax.swing.JLabel Nombre;
    private javax.swing.JRadioButton P;
    private javax.swing.JLabel Profesion;
    private javax.swing.JLabel RIF;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Universidad;
    private javax.swing.JRadioButton V;
    private javax.swing.JLabel VerLista;
    private javax.swing.JLabel Veterinario;
    private javax.swing.JLabel aniosExperiencia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaVeterinarios;
    private javax.swing.JTextField txtAniosE;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecializacion;
    private javax.swing.JTextField txtNivelI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesion;
    private javax.swing.JTextField txtRIF;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUniversidad;
    // End of variables declaration//GEN-END:variables
    
    private void reiniciarBotones(){
        Guardar.setEnabled(true);
        Modificar.setEnabled(false);
        Eliminar.setEnabled(false);
    }
    
    private void limpiarCajas(){
        txtAniosE.setText(null);
        txtCedula.setText(null);
        txtEdad.setText(null);
        txtNombre.setText(null);
        txtRIF.setText(null);
        txtApellido.setText(null);
        txtUniversidad.setText(null);
        txtEspecializacion.setText(null);
        txtNivelI.setText(null);
        txtProfesion.setText(null);
        txtTelefono.setText(null);
        V.setSelected(false);
        E.setSelected(false);
        P.setSelected(false);
        reiniciarBotones();
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
        if(txtVacio(txtTelefono))
            return true;        
        if(txtVacio(txtEspecializacion))
            return true;        
        if(txtVacio(txtUniversidad))
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
        universidad = null;
        especializacion = null;
        precioTrabajo = 0;
        auxCI = null;
        tipo = null;
    }
    
    //Devuelve el valor de un txtField
    public String getText(JTextField txt){
        return txt.getText();
    }
    
    public void modificar(){
        if(!cPersona.rifExiste(tipo+rif)){

            modelo.actualizar(especializacion, universidad, nombre, apellido, cedula, rif, edad, nivelI, profesion, aniosE, telefono, precioTrabajo);
            
            controlador.modificarVeterinario(auxCI, tipo+cedula, modelo);
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaVeterinarios.setModel(this.controlador.cargarTabla());
        }
        else{
            JOptionPane.showMessageDialog(null, "El rif ingresado coincide con una persona ya registrada. Intente de nuevo");
        }
    }
    
}
