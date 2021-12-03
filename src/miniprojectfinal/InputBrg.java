/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojectfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import miniprojectfinal.Koneksi.Konek;

/**
 *
 * @author Alkin PC
 */
public class InputBrg extends javax.swing.JFrame {

    /**
     * Creates new form InputBrg
     */
    protected String idBarang;
    public InputBrg() {
        initComponents();
        UpdateCombo();
        TabelData();
    }
    //function bwt tombol reset
    public void reset(){
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        jTextField_IdBarang.setText(null);
        jTextField_NamaBarang.setText(null);
        jComboBox_JnsBar.setSelectedItem("Silahkan masukkan jenis barang");
        jTextField_TipeMDL.setText(null);
        jTextField_BrandBrg.setText(null);
        jComboBox_Supp.setSelectedItem("Silahkan Masukkan Supplier");
        jTextField_Harga.setText(null);
        jDateChooser_TglMask.setDate(null);
        jTextField_StockBrg.setText(null);
    }
    
    //Function bwt ngedisplay isi tabel
    public void TabelData(){
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("ID Barang");
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Jenis Barang");
        tbl.addColumn("Tipe Model");
        tbl.addColumn("Brand");
        tbl.addColumn("Supplier");
        tbl.addColumn("Harga");
        tbl.addColumn("Tanggal Masuk");
        tbl.addColumn("Stok");
        jTable1.setModel(tbl);
        try {
            Statement statement=(Statement)Konek.getConnection().createStatement();
            ResultSet res=statement.executeQuery("SELECT * FROM tb_barang");
            java.sql.Connection conn=(Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            
            while (res.next()) {                
                tbl.addRow(new Object[]{
                res.getString("id_barang"),
                res.getString("nama"),
                res.getString("jenis"),
                res.getString("tipe_model"),
                res.getString("Brand_barang"),
                res.getString("supplier"),
                res.getString("harga"),
                res.getString("Tgl_masuk"),
                res.getString("jumlah"),
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datatabase tidak dapat terhubung");
        }
}
    //Tombol bwt comboBox
    public void UpdateCombo(){
        try {
            Statement statement =(Statement)Konek.getConnection().createStatement();
            ResultSet res=statement.executeQuery("SELECT * FROM tb_supplier");
            java.sql.Connection conn=(Connection) Config.configDB();
            java.sql.Statement stm =conn.createStatement();
            while (res.next()) {                
                jComboBox_Supp.addItem(res.getString("id_supplier"));
            }
        } catch (SQLException ex) {
            
        }
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_IdBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_NamaBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_TipeMDL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_BrandBrg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_Supp = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Harga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser_TglMask = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jTextField_StockBrg = new javax.swing.JTextField();
        jButton_Tambah = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox_JnsBar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Hps = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 182, 20));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Database Barang");

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1018, 60));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(97, 225, 97));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Barang");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jenis Barang");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipe Model");

        jTextField_TipeMDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TipeMDLActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Brand Barang");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Supplier");

        jComboBox_Supp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masukkan Supplier" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Harga");

        jTextField_Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_HargaActionPerformed(evt);
            }
        });
        jTextField_Harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_HargaKeyReleased(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tanggal Masuk");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Stok Barang");

        jButton_Tambah.setText("Tambah");
        jButton_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TambahActionPerformed(evt);
            }
        });

        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox_JnsBar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masukkan jenis barang", "PC", "Laptop", "Aksessoris PC", "Komponen PC" }));
        jComboBox_JnsBar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jComboBox_JnsBarComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_StockBrg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_TglMask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Harga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Supp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_BrandBrg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_TipeMDL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_JnsBar, javax.swing.GroupLayout.Alignment.LEADING, 0, 141, Short.MAX_VALUE)
                            .addComponent(jTextField_NamaBarang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_IdBarang, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Tambah)))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jTextField_IdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jComboBox_JnsBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_TipeMDL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_BrandBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_Supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser_TglMask, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_StockBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Edit)
                    .addComponent(jButton_Tambah))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 610));

        jTable1.setBackground(new java.awt.Color(255, 153, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Jenis Barang", "Tipe Model", "Brand", "Supplier", "Harga", "Tanggal Masuk", "Stok"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 760, 580));

        jButton_Hps.setText("Hapus");
        jButton_Hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HpsActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Hps, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TambahActionPerformed
        // TODO add your handling code here:
        try{
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String idbar=jTextField_IdBarang.getText();
            String namaBar=jTextField_NamaBarang.getText();
            String jnsBar=jComboBox_JnsBar.getSelectedItem().toString();
            String tipeMdl=jTextField_TipeMDL.getText();
            String BrandBar=jTextField_BrandBrg.getText();
            String supplier=jComboBox_Supp.getSelectedItem().toString() ;
            String harga=jTextField_Harga.getText();
            String tgl=df.format(jDateChooser_TglMask.getDate()).toString();
            String stok=jTextField_StockBrg.getText();
        String sql="INSERT INTO tb_barang VALUES('"+idbar+
                "','"+namaBar+"','"+jnsBar+
                "','"+tipeMdl+"','"+BrandBar+"','"+supplier+
                "','"+harga+"','"+tgl+
                "','"+stok+"')";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        TabelData();
        JOptionPane.showMessageDialog(this, "Data berhasil tersimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton_TambahActionPerformed

    private void jButton_HpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HpsActionPerformed
        // TODO add your handling code here:
        int row=jTable1.getSelectedRow();
        String idBarang=jTable1.getValueAt(row, 0).toString();
        
        try {
            String del="DELETE FROM tb_barang WHERE id_barang='"+idBarang+"'";
            Connection conn=(Connection)Konek.getConnection();
            PreparedStatement pst=conn.prepareStatement(del);
            pst.execute();
            this.TabelData();
            JOptionPane.showMessageDialog(this, "Data berhasil terhapus");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_HpsActionPerformed

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        // TODO add your handling code here:
        try {
            DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
            String nama=jTextField_NamaBarang.getText();
            String jenis=jComboBox_JnsBar.getSelectedItem().toString();
            String tipe=jTextField_TipeMDL.getText();
            String brand=jTextField_BrandBrg.getText();
            String supplier=jComboBox_Supp.getSelectedItem().toString();
            String harga=jTextField_Harga.getText();
            String tglMasuk=df.format(jDateChooser_TglMask.getDate()).toString();
            String stok =jTextField_StockBrg.getText();
            
            
            String sql="UPDATE tb_barang SET nama='"+nama+"', jenis='"+jenis+"', tipe_model='"+tipe+"', Brand_barang='"+brand+"', supplier='"+supplier+"', harga='"+harga+"', Tgl_masuk='"+tglMasuk.toString()+"', jumlah='"+stok+"' WHERE id_barang='"+jTextField_IdBarang.getText()+"'";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            TabelData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row =jTable1.getSelectedRow();
        String id =jTable1.getValueAt(row, 0).toString();
        String nama=jTable1.getValueAt(row, 1).toString();
        String jenis=jTable1.getValueAt(row, 2).toString();
        String tipe=jTable1.getValueAt(row, 3).toString();
        String Brand=jTable1.getValueAt(row, 4).toString();
        String Supplier=jTable1.getValueAt(row, 5).toString();
        String Harga=jTable1.getValueAt(row, 6).toString();
        //Object tgl=jTable1.getValueAt(row, 7);
        String Stok = jTable1.getValueAt(row, 8).toString();
        
        jTextField_IdBarang.setText(id);
        jTextField_NamaBarang.setText(nama);
        jComboBox_JnsBar.setSelectedItem(jenis);
        jTextField_TipeMDL.setText(tipe);
        jTextField_BrandBrg.setText(Brand);
        jComboBox_Supp.setSelectedItem(Supplier);
        jTextField_Harga.setText(Harga);
        //jDateChooser_TglMask.setDate((Date) tgl);
        jTextField_StockBrg.setText(Stok);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_TipeMDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TipeMDLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TipeMDLActionPerformed

    private void jTextField_HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_HargaActionPerformed

    private void jTextField_HargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HargaKeyReleased
        // TODO add your handling code here:
        /*String harga=jTextField_Harga.getText().replaceAll("\\,", "");
        double dblHarga=Double.parseDouble(harga);
        DecimalFormat df=new DecimalFormat("#,###,###");
        if (dblHarga>999) {
            jTextField_Harga.setText(df.format(dblHarga));
        }*/
    }//GEN-LAST:event_jTextField_HargaKeyReleased

    private void jComboBox_JnsBarComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBox_JnsBarComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_JnsBarComponentResized

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
            java.util.logging.Logger.getLogger(InputBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new InputBrg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Hps;
    private javax.swing.JButton jButton_Tambah;
    private javax.swing.JComboBox<String> jComboBox_JnsBar;
    private javax.swing.JComboBox<String> jComboBox_Supp;
    private com.toedter.calendar.JDateChooser jDateChooser_TglMask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_BrandBrg;
    private javax.swing.JTextField jTextField_Harga;
    private javax.swing.JTextField jTextField_IdBarang;
    private javax.swing.JTextField jTextField_NamaBarang;
    private javax.swing.JTextField jTextField_StockBrg;
    private javax.swing.JTextField jTextField_TipeMDL;
    // End of variables declaration//GEN-END:variables
}
