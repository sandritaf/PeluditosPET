/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author brenda
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Mascota
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        pLateral = new javax.swing.JPanel();
        btnMascota = new javax.swing.JLabel();
        btnVeterinario = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JLabel();
        btnServicio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PeluditosPET = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        pFondo.setBackground(new java.awt.Color(204, 204, 204));
        pFondo.setPreferredSize(new java.awt.Dimension(729, 494));

        pLateral.setBackground(new java.awt.Color(204, 255, 255));

        btnMascota.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/jirafa48.png"))); // NOI18N
        btnMascota.setText("Mascota");

        btnVeterinario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/doctora48.png"))); // NOI18N
        btnVeterinario.setText("Veterinario");

        btnPersonal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/persona48.png"))); // NOI18N
        btnPersonal.setText("Personal");

        btnServicio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/estetoscopio48.png"))); // NOI18N
        btnServicio.setText("Servicio");

        javax.swing.GroupLayout pLateralLayout = new javax.swing.GroupLayout(pLateral);
        pLateral.setLayout(pLateralLayout);
        pLateralLayout.setHorizontalGroup(
            pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLateralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnServicio)
                    .addComponent(btnPersonal)
                    .addComponent(btnVeterinario)
                    .addComponent(btnMascota))
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
                .addComponent(btnServicio)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        PeluditosPET.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        PeluditosPET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/huella48.png"))); // NOI18N
        PeluditosPET.setText("Peluditos PET");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(PeluditosPET)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PeluditosPET)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 505, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PeluditosPET;
    private javax.swing.JLabel btnMascota;
    private javax.swing.JLabel btnPersonal;
    private javax.swing.JLabel btnServicio;
    private javax.swing.JLabel btnVeterinario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pLateral;
    // End of variables declaration//GEN-END:variables
}
