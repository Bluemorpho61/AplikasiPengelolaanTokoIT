package miniprojectfinal;


import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import miniprojectfinal.Koneksi.Konek;
public class Inputbarang extends javax.swing.JFrame {

    /**
     * Creates new form Inputbarang
     */
    public Inputbarang() {
        initComponents();
        load_table();
        kosong();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_tipe = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_input = new javax.swing.JButton();
        txt_merek = new javax.swing.JTextField();
        txt_supplier = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_jumlah = new javax.swing.JTextField();
        jtgl = new com.toedter.calendar.JDateChooser();
        btn_clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(20, 182, 20));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Database Barang");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 659, 68));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 30, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1970, 120));

        jPanel3.setBackground(new java.awt.Color(97, 225, 97));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Nama Barang");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel3.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 320, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Tipe Barang");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Merek Barang");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel3.add(txt_tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 320, 30));
        jPanel3.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 320, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Supplier");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Id Barang");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel3.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 320, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Harga");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btn_edit.setBackground(new java.awt.Color(102, 255, 255));
        btn_edit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel3.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 130, 40));

        btn_input.setBackground(new java.awt.Color(102, 255, 255));
        btn_input.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_input.setText("Input");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel3.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 750, 130, 40));
        jPanel3.add(txt_merek, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 320, 30));

        txt_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplierActionPerformed(evt);
            }
        });
        jPanel3.add(txt_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 320, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Tgl Masuk Barang");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        btn_delete.setBackground(new java.awt.Color(102, 255, 255));
        btn_delete.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 830, 130, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setText("Jumlah");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));
        jPanel3.add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 320, 30));
        jPanel3.add(jtgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 320, 30));

        btn_clear.setBackground(new java.awt.Color(102, 255, 255));
        btn_clear.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, 130, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 420, 1010));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 153, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1470, 940));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 1580, 1220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
      try{
          DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
          String sql = "INSERT INTO tb_barang Values('"+txt_id.getText()+"','"
                  +txt_nama.getText()+"','"+txt_tipe.getText()+"','"
                  +txt_merek.getText()+"','"+txt_harga.getText()+"','"+df.format(jtgl.getDate()).toString()+"','"
                  +txt_jumlah.getText()+"','"+txt_supplier.getText()+"')";
          java.sql.Connection conn=(Connection)Config.configDB();
          java.sql.PreparedStatement pst= conn.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    
    } load_table();
        kosong();                 

    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
  try {
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         String sql = "UPDATE tb_barang SET nama ='"+txt_nama.getText()
                +"', tipe_barang = '"+txt_tipe.getText()+"', merek_barang = '"
                +txt_merek.getText()+"', harga = '"+txt_harga.getText()
                +"', Tgl_masuk = '"+df.format(jtgl.getDate()).toString()
                +"',Jumlah = '"+txt_jumlah.getText()+"', supplier = '"+txt_supplier.getText()
                 +"'WHERE id_barang = '"+txt_id.getText()+"'";
          java.sql.Connection conn=(Connection)Config.configDB();
          java.sql.PreparedStatement pst= conn.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null, "Data berhasil di edit");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "perubahan Data Gagal" + e.getMessage());   
    }  load_table();
        kosong();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
        String sql = "DELETE FROM tb_barang where id_barang='"+txt_id.getText()+"'";
          java.sql.Connection conn=(Connection)Config.configDB();
          java.sql.PreparedStatement pst= conn.prepareStatement(sql);
          pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil di hapus");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    
    }    load_table();
        kosong();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id_barang = jTable1.getValueAt(baris, 0).toString();
        txt_id.setText(id_barang);
        if (jTable1.getValueAt(baris, 1)==null){
            txt_nama.setText("");
        } else {
            txt_nama.setText(jTable1.getValueAt(baris, 1).toString());
        }
        if (jTable1.getValueAt(baris, 2)==null) {
            txt_tipe.setText("");;
        } else {
           txt_tipe.setText(jTable1.getValueAt(baris, 2).toString());
        }
        if (jTable1.getValueAt(baris, 3)==null) {
            txt_merek.setText("");
        } else {
            txt_merek.setText(jTable1.getValueAt(baris, 3).toString());
        }
        if (jTable1.getValueAt(baris, 4)==null) {
            txt_harga.setText("");
        } else {
            txt_harga.setText(jTable1.getValueAt(baris, 4).toString());
        }
         if (jTable1.getValueAt(baris, 5)==null) {
            jtgl.setDateFormatString("");
        } else {
            jtgl.setDateFormatString(jTable1.getValueAt(baris, 5).toString());
        }
        if (jTable1.getValueAt(baris, 6)==null) {
            txt_jumlah.setText("");
        } else {
            txt_jumlah.setText(jTable1.getValueAt(baris, 6).toString());    
        }
         if (jTable1.getValueAt(baris, 7)==null) {
            txt_supplier.setText("");
        } else {
            txt_supplier.setText(jTable1.getValueAt(baris, 7).toString());    
        }                      // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        kosong();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            this.setVisible(false);
            new MenuUtama().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supplierActionPerformed

  
     private void load_table (){
    
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Id Barang");
    model.addColumn("Nama Barang");
    model.addColumn("Tipe Barang");
    model.addColumn("Merek Barang");
    model.addColumn("Harga Barang");
    model.addColumn("Tgl Masuk");
    model.addColumn("Jumlah Barang");
    model.addColumn("Supplier");
    
    try {
        String sql = "Select * FROM tb_barang";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow(new Object[]{res.getString(1),
                res.getString(2), res.getString(3), res.getString(4),
                res.getString(5), res.getString(6), res.getString(7), res.getString(8)});
        }    
        jTable1.setModel(model);
  }  catch (Exception e) {
  }
    
  }
     private void kosong(){
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      txt_id.setText(null);
      txt_nama.setText(null);
      txt_tipe.setText(null);
      txt_merek.setText(null);
      txt_harga.setText(null);
      txt_jumlah.setText(null);
      txt_supplier.setText(null);
      jtgl.setDateFormatString(null);
      
     }
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
            java.util.logging.Logger.getLogger(Inputbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inputbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inputbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inputbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inputbarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jtgl;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_merek;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_supplier;
    private javax.swing.JTextField txt_tipe;
    // End of variables declaration//GEN-END:variables
}
