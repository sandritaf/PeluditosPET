package Vista;

import java.awt.BorderLayout;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        PeluditosPET.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        PeluditosPET.setForeground(new java.awt.Color(102, 102, 102));
        PeluditosPET.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PeluditosPET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/huella48.png"))); // NOI18N
        PeluditosPET.setText("Peluditos PET");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PeluditosPET, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pLateralLayout = new javax.swing.GroupLayout(pLateral);
        pLateral.setLayout(pLateralLayout);
        pLateralLayout.setHorizontalGroup(
            pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnServicio)
                    .addComponent(btnPersonal)
                    .addComponent(btnVeterinario)
                    .addComponent(btnMascota)
                    .addComponent(btnEstilista)
                    .addComponent(btnJuridico)
                    .addComponent(btnNatural))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pLateralLayout.setVerticalGroup(
            pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVeterinario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPersonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstilista)
                .addGap(2, 2, 2)
                .addComponent(btnServicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJuridico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNatural)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
    private javax.swing.JLabel btnEstilista;
    private javax.swing.JLabel btnJuridico;
    private javax.swing.JLabel btnMascota;
    private javax.swing.JLabel btnNatural;
    private javax.swing.JLabel btnPersonal;
    private javax.swing.JLabel btnServicio;
    private javax.swing.JLabel btnVeterinario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pLateral;
    // End of variables declaration//GEN-END:variables
}
