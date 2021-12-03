/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojectfinal;

import LiveDatenClock.CurrentDate;

/**
 *
 * @author ASUS
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setDate();
    }
    
    private void setDate(){
        CurrentDate curD=new CurrentDate();
        Tanggal_Hari_ini.setText(curD.getCurDate());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        Tanggal_Hari_ini = new javax.swing.JLabel();
        Tmb_DbBar = new javax.swing.JButton();
        Tmb_kelolakar = new javax.swing.JButton();
        InputSupplier = new javax.swing.JButton();
        TmbahAkun = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jDesktopPane1.setBackground(new java.awt.Color(0, 204, 0));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Nama Owner");

        btn_logout.setFont(new java.awt.Font("Arial Unicode MS", 1, 10)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        Tanggal_Hari_ini.setBackground(new java.awt.Color(255, 255, 255));
        Tanggal_Hari_ini.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tanggal_Hari_ini.setForeground(new java.awt.Color(255, 255, 255));
        Tanggal_Hari_ini.setText("27 April 2077");

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_logout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Tanggal_Hari_ini, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Tanggal_Hari_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btn_logout)
                        .addContainerGap())))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(btn_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tanggal_Hari_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tmb_DbBar.setBackground(new java.awt.Color(0, 153, 0));
        Tmb_DbBar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        Tmb_DbBar.setText("Database Barang");
        Tmb_DbBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tmb_DbBarActionPerformed(evt);
            }
        });

        Tmb_kelolakar.setBackground(new java.awt.Color(0, 153, 0));
        Tmb_kelolakar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        Tmb_kelolakar.setText("Kelola Akun Karyawan");
        Tmb_kelolakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tmb_kelolakarActionPerformed(evt);
            }
        });

        InputSupplier.setBackground(new java.awt.Color(0, 153, 0));
        InputSupplier.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        InputSupplier.setText("Input Data Supplier");
        InputSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSupplierActionPerformed(evt);
            }
        });

        TmbahAkun.setBackground(new java.awt.Color(0, 153, 0));
        TmbahAkun.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TmbahAkun.setText("Tambah Akun Login");
        TmbahAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TmbahAkunActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton1.setText("Riwayat Transaksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InputSupplier)
                .addGap(18, 18, 18)
                .addComponent(Tmb_DbBar)
                .addGap(29, 29, 29)
                .addComponent(Tmb_kelolakar)
                .addGap(18, 18, 18)
                .addComponent(TmbahAkun)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputSupplier)
                    .addComponent(Tmb_DbBar)
                    .addComponent(Tmb_kelolakar)
                    .addComponent(TmbahAkun)
                    .addComponent(jButton1))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.setVisible(false);
        new LoginApk().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void Tmb_DbBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tmb_DbBarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new InputBrg().setVisible(true);
    }//GEN-LAST:event_Tmb_DbBarActionPerformed

    private void InputSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSupplierActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new InputDataSuppl().setVisible(true);
    }//GEN-LAST:event_InputSupplierActionPerformed

    private void Tmb_kelolakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tmb_kelolakarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PengelolaanKaryawan().setVisible(true);
    }//GEN-LAST:event_Tmb_kelolakarActionPerformed

    private void TmbahAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TmbahAkunActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BuatAkunLogin().setVisible(true);
    }//GEN-LAST:event_TmbahAkunActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new RiwayatTransaksi().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InputSupplier;
    private javax.swing.JLabel Tanggal_Hari_ini;
    private javax.swing.JButton Tmb_DbBar;
    private javax.swing.JButton Tmb_kelolakar;
    private javax.swing.JButton TmbahAkun;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
