
package Vista;

import Controlador.C_Cita;
import Controlador.C_Factura;
import Controlador.C_Fecha;
import Controlador.C_Juridico;
import Controlador.C_Mascota;
import Controlador.C_Natural;
import Controlador.C_Trabajador;
import Modelo.M_Cita;
import Modelo.M_Factura;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class V_Factura extends javax.swing.JPanel {

    M_Factura modelo, modeloAux;
    C_Factura controlador;
    C_Mascota cMascota;
    C_Juridico cJuridico;
    C_Natural cNatural;
    C_Trabajador cTrabajador;
    C_Cita cCita;
    C_Fecha cFecha;
    M_Cita mCita;
    String cliente, modoPago, trabajador;
    float iva, subtotal, total;
    int id, idcita;
    Date fecha, fechaCita;
    
    public V_Factura() {
        initComponents();
        controlador = new C_Factura();
        cNatural = new C_Natural();
        cJuridico = new C_Juridico();
        cTrabajador = new C_Trabajador();
        cMascota = new C_Mascota();
        cCita = new C_Cita();
        cFecha = new C_Fecha();
  
        cTrabajador.cargarTrabajadores(cmbTrabajador);
        //cMascota.cargarDuenosSinID(cmbDueño);
        cCita.cargarCitasSinCancelar(cmbCitaSinCancelar);
        
        if(controlador.getFacturas() != null){
            tablaFacturas.setModel(controlador.cargarTabla());
        }
        
        //txtPK.setVisible(false);
        reiniciarValores();
        reiniciarBotones();
        limpiarCajas();
//        cargarValores();
    //    controlador.eliminarFactura(1);
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
        Juridico = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        VerLista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        NombreCliente = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        ModoPago = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        Subtotal = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        cmbModoPago = new javax.swing.JComboBox<>();
        Representante = new javax.swing.JRadioButton();
        Dueño = new javax.swing.JRadioButton();
        Cita = new javax.swing.JLabel();
        cmbCitaSinCancelar = new javax.swing.JComboBox<>();
        Trabajador = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        FechaCita = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        txtPK = new javax.swing.JTextField();
        cmbTrabajador = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        txtPKCita = new javax.swing.JTextField();
        txtDueño = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

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
        Juridico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/factura722.png"))); // NOI18N
        Juridico.setText("Factura");
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
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(VerLista)
                    .addComponent(Limpiar)
                    .addComponent(Juridico)
                    .addComponent(Eliminar)
                    .addComponent(Modificar)
                    .addComponent(Guardar))
                .addContainerGap(37, Short.MAX_VALUE))
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

        tablaFacturas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaFacturasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaFacturas);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        NombreCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NombreCliente.setText("Nombre Cliente");

        txtRepresentante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        ModoPago.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ModoPago.setText("Modo de Pago");

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Subtotal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Subtotal.setText("Subtotal");

        Total.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Total.setText("Total");

        IVA.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        IVA.setText("IVA");

        txtIVA.setEditable(false);
        txtIVA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        cmbModoPago.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbModoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de Crédito", "Tarjeta de Débito", "Cheque", "Transferencia" }));

        Representante.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(Representante);
        Representante.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Representante.setText("Representante");
        Representante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RepresentanteMouseClicked(evt);
            }
        });

        Dueño.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(Dueño);
        Dueño.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Dueño.setText("Dueño");
        Dueño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DueñoMouseClicked(evt);
            }
        });

        Cita.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Cita.setText("Cita");

        cmbCitaSinCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbCitaSinCancelar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCitaSinCancelarItemStateChanged(evt);
            }
        });
        cmbCitaSinCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCitaSinCancelarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbCitaSinCancelarMousePressed(evt);
            }
        });

        Trabajador.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Trabajador.setText("Trabajador");

        Fecha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Fecha.setText("Fecha");

        txtFecha.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setText("yyyy-mm-dd");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        FechaCita.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FechaCita.setText("Fecha de la Cita");

        txtFechaCita.setEditable(false);
        txtFechaCita.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtFechaCita.setText("yyyy-mm-dd");
        txtFechaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCitaActionPerformed(evt);
            }
        });

        cmbTrabajador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbTrabajador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTrabajadorItemStateChanged(evt);
            }
        });
        cmbTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTrabajadorActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtDueño.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Trabajador))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(NombreCliente)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Total)
                                    .addComponent(Subtotal)
                                    .addComponent(ModoPago))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaCita)
                                    .addComponent(IVA)
                                    .addComponent(Fecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIVA))
                                    .addComponent(txtFechaCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Cita)
                                .addGap(96, 96, 96)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Representante)
                                            .addComponent(Dueño))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbCitaSinCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPK, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPKCita, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cita)
                    .addComponent(cmbCitaSinCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Trabajador)
                    .addComponent(cmbTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPKCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreCliente)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Representante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dueño)
                    .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModoPago)
                    .addComponent(txtFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaCita))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subtotal)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IVA))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fecha)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        
        if(cajasVacias() || fechaVacia(getText(txtFecha))){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
        
            fecha = C_Fecha.deStringToDate(getText(txtFecha));  System.out.println("fecha "+fecha);
            fechaCita = C_Fecha.deStringToDate(getText(txtFechaCita));  System.out.println("fechacita "+fechaCita);
            modoPago = getComboSelected(cmbModoPago); System.out.println("modopago "+modoPago);
            subtotal =  Float.parseFloat(getText(txtSubtotal)); System.out.println("subtotal "+subtotal);
            iva = Float.parseFloat(getText(txtIVA)); System.out.println("iva "+iva);
            total = Float.parseFloat(getText(txtTotal)); System.out.println("total "+total);
            idcita = getID(cmbCitaSinCancelar); System.out.println("cita "+idcita);
            
            if(Representante.isSelected())
                cliente = getText(txtRepresentante); 
            if(Dueño.isSelected())
                //cliente = getComboSelected(cmbDueño);
                cliente = getText(txtDueño);
            
            System.out.println("cliente "+cliente);

            if(cFecha.fechasCorrectas(getText(txtFechaCita), getText(txtFecha))){
                
                
                mCita = cCita.getCita(idcita);
                mCita.setCancelado(true);
                cCita.modificarCita(idcita, mCita);
                
                id = controlador.getNumFacturasExistentes()+1; 

                modelo = new M_Factura(id, mCita, fecha, iva, subtotal, total, modoPago, cliente);

                controlador.guardarFactura(modelo);
                cCita.cargarCitasSinCancelar(cmbCitaSinCancelar);

                reiniciarValores();
                reiniciarBotones();
                limpiarCajas();
            
                if(controlador.getFacturas() != null)
                    tablaFacturas.setModel(controlador.cargarTabla());
            }
            else{
                JOptionPane.showMessageDialog(null, "La fecha de la factura debe ser igual o luego de la fecha de la cita. Por favor ingrese una fecha válida");
            }
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked

        if(cajasVacias() || fechaVacia(getText(txtFecha))){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
            
            fecha = cFecha.deStringToDate(getText(txtFecha));
            fechaCita = cFecha.deStringToDate(getText(txtFechaCita));
            modoPago = getComboSelected(cmbModoPago);
            subtotal =  Float.parseFloat(getText(txtSubtotal));
            iva = Float.parseFloat(getText(txtIVA));
            total = Float.parseFloat(getText(txtTotal));
            idcita = Integer.parseInt(getText(txtPKCita));
            
            if(cFecha.fechasCorrectas(getText(txtFechaCita), getText(txtFecha))){
            
                mCita = cCita.getCita(idcita);
                
                if(mCita == null)
                    System.out.println("la cita es null");
                
                if(Representante.isSelected())
                {
                    cliente = getText(txtRepresentante);
                }
                if(Dueño.isSelected())
                {
                    cliente = getText(txtDueño);
                }

                id = Integer.parseInt(getText(txtPK));

                modelo = new M_Factura();
                modelo.actualizar(id, mCita, fecha, iva, subtotal, total, modoPago, cliente);

                controlador.modificarFactura(id, modelo);
                
                reiniciarValores();
                reiniciarBotones();
                limpiarCajas();        
                tablaFacturas.setModel(controlador.cargarTabla());
            }
        }

    }//GEN-LAST:event_ModificarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked

        if(cajasVacias()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para realizar ésta acción");
        }
        else{
            
            id = Integer.parseInt(getText(txtPK));
            controlador.eliminarFactura(id);
            
            reiniciarValores();
            reiniciarBotones();
            limpiarCajas();
            tablaFacturas.setModel(controlador.cargarTabla());
        }

    }//GEN-LAST:event_EliminarMouseClicked

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        limpiarCajas();
        reiniciarBotones();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void VerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListaMouseClicked
        controlador.listarFacturas();
        //controlador.eliminarTodas();
        //tablaFacturas.setModel(controlador.cargarTabla());
    }//GEN-LAST:event_VerListaMouseClicked

    private void tablaFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturasMousePressed
        
        Guardar.setEnabled(false);
        Modificar.setEnabled(true);
        Eliminar.setEnabled(true);
        
        limpiarCajas();
        
        //mCita = cCita.getCita(getID(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 0).toString()));
        modeloAux = controlador.getFactura(Integer.parseInt(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 0).toString())); 

        if(modeloAux == null)
            modeloAux = new M_Factura();
        
        mCita = modeloAux.getCita();
        modeloAux.calcularTotal();

        txtIVA.setText(Float.toString(modeloAux.getIva()));
        txtSubtotal.setText(Float.toString(modeloAux.getSubtotal()));
        txtTotal.setText(Float.toString(modeloAux.getTotal()));
        txtPK.setText(Integer.toString(modeloAux.getId()));
        txtPKCita.setText(Integer.toString(modeloAux.getCita().getId()));
        txtFechaCita.setText(C_Fecha.deDateToString(mCita.getFecha()));
        txtFecha.setText(C_Fecha.deDateToString(mCita.getFecha()));
        
        //cmbDueño.setEnabled(true);
        
        cliente = modeloAux.getNombreCliente();

        if(mCita.getMascota().getDueno().nombrecito().equals(cliente)){
            txtDueño.setText(cliente);//setSelectedItem(cliente);
            Dueño.setSelected(true);
        }
        else{
            Representante.setSelected(true);
            txtRepresentante.setText(cliente);
        }                
    }//GEN-LAST:event_tablaFacturasMousePressed

    private void RepresentanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepresentanteMouseClicked
        txtDueño.setEnabled(false);
        txtRepresentante.setEnabled(true);
    }//GEN-LAST:event_RepresentanteMouseClicked

    private void DueñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DueñoMouseClicked
        if(getText(txtPKCita).isEmpty()){
            txtRepresentante.setEnabled(false);
            txtDueño.setEnabled(true);
        }   
    }//GEN-LAST:event_DueñoMouseClicked

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed

    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtFechaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCitaActionPerformed

    private void cmbCitaSinCancelarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCitaSinCancelarItemStateChanged
        cargarValores();
    }//GEN-LAST:event_cmbCitaSinCancelarItemStateChanged

    private void cmbTrabajadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTrabajadorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTrabajadorItemStateChanged

    private void cmbTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTrabajadorActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void cmbCitaSinCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCitaSinCancelarMouseClicked
        //cargarValores();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCitaSinCancelarMouseClicked

    private void cmbCitaSinCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCitaSinCancelarMousePressed
        cargarValores();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCitaSinCancelarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cita;
    private javax.swing.JRadioButton Dueño;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel FechaCita;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel IVA;
    private javax.swing.JLabel Juridico;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel ModoPago;
    private javax.swing.JLabel NombreCliente;
    private javax.swing.JRadioButton Representante;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Trabajador;
    private javax.swing.JLabel VerLista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCitaSinCancelar;
    private javax.swing.JComboBox<String> cmbModoPago;
    private javax.swing.JComboBox<String> cmbTrabajador;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaFacturas;
    private javax.swing.JTextField txtDueño;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaCita;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtPK;
    private javax.swing.JTextField txtPKCita;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    // Vacia todos los txtField de la ventana
    public void limpiarCajas(){
        txtFecha.setText("yyyy-mm-dd");
        txtIVA.setText(null);
        txtRepresentante.setText(null);
        txtDueño.setText(null);
        txtSubtotal.setText(null);
        txtTotal.setText(null);
        txtPK.setText(null);
        txtPKCita.setText(null);
        txtFechaCita.setText("yyy-mm-dd");
        Representante.setSelected(false);
        Dueño.setSelected(false);
        txtDueño.setEnabled(false);
        txtRepresentante.setEnabled(false);
        txtTotal.setEnabled(false);
    }
    
    private boolean fechaVacia(String fecha){
        if(fecha.equals("yyyy-mm-dd"))
            return true;
        return false;
    }
            
    //Devuelve el codigo de la opcion seleccionada en un combo
    public int getID(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        int guion = codigo.indexOf(" -");
        String codigoFinal;
        codigoFinal = codigo.substring(0, guion);
        
        return Integer.parseInt(codigoFinal);
    }
    
    public String getComboSelected(JComboBox combito){
        return combito.getSelectedItem().toString();
    }
    
    public boolean txtVacio(JTextField txt){
        if(txt.getText().isEmpty())
            return true;
        return false;
    }
    
    //Verifica si hay txtFields sin llenar
    public boolean cajasVacias(){
        if(txtVacio(txtFecha))
            return true;
        if(Representante.isSelected())
            if(txtVacio(txtRepresentante))
                return true;
        if(!Representante.isSelected() && !Dueño.isSelected())
            return true;
        return false;
    }
    
    //Coloca en null los atributos de la empresa
    public void reiniciarValores(){
        id = 0; 
        idcita = 0;
        cliente = null; 
        modoPago = null; 
        fecha = null;
        iva = 0;
        subtotal = 0;
        total = 0;
        trabajador = null;
        modeloAux = null;
    }
    
    //Devuelve el valor de un txtField
    public String getText(JTextField txt){
        return txt.getText();
    }    
    
    public String tipoDueño(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = codigo.substring(0,1);
        return codigoFinal;
    }
    
    public void cargarValores(){
        
        if(cCita.getNumCitasExistentes()-cCita.getNumCitasCanceladas() > 0){
            
            mCita = cCita.getCita(getID(cmbCitaSinCancelar));

            if(modeloAux == null)
                modeloAux = new M_Factura();

            modeloAux.setCita(mCita);
            modeloAux.calcularTotal();

            txtIVA.setText(Float.toString(modeloAux.getIva()));
            txtSubtotal.setText(Float.toString(modeloAux.getSubtotal()));
            txtTotal.setText(Float.toString(modeloAux.getTotal()));
            txtPK.setText(Integer.toString(modeloAux.getId()));
            
            txtFechaCita.setText(C_Fecha.deDateToString(mCita.getFecha()));            
            
            cliente = mCita.getMascota().getDueno().nombrecito();
            
            txtDueño.setText(cliente);
        }
    }
    
    public void reiniciarBotones(){
        Guardar.setEnabled(true);
        Modificar.setEnabled(false);
        Eliminar.setEnabled(false);
    }
 
    public boolean existeCombo(JComboBox combito, String nombre){
        
        for(int i=0; i<combito.getSize().height; i++){
            if(combito.getItemAt(i).toString().equals(nombre))
                return true;
        }
        return false;
    }
    
}
