/** Sub Menu ini digunakan untuk memberikan suatu Input data terhadap bagian  */
package user_interface.sub_user_interface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connect_to_database.KoneksiDatabase;
import user_interface.FormPencatatanStok;

/**
 *
 * @author Gede Rico Wijaya - 2005551091
 */
public class SubMenuCatatStokMasuk extends javax.swing.JFrame {

    /**
     * Creates new form SubMenuCatatStokMasuk
     */
    public SubMenuCatatStokMasuk() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jumlah_Spinner = new javax.swing.JSpinner();
        NamaBarang_Label = new javax.swing.JTextField();
        CatatStokMasuk_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(214, 236, 243));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(214, 236, 243));
        jPanel1.setLayout(null);

        Jumlah_Spinner.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        Jumlah_Spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jPanel1.add(Jumlah_Spinner);
        Jumlah_Spinner.setBounds(20, 220, 300, 70);

        NamaBarang_Label.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        NamaBarang_Label.setText("Nama Barang");
        jPanel1.add(NamaBarang_Label);
        NamaBarang_Label.setBounds(20, 130, 280, 70);

        CatatStokMasuk_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Catat.png")); // NOI18N
        CatatStokMasuk_Label.setText("Catat ");
        CatatStokMasuk_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CatatStokMasuk_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatatStokMasuk_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(CatatStokMasuk_Label);
        CatatStokMasuk_Label.setBounds(90, 300, 140, 90);

        Background.setBackground(new java.awt.Color(214, 236, 243));
        Background.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/SubMenuCatatStok.png")); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, 0, 330, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CatatStokMasuk_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_CatatStokMasuk_LabelMouseClicked
        String NamaBarang = NamaBarang_Label.getText();
        String JumlahMasuk = Jumlah_Spinner.getValue().toString();
        // Query dari untuk menambah banyak barang tetapi mengurangi stok Gudang
        if (cekTextField()) {
            if (!CekBarang(NamaBarang)) {
                PreparedStatement StatementQuery;
                String Query = "UPDATE tb_barang SET stok_masuk_display = ?, stok_gudang = ((SELECT stok_gudang FROM tb_barang WHERE nama_barang = ? ) - ?) WHERE nama_barang = ?";
                try {
                    StatementQuery = KoneksiDatabase.getConnection().prepareStatement(Query);
                    StatementQuery.setString(1, JumlahMasuk);
                    StatementQuery.setString(2, NamaBarang);
                    StatementQuery.setString(3, JumlahMasuk);
                    StatementQuery.setString(4, NamaBarang);
                    try {
                        if (StatementQuery.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "Stok Masuk berhasil dicatat !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error, Query Salah");
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString(), "Query Gagal", 2);
                }
            }
        }
    }// GEN-LAST:event_CatatStokMasuk_LabelMouseClicked

    /**
     * Method untuk mengecek ketersediaan username yang digunakan dengan melakukan
     * query terhadap database nantinya pengecekan ini akan dikembalikan terhadap
     * method klik
     *
     * 2005551091 - Gede Rico Wijaya
     */
    public boolean CekBarang(String barang) {
        PreparedStatement st;
        ResultSet rs;

        boolean username_terdaftar = false;

        // query yang akan dijalankan pada database
        String query = "SELECT * FROM tb_barang WHERE id_barang = ?";

        // pengecekan username
        try {
            st = KoneksiDatabase.getConnection().prepareStatement(query);
            st.setString(1, barang);
            rs = st.executeQuery();

            if (rs.next()) {
                username_terdaftar = true;
                JOptionPane.showMessageDialog(null, "Username Sudah Terdaftar, Silahkan Pilih Username lain !",
                        "Gagal terdaftar", 2);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return username_terdaftar;
    }

    /**
     * Method yang digunakan untuk mengecek Text Field yang digunakan untuk
     * mendaftarkan 2005551091 - Gede Rico Wijaya masih terdapat beberapa field yang
     * harus diubah 14:37 02 - Jun - 2021
     */
    public boolean cekTextField() {
        String NamaBarang = NamaBarang_Label.getText();
        // mengecek field yang kosong
        if (NamaBarang.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan Ketik Nama Barang Yang ", "Kotak Kosong", 2);
            return false;
        } else {
            return true;
        }

    }

    /**
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
            java.util.logging.Logger.getLogger(SubMenuCatatStokMasuk.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubMenuCatatStokMasuk.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubMenuCatatStokMasuk.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubMenuCatatStokMasuk.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubMenuCatatStokMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CatatStokMasuk_Label;
    private javax.swing.JSpinner Jumlah_Spinner;
    private javax.swing.JTextField NamaBarang_Label;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}