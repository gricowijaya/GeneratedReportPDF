/*
 * Form Login merupakan Frame yang digunakan agar user dapat login terhadap program
 * 2005551090 - Luh Putu Monica Arysta Suastawan 
 * 2005551091 - Gede Rico Wijaya
 * */ 
package user_interface;

import connect_to_database.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class FormLogin extends javax.swing.JFrame {

    // contructor akan memanggil method initComponents() 
    public FormLogin() {
        initComponents();
        this.TutupSandi_Label.setVisible(false);
    }

    /**
     * Method initComponents merupakan method yang dibangkitkan saat perancangan GUI 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LihatSandi_Label = new javax.swing.JLabel();
        TutupSandi_Label = new javax.swing.JLabel();
        Masuk_Label = new javax.swing.JLabel();
        Daftar_Label = new javax.swing.JLabel();
        LupaKataSandi_Label = new javax.swing.JLabel();
        NamaPengguna_Field = new javax.swing.JTextField();
        KataSandi_Field = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(214, 236, 243));
        jPanel3.setLayout(null);

        LihatSandi_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/ShowPassword.png")); // NOI18N
        LihatSandi_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LihatSandi_LabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LihatSandi_LabelMouseReleased(evt);
            }
        });
        jPanel3.add(LihatSandi_Label);
        LihatSandi_Label.setBounds(20, 10, 50, 50);

        TutupSandi_Label.setBackground(new java.awt.Color(214, 236, 243));
        TutupSandi_Label.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/HidePassword.png")); // NOI18N
        TutupSandi_Label.setText("jLabel1");
        jPanel3.add(TutupSandi_Label);
        TutupSandi_Label.setBounds(20, 10, 50, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(970, 380, 80, 70);

        Masuk_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Masuk_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Masuk_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Masuk_Label);
        Masuk_Label.setBounds(720, 520, 170, 40);

        Daftar_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Daftar_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Daftar_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Daftar_Label);
        Daftar_Label.setBounds(720, 630, 170, 50);

        LupaKataSandi_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LupaKataSandi_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(LupaKataSandi_Label);
        LupaKataSandi_Label.setBounds(810, 450, 180, 30);

        NamaPengguna_Field.setBackground(new java.awt.Color(214, 236, 243));
        NamaPengguna_Field.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        NamaPengguna_Field.setBorder(null);
        jPanel1.add(NamaPengguna_Field);
        NamaPengguna_Field.setBounds(590, 330, 380, 37);

        KataSandi_Field.setBackground(new java.awt.Color(214, 236, 243));
        KataSandi_Field.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        KataSandi_Field.setBorder(null);
        jPanel1.add(KataSandi_Field);
        KataSandi_Field.setBounds(590, 410, 380, 37);

        Background.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Login.png")); // NOI18N
        Background.setText("jLabel1");
        jPanel1.add(Background);
        Background.setBounds(0, 0, 1060, 690);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 690);

        setSize(new java.awt.Dimension(1083, 744));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Daftar_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Daftar_LabelMouseClicked
        FormDaftar daftar = new FormDaftar();
        daftar.show();
        this.dispose();
    }//GEN-LAST:event_Daftar_LabelMouseClicked

    private void LupaKataSandi_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LupaKataSandi_LabelMouseClicked
        FormLupaPassword lupaPassword = new FormLupaPassword();
        lupaPassword.show();
    }//GEN-LAST:event_LupaKataSandi_LabelMouseClicked

  
    private void Masuk_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_LabelMouseClicked
              // variabel untuk mengekseksusi query
        PreparedStatement st;
        // sebuah cursor untuk baris dari tabel tersebut
        ResultSet rs;

        // menyimpan username dan password
        String username = NamaPengguna_Field.getText();
        String password = String.valueOf(KataSandi_Field.getPassword());

        // query untuk mengecek password dan username sudah terdatftar
        String query = "SELECT * FROM tb_pegawai WHERE id_pegawai = ? AND password = ? ";

        // memberikan info bahwa username atau password empty
        if (username.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan ketik username", "Username kosong", 2);
        } else if (password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan ketik password", "Password Kosong", 2);
        } else {
            try {
                st = KoneksiDatabase.getConnection().prepareStatement(query);
                st.setString(1, username);
                st.setString(2, password);
                rs = st.executeQuery();
                // jika sudah terdaftar maka ResultSet akan berlanjut ke baris selanjutnya
                if (rs.next()) {
                    FormHome beranda = new FormHome();
                    beranda.show();
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password Anda Salah", "Tidak Dapat Login", 2);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
 
    }//GEN-LAST:event_Masuk_LabelMouseClicked

    private void LihatSandi_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatSandi_LabelMousePressed
        TutupSandi_Label.setVisible(true);
        LihatSandi_Label.setVisible(false);
        KataSandi_Field.setEchoChar((char)0);
    }//GEN-LAST:event_LihatSandi_LabelMousePressed

    private void LihatSandi_LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatSandi_LabelMouseReleased
        TutupSandi_Label.setVisible(false);
        LihatSandi_Label.setVisible(true);
        KataSandi_Field.setEchoChar('*');
    }//GEN-LAST:event_LihatSandi_LabelMouseReleased

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Daftar_Label;
    private javax.swing.JPasswordField KataSandi_Field;
    private javax.swing.JLabel LihatSandi_Label;
    private javax.swing.JLabel LupaKataSandi_Label;
    private javax.swing.JLabel Masuk_Label;
    private javax.swing.JTextField NamaPengguna_Field;
    private javax.swing.JLabel TutupSandi_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
