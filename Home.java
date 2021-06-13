/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.minimarket;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erika Winckler
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        koneksi_database();
        kosongkan_text();
        AutoNumber();
        view_barang("SELECT * FROM tb_barang");
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
        txt_kode = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        cmb_satuan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_harga_p = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_harga_j = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_stok = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cmb_cari = new javax.swing.JComboBox<>();
        txt_cari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Stok");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 20));

        txt_kode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_kode.setText("txt_kode");
        txt_kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_kodeKeyPressed(evt);
            }
        });
        jPanel1.add(txt_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 260, 20));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_barang.setRowHeight(22);
        jScrollPane1.setViewportView(tabel_barang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 610, 110));

        cmb_satuan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Satuan -", "Buah", "Unit", "Kg", "Bungkus", "Dus", "Pcs", "Lembar" }));
        jPanel1.add(cmb_satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 260, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Form Entry Data Barang");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 300, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Satuan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, 20));

        txt_nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nama.setText("txt_nama");
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 260, -1));

        txt_harga_p.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_harga_p.setText("txt_harga_p");
        jPanel1.add(txt_harga_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 260, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nama Barang");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Kode Barang");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 20));

        txt_harga_j.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_harga_j.setText("txt_harga_j");
        jPanel1.add(txt_harga_j, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 260, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Harga Pokok");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(":");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 10, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(":");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 10, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(":");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 10, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 10, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(":");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 10, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Harga Jual");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 10, 20));

        txt_stok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_stok.setText("txt_stok");
        jPanel1.add(txt_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 260, 20));

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 60, -1));

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Filter");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        cmb_cari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_cari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Barang", "Nama Barang", " " }));
        jPanel1.add(cmb_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 110, -1));

        txt_cari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_cariCaretUpdate(evt);
            }
        });
        jPanel1.add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
    try {
    sql = "INSERT INTO tb_barang VALUES ('"+txt_kode.getText()+
          "','"+txt_nama.getText()+
          "','"+cmb_satuan.getSelectedItem()+
          "','"+txt_harga_p.getText()+
          "','"+txt_harga_j.getText()+
          "','"+txt_stok.getText()+
          "')";
    stat = con.createStatement();
    stat.execute(sql);
    JOptionPane.showMessageDialog(null, "Tersimpan...");
    kosongkan_text();
    AutoNumber();
    stat.close();
    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Gagal..."+e);
    }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void txt_kodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kodeKeyPressed
    //cek kode tombol enter = 10
    if(evt.getKeyCode()==10 && txt_kode.getText().equalsIgnoreCase("")==false){
        tampil_data();
    }else{
        kosongkan_text();
    }
    }//GEN-LAST:event_txt_kodeKeyPressed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
    try {
    sql = "UPDATE tb_barang SET nm_brg='"+txt_nama.getText()+
            "', satuan='"+cmb_satuan.getSelectedItem()+
            "', harga_p='"+txt_harga_p.getText()+
            "', harga_j='"+txt_harga_j.getText()+
            "', stok='"+txt_stok.getText()+
            "' WHERE kd_brg='"+txt_kode.getText()+"' ";
    stat = con.createStatement();
    stat.execute(sql);
    JOptionPane.showMessageDialog(null, "Suksek Diedit...");
    kosongkan_text();
    AutoNumber();
    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Gagal..."+e);
    }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
    try {
    sql = "DELETE FROM tb_barang WHERE kd_brg= '"+txt_kode.getText()+"'";
    stat = con.createStatement();
    stat.execute(sql);
    JOptionPane.showMessageDialog(null, "Terhapus...");
    kosongkan_text();
    AutoNumber();
    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Gagal..."+e);
    }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
    kosongkan_text();
    AutoNumber();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
    this.dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void txt_cariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_cariCaretUpdate
    String kategori = cmb_cari.getSelectedItem().toString();
    String vkategori;
    if(kategori=="Kode Barang"){
        vkategori = "kd_brg";
    }else if(kategori=="Nama Barang"){
        vkategori = "nm_brg";
    }else{
        vkategori = "kd_brg";
    }
    view_barang("SELECT * FROM tb_barang WHERE "+vkategori+" LIKE '%"+txt_cari.getText()+"%'");
    }//GEN-LAST:event_txt_cariCaretUpdate

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cmb_cari;
    private javax.swing.JComboBox<String> cmb_satuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_barang;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_harga_j;
    private javax.swing.JTextField txt_harga_p;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables

private Connection con;
private Statement stat;
private ResultSet rs;
private String sql;

private void koneksi_database(){
try {
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Ditemukan...");
    try {
        String url = "jdbc:mysql://localhost:3306/dbminimarket?user=root&password=";
        con = DriverManager.getConnection(url);
        System.out.println("Terkoneksi...");
    } catch (SQLException e) {
        System.err.println("Tidak Konek...");
    }
    
} catch (ClassNotFoundException e) {
    System.err.println("Driver Tidak Ada...");
}
}


private void kosongkan_text(){
//txt_kode.setText("");
txt_nama.setText("");
cmb_satuan.setSelectedItem(-1);
txt_harga_p.setText("0");
txt_harga_j.setText("0");
txt_stok.setText("0");
txt_kode.requestFocus();
}

private void AutoNumber(){
try {
sql = "SELECT MAX(RIGHT(kd_brg,4))AS no_auto FROM tb_barang";
stat = con.createStatement();
rs = stat.executeQuery(sql);
if(rs.next()){
String no_auto, nol_plus;
int p;
no_auto = Integer.toString(rs.getInt(1)+1);
p = no_auto.length();
nol_plus = "";
for(int i=1; i<=4-p; i++){
nol_plus = nol_plus +"0";    
}
txt_kode.setText("B"+nol_plus+no_auto);
}
} catch (Exception e) {
    
}
}


private void tampil_data(){
try {
sql = "SELECT * FROM tb_barang WHERE kd_brg ='"+txt_kode.getText()+"'";
stat = con.createStatement();
rs = stat.executeQuery(sql);
if(rs.next()){
txt_nama.setText(rs.getString("nm_brg"));
cmb_satuan.setSelectedItem(rs.getString("satuan"));
txt_harga_p.setText(rs.getString("hrg_poko"));
txt_harga_j.setText(rs.getString("hgr_jual"));
txt_stok.setText(rs.getString("stok"));
}
} catch (Exception e) {
}
}

private void view_barang(String sql){
Object[] header = {"No", "Kode", "Nama barang","Satuan","Harga pokok","Harga jual", "Stok"};
DefaultTableModel tabel = new DefaultTableModel(null,header);
tabel_barang.setModel(tabel);
try {
  stat = con.createStatement();
  rs = stat.executeQuery(sql);
  byte no =1;
  while(rs.next()){
  String[] Data = {
      Byte.toString(no),
      rs.getString("kd_brg"),
      rs.getString("nm_brg"),
      rs.getString("satuan"),
      rs.getString("harga_p"),
      rs.getString("harga_j"),
      rs.getString("stok")
  };
  tabel.addRow(Data);
  no++;
  }
  tabel_barang.getColumnModel().getColumn(0).setPreferredWidth(25);
  tabel_barang.getColumnModel().getColumn(1).setPreferredWidth(75);
  tabel_barang.getColumnModel().getColumn(2).setPreferredWidth(200);
  
} catch (Exception e) {
  System.err.println(e);
}
}


}