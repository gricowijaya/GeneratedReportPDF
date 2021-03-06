/*
* FormPencatatanStok merupakan GUI yang digunakan untuk melakukan 
pencatatan mulai dari Insert dan Update Serta melakukan generasi PDF 
*
* @author Luh Putu Monica Arysta Putri Suastawan - 2005551090 
* @author Gede Rico Wijaya - 2005551091 
*
*/

// simpan pada package user_interface
package user_interface;

// mengambil class KoneksiDatabase
import connect_to_database.KoneksiDatabase;
// mengambil GUI FormHome
import user_interface.FormHome;

import user_interface.sub_user_interface.SubMenuCatatStokMasuk;
import user_interface.sub_user_interface.SubMenuTambahStokGudang;
// mengambil class HasilReport untuk melakukan generasi PDF
import create_pdf.HasilReport;
// SQL Query
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// GUI Swing Config
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPencatatanStok extends javax.swing.JFrame {

    /**
     * Creates new form FormPencatatanStok
     */
    public FormPencatatanStok() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SisaDisplay_Label = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Kembali_Label = new javax.swing.JLabel();
        NamaBarang_Field = new javax.swing.JTextField();
        StokDisplay_Label = new javax.swing.JTextField();
        MasukDisplay_Label = new javax.swing.JTextField();
        StokGudang_Label = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelSTOK = new javax.swing.JTable();
        Create_Label = new javax.swing.JLabel();
        Update_Label = new javax.swing.JLabel();
        Check_Label = new javax.swing.JLabel();
        Refresh_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        SisaDisplay_Label.setBackground(new java.awt.Color(214, 236, 243));
        SisaDisplay_Label.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        SisaDisplay_Label.setText("Sisa Display");
        SisaDisplay_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SisaDisplay_LabelMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        Kembali_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kembali_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kembali_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Kembali_Label);
        Kembali_Label.setBounds(20, 580, 70, 60);

        NamaBarang_Field.setBackground(new java.awt.Color(214, 236, 243));
        NamaBarang_Field.setFont(new java.awt.Font("Kohinoor Telugu", 0, 13)); // NOI18N
        NamaBarang_Field.setText("Nama Barang");
        NamaBarang_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NamaBarang_FieldMouseClicked(evt);
            }
        });
        jPanel1.add(NamaBarang_Field);
        NamaBarang_Field.setBounds(60, 190, 390, 50);

        StokDisplay_Label.setBackground(new java.awt.Color(214, 236, 243));
        StokDisplay_Label.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        StokDisplay_Label.setText("Display");
        StokDisplay_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StokDisplay_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(StokDisplay_Label);
        StokDisplay_Label.setBounds(60, 270, 390, 50);

        MasukDisplay_Label.setBackground(new java.awt.Color(214, 236, 243));
        MasukDisplay_Label.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        MasukDisplay_Label.setText("Masuk Display");
        MasukDisplay_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasukDisplay_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(MasukDisplay_Label);
        MasukDisplay_Label.setBounds(60, 340, 390, 50);

        StokGudang_Label.setBackground(new java.awt.Color(214, 236, 243));
        StokGudang_Label.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        StokGudang_Label.setText("Stok Gudang");
        StokGudang_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StokGudang_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(StokGudang_Label);
        StokGudang_Label.setBounds(60, 410, 390, 50);

        TabelSTOK.setBackground(new java.awt.Color(214, 236, 243));
        TabelSTOK.setFont(new java.awt.Font("Kohinoor Bangla", 0, 12)); // NOI18N
        TabelSTOK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Stok Display", "Stok Gudang "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelSTOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabelSTOK.setGridColor(new java.awt.Color(204, 204, 204));
        TabelSTOK.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(TabelSTOK);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(480, 170, 590, 400);

        Create_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Create_Kecil.png")); // NOI18N
        Create_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Create_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Create_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Create_Label);
        Create_Label.setBounds(860, 570, 140, 90);

        Update_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Update_Kecil.png")); // NOI18N
        Update_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Update_Label);
        Update_Label.setBounds(490, 570, 160, 90);

        Check_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Check_Kecil.png")); // NOI18N
        Check_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Check_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Check_Label);
        Check_Label.setBounds(680, 560, 140, 110);

        Refresh_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Refresh_Kecil.png")); // NOI18N
        Refresh_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Refresh_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Refresh_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Refresh_Label);
        Refresh_Label.setBounds(300, 580, 140, 70);

        Background.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/PencatatanStok.png")); // NOI18N
        Background.setText("UPDATE ");
        jPanel1.add(Background);
        Background.setBounds(20, -10, 1060, 670);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 1070, 670);

        setSize(new java.awt.Dimension(1079, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method yang digunakan untuk kembali kepada menu beranda yang diberikan kepada
     * Label Simbol Kembali
     */
    private void Kembali_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Kembali_LabelMouseClicked
        FormHome beranda = new FormHome();
        beranda.show();
        this.dispose();
    }// GEN-LAST:event_Kembali_LabelMouseClicked

    /**
     * Method yang digunakan untuk melakukan pembuatan Hasil Report Stok pada
     * Database
     */
    private void Create_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Create_LabelMouseClicked
        HasilReport LaporanStok = new HasilReport();
        LaporanStok.generate_report();
    }// GEN-LAST:event_Create_LabelMouseClicked

    /**
     * Method yang digunakan untuk melakukan penghapusan saat Label StokGudang_Label
     * diklik
     */
    private void StokGudang_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_StokGudang_LabelMouseClicked
        StokGudang_Label.setText("");
        SubMenuTambahStokGudang StokGudang = new SubMenuTambahStokGudang();
        StokGudang.setVisible(true);
        StokGudang.pack();
        StokGudang.setSize(318, 430);
        StokGudang.setLocationRelativeTo(null);
    }// GEN-LAST:event_StokGudang_LabelMouseClicked

    /**
     * Method yang digunakan untuk melakukan pengecekan stok yang sudah diinput
     * kepada database sehingga nilai-nilai Data Stok akan diperlihatkan pada JTable
     * TabelSTOK dengan menggunakan method ini
     */
    private void Check_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Check_LabelMouseClicked
        // variabel untuk mengekseksusi query
        PreparedStatement Statement;
        // sebuah cursor untuk baris dari tabel tersebut
        ResultSet HasilExecuteQuery;

        DefaultTableModel Tabel = (DefaultTableModel) TabelSTOK.getModel();
        Tabel.setRowCount(0);

        try {
            // query untuk mengecek password dan username sudah terdatftar
            String query = "SELECT nama_barang, stok_display, stok_gudang FROM tb_barang WHERE status ='ACTIVE'";
            Statement = KoneksiDatabase.getConnection().prepareStatement(query);
            HasilExecuteQuery = Statement.executeQuery();
            while (HasilExecuteQuery.next()) {
                String NamaBarang = String.valueOf(HasilExecuteQuery.getString("nama_barang"));
                String Display = String.valueOf(HasilExecuteQuery.getString("stok_display"));
                String StokGudang = String.valueOf(HasilExecuteQuery.getString("stok_gudang"));

                String data[] = { NamaBarang, Display, StokGudang };
                Tabel.addRow(data);
            }
        } catch (Exception e) {
            System.err.print(e);
            JOptionPane.showMessageDialog(null, e, "GAGAL", 2);
        }
    }// GEN-LAST:event_Check_LabelMouseClicked

    // Otomatis Menghapus Field Nama Barang
    private void NamaBarang_FieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_NamaBarang_FieldMouseClicked
        NamaBarang_Field.setText("");
    }// GEN-LAST:event_NamaBarang_FieldMouseClicked

    // Otomatis Menghapus Field StokDisplay_Field
    private void StokDisplay_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_StokDisplay_FieldMouseClicked
        StokDisplay_Label.setText("");
    }// GEN-LAST:event_StokDisplay_FieldMouseClicked

    // Otomatis Menghapus Field MasukDisplay_Field
    private void MasukDisplay_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MasukDisplay_FieldMouseClicked
        MasukDisplay_Label.setText("");
        SubMenuCatatStokMasuk stokMasuk = new SubMenuCatatStokMasuk();
        stokMasuk.setVisible(true);
        stokMasuk.pack();
        stokMasuk.setSize(318, 430);
        stokMasuk.setLocationRelativeTo(null);
    }// GEN-LAST:event_MasukDisplay_FieldMouseClicked

    // Otomatis Menghapus Field SisaDisplay_Field
    private void SisaDisplay_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SisaDisplay_FieldMouseClicked
        SisaDisplay_Label.setText("");
    }// GEN-LAST:event_SisaDisplay_FieldMouseClicked

    // Otomatis Menghapus Field StokGudang_Field
    private void StokGudang_LabelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_StokGudang_FieldActionPerformed
    }// GEN-LAST:event_StokGudang_FieldActionPerformed

    /**
     * Method untuk mengecek ketersediaan Nama Barang yang digunakan dengan
     * melakukan query terhadap database nantinya pengecekan ini akan dikembalikan
     * terhadap method klik
     *
     * 2005551091 - Gede Rico Wijaya
     */
    public boolean CekBarang(String Nama_Barang) {
        PreparedStatement st;
        ResultSet HasilQuery;

        boolean Nama_Barang_terdaftar = false;

        // query yang akan dijalankan pada database
        String query = "SELECT * FROM tb_barang WHERE nama_barang = ? AND status = 'ACTIVE' ";

        // pengecekan Nama_Barang
        try {
            st = KoneksiDatabase.getConnection().prepareStatement(query);
            st.setString(1, Nama_Barang);
            HasilQuery = st.executeQuery();

            // jika HasilQuery didapatkan bahwa nama dari barang database maka akan
            // dikembalikan Hasil MessageDialog
            if (HasilQuery.next()) {
                Nama_Barang_terdaftar = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Barang Tidak ada pada Penyimpanan Silahkan Cek Kembali Penulisan Nama Barang",
                        "Barang Gagal Ter-Update", 2);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return Nama_Barang_terdaftar;
    }

    // Method yang akan dilakukan Jika pengguna melakukan klik pada Label Update
    private void Update_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Update_LabelMouseClicked
        // Variabel yang untuk melakukan query database
        PreparedStatement ps;

        // Membuat string yang akan digunakan untuk melakukan akses Field
        String NamaBarang = NamaBarang_Field.getText();
        String StokDisplay = StokDisplay_Label.getText();
        String StokGudang = StokGudang_Label.getText();

        // Query memasukkan nama_barang
        if (cekTextField()) {
            // melakukan pengecekan nama_barang ada atau tidak
            if (CekBarang(NamaBarang) == true) {
                // menyimpan query yang digunakan pada SQL
                String queryUpdateBarang = "UPDATE tb_barang SET stok_display = ?, stok_gudang = ?, status = 'ACTIVE' WHERE nama_barang = ? ";
                try {
                    // mencoba eksekusi query
                    ps = KoneksiDatabase.getConnection().prepareStatement(queryUpdateBarang);
                    // pengganti Value harus sesuai order pada tabel yang digunakan untuk query
                    ps.setString(1, StokDisplay);
                    ps.setString(2, StokGudang);
                    ps.setString(3, NamaBarang);

                    // Setelah menjalankan query INSERT terhadap barang
                    ps.executeUpdate();
                    // jika query berhasil
                    if (ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "Stok Barang Berhasil Di-Update Pada Sistem !");
                        // jika query gagal
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, Barang Tidak Ter-Update, Silahkan Cek Data");
                    }
                    // jika tidak akan mendapatkan error dari dialog dan exeception handler
                    // jika query tidak terjalankan akan diberikan SQLExeption pada terminal
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, Barang Tidak Ter-Update, Silahkan Cek Data");
            }
        }
    }// GEN-LAST:event_Update_LabelMouseClicked

    /**
     * Method yang digunakan untuk memberikan keterangan Field setelah mengetikan
     * tombol Refersh ditujukan agar pengguna mengetahui lokasi-lokasi Field yang
     * diperlukan untuk mendata barang
     *
     * @Gede Rico Wijaya - 2005551091
     */
    private void Refresh_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Refresh_LabelMouseClicked
        NamaBarang_Field.setText("Nama Barang");
        StokDisplay_Label.setText("Display");
        MasukDisplay_Label.setText("Masuk Display");
        SisaDisplay_Label.setText("Sisa Display");
        StokGudang_Label.setText("Stok Gudang");
        DefaultTableModel Tabel = (DefaultTableModel) TabelSTOK.getModel();
        Tabel.setRowCount(0);
    }// GEN-LAST:event_Refresh_LabelMouseClicked

    /**
     * Method untuk mengecek kekosongan Field yang digunakan untuk 4 Field saja yang
     * dimana merupakan Field NamaBarang lalu Field StokAwal dan juga Field StokSisa
     * Ketiga Field ini tidak boleh null karena dibutuhkan untuk proses perhitungan
     * yang dilakukan pada MasukDisplay dan Stok Gudang karena Stok Yang ada pada
     * Gudang akan memberikan nilai yang harus lebih besar dari pada Stok IN
     *
     * Jadi Diberikan suatu Kondisi yaitu StokIn < StokGudang
     *
     * @Gede Rico Wijaya - 2005551091
     */
    public boolean cekTextField() {
        // Declare Variabel untuk mengambil Text atau nilai-nilai dari Field
        String NamaBarang = NamaBarang_Field.getText();
        String StokAwal = StokDisplay_Label.getText();
        String StokIn = MasukDisplay_Label.getText();
        String StokSisa = SisaDisplay_Label.getText();
        String StokGudang = StokGudang_Label.getText();

        /**
         * Mengecek apakah nilai pada StokMasuk lebih besar daripada StokPadaGudang jika
         * kondisi bernilai true maka pengguna perlu melakukan update Stok Karena Kedua
         * value merupakan String Maka harus dikonversikan kedalam Integer
         */

        // Mengecek field yang kosong
        if (NamaBarang.length() == 0 || StokAwal.length() == 0 || StokSisa.length() == 0 || StokGudang.length() == 0) {
            JOptionPane.showMessageDialog(null, "Salah satu kotak tidak diisi data", "kotak Kosong", 2);
            return false; // jika field masih ada yang kosong maka akan diberikan false agar tidak lolos
                          // dalam tahap pemasukan data
        } else {
            return true; // jika tidak kosong maka akan dikembalikan true yang nantinya akan digunakan
                         // untuk pemasukan data pada database
        }
    }

    /**
     * Method main untuk melakukan test Drive
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPencatatanStok.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPencatatanStok.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPencatatanStok.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPencatatanStok.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPencatatanStok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Check_Label;
    private javax.swing.JLabel Create_Label;
    private javax.swing.JLabel Kembali_Label;
    private javax.swing.JTextField MasukDisplay_Label;
    private javax.swing.JTextField NamaBarang_Field;
    private javax.swing.JLabel Refresh_Label;
    private javax.swing.JTextField SisaDisplay_Label;
    private javax.swing.JTextField StokDisplay_Label;
    private javax.swing.JTextField StokGudang_Label;
    private javax.swing.JTable TabelSTOK;
    private javax.swing.JLabel Update_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
