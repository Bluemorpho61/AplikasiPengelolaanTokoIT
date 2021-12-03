package miniprojectfinal;


import LiveDatenClock.CurrentDate;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import miniprojectfinal.Config;
import miniprojectfinal.Koneksi.Konek;
import miniprojectfinal.InputBrg;

public class kasir extends javax.swing.JFrame {
 public StringTokenizer token;
 public String ganti="";
 public long angka;
    
    
    public kasir() {
        initComponents();
        this.setTitle("Cashier"); 
        updateCombo();
        setDate();
   }
    private void setDate(){
        CurrentDate curD=new CurrentDate();
        Tgl_Sistem.setText(curD.getCurDate());
    }
        //Fungsi untuk tombol comboBox utk ID BARANG
    public void updateCombo(){
        try {
            Statement statement=(Statement)Konek.getConnection().createStatement();
            ResultSet res=statement.executeQuery("SELECT * FROM tb_barang");
            java.sql.Connection conn=(Connection) Config.configDB();
            java.sql.Statement stm=conn.createStatement();
            while (res.next()) {
                jComboBox_idBar.addItem(res.getString("id_barang"));
                
            }
            
        } catch (Exception e) {
        }
    }
    public void cari_id (){
    
        try {
        String sql = "Select * from tb_barang where id_barang.id_barang='"+this.jComboBox_idBar.getSelectedItem()+"'";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement pst=conn.createStatement();
        java.sql.ResultSet res=pst.executeQuery("Select * FROM tb_barang where tb_barang.id_barang");
        
        
        while(res.next()){
           this.txt_nama.setText(res.getString("nama"));
           this.txt_harga.setText(res.getString("harga_barang"));
           this.txt_merek.setText(res.getString("Bramd_barang"));
    }
        
     res.close(); }
      catch (Exception e) {
        System.out.println(e.getMessage());
    }
  }
            
            
           


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txt_jumlah = new javax.swing.JTextField();
        txt_trans = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_merek = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        btn_id = new javax.swing.JButton();
        txt_cash = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        txt_kembali = new javax.swing.JTextField();
        btn_reset = new javax.swing.JButton();
        txt_total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_idBar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox_Type = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton_Logout = new javax.swing.JButton();
        Tgl_Sistem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(166, 228, 180));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_jumlah.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel4.add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 280, 43));

        txt_trans.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel4.add(txt_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 280, 43));

        txt_nama.setEditable(false);
        txt_nama.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel4.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 280, 43));

        txt_merek.setEditable(false);
        txt_merek.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel4.add(txt_merek, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 280, 43));

        txt_harga.setEditable(false);
        txt_harga.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        txt_harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_hargaKeyReleased(evt);
            }
        });
        jPanel4.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 280, 43));

        btn_id.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_id.setText("Katalog");
        btn_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idActionPerformed(evt);
            }
        });
        jPanel4.add(btn_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 120, 40));

        txt_cash.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel4.add(txt_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 380, 270, 50));

        btn_simpan.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel4.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 730, -1, 40));

        txt_kembali.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txt_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembaliActionPerformed(evt);
            }
        });
        jPanel4.add(txt_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 530, 270, 50));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_reset.setText("Clear");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel4.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 730, 120, 40));

        txt_total.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        txt_total.setForeground(new java.awt.Color(255, 0, 0));
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        jPanel4.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 160, 350, 140));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("Jumlah");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 190, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setText("No Transaksi");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 72, 201, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setText("Id Barang");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 183, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setText("Nama_Barang");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 183, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel8.setText("Tipe_Barang");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 183, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel9.setText("Merek_Barang");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 190, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel10.setText("Harga");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 190, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel11.setText("Total Harga");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 60, 260, 70));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel3.setText("Cash");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 320, 190, 40));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel12.setText("Kembali");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 470, -1, -1));

        jComboBox_idBar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih ID Barang", "I" }));
        jComboBox_idBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_idBarActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox_idBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 280, 40));

        jButton1.setText("Panduan penggunaan aplikasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 30, 200, 30));

        jButton2.setText("Kilk disini setelah memilih ID");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 210, 40));

        jComboBox_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Masukkan Tipe Barang", "PC", "Laptop", "Komponen PC", "Aksessoris PC" }));
        jPanel4.add(jComboBox_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 280, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1950, 1110));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cashier");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 25, 339, 69));

        jPanel3.setBackground(new java.awt.Color(20, 182, 20));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cashier");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 25, 339, 69));

        jButton_Logout.setText("Logout");
        jButton_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogoutActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 40));

        Tgl_Sistem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Tgl_Sistem.setText("29 April 2069");
        jPanel3.add(Tgl_Sistem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 50, 260, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1950, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
       
        int total = Integer.parseInt(txt_harga.getText()) * Integer.parseInt(txt_jumlah.getText());
       txt_total.setText(""+total);
    }//GEN-LAST:event_txt_totalActionPerformed

    private void btn_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idActionPerformed
      new MenuBarang().setVisible(true);
    }//GEN-LAST:event_btn_idActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:.
        angka=Long.parseLong(txt_total.getText());
        ganti=NumberFormat.getNumberInstance(Locale.US).format(angka);
        token= new StringTokenizer(ganti, ",");
        ganti=token.nextToken();
        ganti=ganti.replace(',', ',');
        txt_total.setText(ganti);
        
        try{
            String noTrans=txt_trans.getText();
            String nama=txt_nama.getText();
            String tipe=jComboBox_Type.getSelectedItem().toString();
            String merek=txt_merek.getText();
            String harga=txt_harga.getText();
            String jumlah=txt_jumlah.getText();
            String total=txt_total.getText();
        String sql = "INSERT INTO transaksi Values"+"('"+noTrans+"','"+jComboBox_idBar.getSelectedItem()+"','"
                  +nama+"','"+tipe+"','"
                  +merek+"','"+harga+"','"
                  +jumlah+"','"+total+"')";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.PreparedStatement pst= conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Ada yang belum diisi !!");
    
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembaliActionPerformed

        int kembalianjumlah = Integer.parseInt(txt_cash.getText())-Integer.parseInt(txt_total.getText());
        txt_kembali.setText(""+kembalianjumlah);
    }//GEN-LAST:event_txt_kembaliActionPerformed

    private void jButton_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginApk().setVisible(true);
    }//GEN-LAST:event_jButton_LogoutActionPerformed

    private void txt_hargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hargaKeyReleased
        // TODO add your handling code here:
        /*String harga=txt_harga.getText().replaceAll("\\,", "");
        double dblHarga=Double.parseDouble(harga);
        DecimalFormat df=new DecimalFormat("#,###,###");
        if (dblHarga>999) {
            txt_harga.setText(df.format(dblHarga));
        }*/
    }//GEN-LAST:event_txt_hargaKeyReleased

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox_idBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_idBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_idBarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String sql="SELECT * FROM tb_barang WHERE id_barang='"+jComboBox_idBar.getSelectedItem()+"'";
            Connection conn=(Connection)Konek.getConnection();
            PreparedStatement pst =conn.prepareStatement(sql);
            ResultSet res=pst.executeQuery();
            if (res.next()) {
                txt_harga.setText(res.getString("harga"));
                txt_nama.setText(res.getString("nama"));
                txt_merek.setText(res.getString("Brand_barang"));
                
            } else {
                
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void reset(){
      //txt_id.setText("");
      txt_nama.setText("");
      jComboBox_Type.setSelectedItem("Silahkan Masukkan Tipe Barang");
      txt_merek.setText("");
      txt_harga.setText("");
      txt_jumlah.setText("");
      txt_total.setText("");
      txt_cash.setText("");
       txt_kembali.setText("");
    /**
     * @param args the command line arguments
     */
    }
    
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
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tgl_Sistem;
    private javax.swing.JButton btn_id;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Logout;
    private javax.swing.JComboBox<String> jComboBox_Type;
    private javax.swing.JComboBox<String> jComboBox_idBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembali;
    private javax.swing.JTextField txt_merek;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_trans;
    // End of variables declaration//GEN-END:variables
}
