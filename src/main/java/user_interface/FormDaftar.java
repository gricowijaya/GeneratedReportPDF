/*
 * FormDaftar merupakan salah satu frame yang digunakan untuk mendaftarkan username 
 */
package user_interface;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import connect_to_database.KoneksiDatabase; 
import java.sql.PreparedStatement;
/**
 *
 * @author 2005551090 - Luh Putu Monica Arysta Putri Suastawan  - Design serta memastikan tombol dapat dimanipulasi dan memberikan fungsi pada tombol
 * @author 2005551091 - Gede Rico wijaya - mengkoneksikan FormDaftar agar dapat menyimpan nilai pada database dan memberikan fungsi pada tombol
 */
public class FormDaftar extends javax.swing.JFrame {
    ResultSet rs;
    String sql;
    Statement stat;

    // Constructor yang digunakan akan memanggil method initComponents()
    public FormDaftar() {
        initComponents();
    }

    /**
     * Hasil Pembangkitan dari GUI
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Email_TextField = new javax.swing.JTextField();
        NamaPengguna_TextField = new javax.swing.JTextField();
        Masuk_Label = new javax.swing.JLabel();
        Daftar_Label = new javax.swing.JLabel();
        KataSandi_Field = new javax.swing.JPasswordField();
        KonfirmasiKataSandi_Field = new javax.swing.JPasswordField();
        LihatSandi_Label = new javax.swing.JLabel();
        TutupSandi_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(214, 236, 243));
        jPanel2.setLayout(null);

        Email_TextField.setBackground(new java.awt.Color(214, 236, 243));
        Email_TextField.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        Email_TextField.setText("Email");
        Email_TextField.setBorder(null);
        Email_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Email_TextFieldMouseClicked(evt);
            }
        });
        jPanel2.add(Email_TextField);
        Email_TextField.setBounds(720, 210, 330, 30);

        NamaPengguna_TextField.setBackground(new java.awt.Color(214, 236, 243));
        NamaPengguna_TextField.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        NamaPengguna_TextField.setText("Username Anda");
        NamaPengguna_TextField.setBorder(null);
        NamaPengguna_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaPengguna_TextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NamaPengguna_TextField);
        NamaPengguna_TextField.setBounds(720, 280, 330, 26);

        Masuk_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Masuk_LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Masuk_LabelMouseEntered(evt);
            }
        });
        jPanel2.add(Masuk_Label);
        Masuk_Label.setBounds(920, 580, 70, 20);

        Daftar_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Daftar_LabelMouseClicked(evt);
            }
        });
        jPanel2.add(Daftar_Label);
        Daftar_Label.setBounds(730, 490, 220, 50);

        KataSandi_Field.setBackground(new java.awt.Color(214, 236, 243));
        KataSandi_Field.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        KataSandi_Field.setText("password");
        KataSandi_Field.setBorder(null);
        KataSandi_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KataSandi_FieldActionPerformed(evt);
            }
        });
        jPanel2.add(KataSandi_Field);
        KataSandi_Field.setBounds(720, 350, 320, 20);

        KonfirmasiKataSandi_Field.setBackground(new java.awt.Color(214, 236, 243));
        KonfirmasiKataSandi_Field.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        KonfirmasiKataSandi_Field.setText("password");
        KonfirmasiKataSandi_Field.setBorder(null);
        jPanel2.add(KonfirmasiKataSandi_Field);
        KonfirmasiKataSandi_Field.setBounds(720, 410, 320, 20);

        LihatSandi_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/ShowPassword.png")); // NOI18N
        LihatSandi_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LihatSandi_LabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LihatSandi_LabelMouseReleased(evt);
            }
        });
        jPanel2.add(LihatSandi_Label);
        LihatSandi_Label.setBounds(1020, 490, 50, 50);

        TutupSandi_Label.setBackground(new java.awt.Color(214, 236, 243));
        TutupSandi_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/HidePassword.png")); // NOI18N
        TutupSandi_Label.setText("jLabel1");
        jPanel2.add(TutupSandi_Label);
        TutupSandi_Label.setBounds(1020, 490, 50, 50);

        Background.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Daftar.png")); // NOI18N
        jPanel2.add(Background);
        Background.setBounds(0, 5, 1098, 695);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1100, 700);

        setSize(new java.awt.Dimension(1119, 751));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /** Method untuk mengecek ketersediaan username 
     *  yang digunakan dengan melakukan query terhadap database 
     *  nantinya pengecekan ini akan dikembalikan terhadap method klik
     *
     *  2005551091 - Gede Rico Wijaya*/
     public boolean CekUsername(String username) {
        PreparedStatement st;
        ResultSet rs;

        boolean username_terdaftar = false;

        // query yang akan dijalankan pada database
        String query = "SELECT * FROM tb_pegawai WHERE id_pegawai = ?";

        // pengecekan username
        try {
            st = KoneksiDatabase.getConnection().prepareStatement(query);
            st.setString(1, username);
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


    /** Method yang digunakan untuk mengecek Text Field yang digunakan untuk mendaftarkan
     *  2005551091 - Gede Rico Wijaya 
     *  masih terdapat beberapa field yang harus diubah 14:37 02 - Jun - 2021*/
    public boolean cekTextField() {
        // String yang digunakan untuk menyimpan semua apa yang diketikkan oleh pengguna 
        String email_pegawai         = Email_TextField.getText(); 
        String id_pegawai            = NamaPengguna_TextField.getText(); 

        // Label untuk sandi perlu diperbaharui - 14 : 32 02 - Jun 2021
        // karena ketika pengguna mengetik tanda bintang tidak terbaca
        String kata_sandi_baru       = KataSandi_Field.getText();
        String konfirmasi_kata_sandi = KonfirmasiKataSandi_Field.getText();

        // mengecek field yang kosong
        if (email_pegawai.trim().equals("") || id_pegawai.trim().equals("") || kata_sandi_baru.trim().equals("")
                || konfirmasi_kata_sandi.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Salah Satu Kotak Tidak Diisi Data", "Kotak Kosong", 2);
            return false;
            // mengecek kesamaan kedua password
        } else if (!kata_sandi_baru.equals(konfirmasi_kata_sandi)) {
            JOptionPane.showMessageDialog(null, "Password Tidak Sama, Silahkan Cek Ulang", "Password Sama", 2);
            return false;
            // Jika kondisi dari registrasi sudah benar
        } else {
            return true;
        }

    }

    private void NamaPengguna_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaPengguna_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaPengguna_TextFieldActionPerformed

    /** Method yang digunakan ketikan Label Daftar di klik oleh pengguna sehingga \
     *  pengguna dapat mendaftarkan id_pegawai, email, 
     *  serta sandi yang nantinya digunakan untuk login
     *  
     *  Gede Rico Wijaya - 2005551091
     *
     *  */
    private void Daftar_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Daftar_LabelMouseClicked
        // String yang digunakan untuk menyimpan semua apa yang diketikkan oleh pengguna 
        String email_pegawai         = Email_TextField.getText(); 
        String id_pegawai            = NamaPengguna_TextField.getText(); 

        // Label untuk sandi perlu diperbaharui - 14 : 32 02 - Jun 2021
        // karena ketika pengguna mengetik tanda bintang tidak terbaca
        String kata_sandi_baru       = KataSandi_Field.getText();
        String konfirmasi_kata_sandi = KonfirmasiKataSandi_Field.getText();

        // pengecekan texfield
        if (cekTextField()) {
            // cek username ada atau tidak
            if (!CekUsername(id_pegawai)) {
                PreparedStatement ps;
                ResultSet rs;
                // menyimpan query yang digunakan pada SQL
                String queryRegistrasi = "INSERT INTO tb_pegawai(id_pegawai, password, email) VALUES (?,?,?)";
                try {
                    // mencoba eksekusi query
                    ps = KoneksiDatabase.getConnection().prepareStatement(queryRegistrasi);
                    // pengganti Value harus sesuai order pada tabel yang digunakan untuk query
                    ps.setString(1, id_pegawai);
                    ps.setString(2, kata_sandi_baru);
                    ps.setString(3, email_pegawai);
                    // mengecek akun tersebut didaftarkan oleh system atau tidak
                    try {
                        if (ps.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "Akun Terdaftar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error, Silahkan cek data anda");
                        }
                        // jika tidak akan mendapatkan error dari dialog dan exeception handler
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    // jika query tidak terjalankan akan diberikan SQLExeption pada terminal
                } catch (SQLException ex) {
                    System.out.println(ex);
                }

            }
        }
    }//GEN-LAST:event_Daftar_LabelMouseClicked

    private void Masuk_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_LabelMouseEntered
        
    }//GEN-LAST:event_Masuk_LabelMouseEntered

    /** Method yang digunakan saat Label Masuk di klik maka program akan beralih kepada Form Login 
     *  2005551090 - Luh Putu Monica Arysta Putri Suastawan*/
    private void Masuk_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_LabelMouseClicked
        FormLogin login = new FormLogin();
        login.show();
        this.dispose();
    }//GEN-LAST:event_Masuk_LabelMouseClicked

    private void KataSandi_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KataSandi_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KataSandi_FieldActionPerformed

    private void LihatSandi_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatSandi_LabelMousePressed
        TutupSandi_Label.setVisible(true);
        LihatSandi_Label.setVisible(false);
        KataSandi_Field.setEchoChar((char)0);
        KonfirmasiKataSandi_Field.setEchoChar((char)0);
    }//GEN-LAST:event_LihatSandi_LabelMousePressed

    private void LihatSandi_LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatSandi_LabelMouseReleased
        TutupSandi_Label.setVisible(false);
        LihatSandi_Label.setVisible(true);
        KataSandi_Field.setEchoChar('*');
        KonfirmasiKataSandi_Field.setEchoChar('*');
    }//GEN-LAST:event_LihatSandi_LabelMouseReleased

    private void Email_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Email_TextFieldMouseClicked
        Email_TextField.setText("");
        NamaPengguna_TextField.setText("");
        KataSandi_Field.setText("");
        KonfirmasiKataSandi_Field.setText("");
    }//GEN-LAST:event_Email_TextFieldMouseClicked

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
            java.util.logging.Logger.getLogger(FormDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDaftar().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Daftar_Label;
    private javax.swing.JTextField Email_TextField;
    private javax.swing.JPasswordField KataSandi_Field;
    private javax.swing.JPasswordField KonfirmasiKataSandi_Field;
    private javax.swing.JLabel LihatSandi_Label;
    private javax.swing.JLabel Masuk_Label;
    private javax.swing.JTextField NamaPengguna_TextField;
    private javax.swing.JLabel TutupSandi_Label;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void refresh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}