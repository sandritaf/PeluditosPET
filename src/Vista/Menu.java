package Vista;

import Conexion.Conexion;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        //setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PeluditosPET = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        pLateral = new javax.swing.JPanel();
        btnMascota = new javax.swing.JLabel();
        btnVeterinario = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JLabel();
        btnServicio = new javax.swing.JLabel();
        btnEstilista = new javax.swing.JLabel();
        btnJuridico = new javax.swing.JLabel();
        btnNatural = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnEspecie = new javax.swing.JLabel();
        btnCita = new javax.swing.JLabel();
        btnFactura = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        PeluditosPET.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        PeluditosPET.setForeground(new java.awt.Color(102, 102, 102));
        PeluditosPET.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PeluditosPET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/huellaperro48.png"))); // NOI18N
        PeluditosPET.setText("Peluditos PET");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PeluditosPET, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PeluditosPET)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pLateral.setBackground(new java.awt.Color(153, 204, 255));

        btnMascota.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/perro48.png"))); // NOI18N
        btnMascota.setText("Mascota");
        btnMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMascotaMouseClicked(evt);
            }
        });

        btnVeterinario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnVeterinario.setForeground(new java.awt.Color(255, 255, 255));
        btnVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/doctora48.png"))); // NOI18N
        btnVeterinario.setText("Veterinario");
        btnVeterinario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVeterinarioMouseClicked(evt);
            }
        });

        btnPersonal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/persona48.png"))); // NOI18N
        btnPersonal.setText("Personal");
        btnPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPersonalMouseClicked(evt);
            }
        });

        btnServicio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salud48.png"))); // NOI18N
        btnServicio.setText("Servicio");
        btnServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnServicioMouseClicked(evt);
            }
        });

        btnEstilista.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnEstilista.setForeground(new java.awt.Color(255, 255, 255));
        btnEstilista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/peluquero48.png"))); // NOI18N
        btnEstilista.setText("Estilista");
        btnEstilista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstilistaMouseClicked(evt);
            }
        });

        btnJuridico.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnJuridico.setForeground(new java.awt.Color(255, 255, 255));
        btnJuridico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/empresa48.png"))); // NOI18N
        btnJuridico.setText("P. Juridico");
        btnJuridico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJuridicoMouseClicked(evt);
            }
        });

        btnNatural.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnNatural.setForeground(new java.awt.Color(255, 255, 255));
        btnNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/prop48.png"))); // NOI18N
        btnNatural.setText("P. Natural");
        btnNatural.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNaturalMouseClicked(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir48.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnEspecie.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnEspecie.setForeground(new java.awt.Color(255, 255, 255));
        btnEspecie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/especie48.png"))); // NOI18N
        btnEspecie.setText("Especie");
        btnEspecie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEspecieMouseClicked(evt);
            }
        });

        btnCita.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCita.setForeground(new java.awt.Color(255, 255, 255));
        btnCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cita48.png"))); // NOI18N
        btnCita.setText("Cita");
        btnCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitaMouseClicked(evt);
            }
        });

        btnFactura.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/factura488.png"))); // NOI18N
        btnFactura.setText("Factura");
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturaMouseClicked(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/historial48.png"))); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistorialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pLateralLayout = new javax.swing.GroupLayout(pLateral);
        pLateral.setLayout(pLateralLayout);
        pLateralLayout.setHorizontalGroup(
            pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMascota)
                    .addComponent(btnVeterinario)
                    .addComponent(btnPersonal)
                    .addComponent(btnEstilista)
                    .addComponent(btnEspecie)
                    .addComponent(btnHistorial))
                .addGap(18, 18, 18)
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(btnServicio)
                    .addComponent(btnJuridico)
                    .addComponent(btnNatural)
                    .addComponent(btnCita)
                    .addComponent(btnFactura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pLateralLayout.setVerticalGroup(
            pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMascota)
                    .addComponent(btnServicio))
                .addGap(40, 40, 40)
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEspecie)
                    .addComponent(btnJuridico))
                .addGap(40, 40, 40)
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVeterinario)
                    .addComponent(btnNatural))
                .addGap(40, 40, 40)
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPersonal)
                    .addComponent(btnCita))
                .addGap(40, 40, 40)
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEstilista)
                    .addComponent(btnFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnHistorial))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotaMouseClicked
        V_Mascota panel = new V_Mascota();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Mascota");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnMascotaMouseClicked

    private void btnVeterinarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVeterinarioMouseClicked
        V_Veterinario panel = new V_Veterinario();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Veterinario");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnVeterinarioMouseClicked

    private void btnPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersonalMouseClicked
        V_Personal panel = new V_Personal();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Personal");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnPersonalMouseClicked

    private void btnEstilistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstilistaMouseClicked
        V_Estilista panel = new V_Estilista();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Peluquero");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnEstilistaMouseClicked

    private void btnServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServicioMouseClicked
        V_Servicio panel = new V_Servicio();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Servicio");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnServicioMouseClicked

    private void btnJuridicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuridicoMouseClicked
        V_Juridico panel = new V_Juridico();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Juridico");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnJuridicoMouseClicked

    private void btnNaturalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNaturalMouseClicked
        V_Natural panel = new V_Natural();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Natural");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnNaturalMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        Conexion.getInstancia().cerrarConexion();
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnEspecieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEspecieMouseClicked
        V_Especie panel = new V_Especie();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Especie");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnEspecieMouseClicked

    private void btnCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitaMouseClicked
        V_Cita panel = new V_Cita();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Cita");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnCitaMouseClicked

    private void btnFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseClicked
        V_Factura panel = new V_Factura();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Factura");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnFacturaMouseClicked

    private void btnHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialMouseClicked
        V_Historial panel = new V_Historial();
        panel.setVisible(true);
        panel.setLocation(0,0);
        panel.setSize(PanelPrincipal.getSize());
        System.out.println("Añadido Panel: Historial");
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.updateUI();
    }//GEN-LAST:event_btnHistorialMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel PeluditosPET;
    private javax.swing.JLabel btnCita;
    private javax.swing.JLabel btnEspecie;
    private javax.swing.JLabel btnEstilista;
    private javax.swing.JLabel btnFactura;
    private javax.swing.JLabel btnHistorial;
    private javax.swing.JLabel btnJuridico;
    private javax.swing.JLabel btnMascota;
    private javax.swing.JLabel btnNatural;
    private javax.swing.JLabel btnPersonal;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnServicio;
    private javax.swing.JLabel btnVeterinario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pLateral;
    // End of variables declaration//GEN-END:variables

    public Dimension getSize(){
        return PanelPrincipal.getSize();
    }
}
