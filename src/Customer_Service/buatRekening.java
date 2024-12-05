/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customer_Service;

/**
 *
 * @author alyag
 */
import java.util.Random;
import javax.swing.JOptionPane;
import com.myapp.database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class buatRekening extends javax.swing.JFrame {

    /**
     * Creates new form buatRekening
     */
    public buatRekening() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAlamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTanggalLahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldJenisKelamin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNIK = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNomorTelpon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPIN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldSaldoAwal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buat Rekening Baru");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 105, -1, -1));

        jTextFieldNama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 131, 422, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Alamat");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 168, -1, -1));

        jTextFieldAlamat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldAlamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlamatActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 194, 422, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Tanggal Lahir (YYYY-MM-DD)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 231, -1, -1));

        jTextFieldTanggalLahir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldTanggalLahir.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldTanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTanggalLahirActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 257, 422, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Jenis Kelamin (Wanita/ Pria)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 294, -1, -1));

        jTextFieldJenisKelamin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldJenisKelamin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJenisKelaminActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 422, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Nomor Identitas (NIK/ Paspor/ dsb)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 357, -1, -1));

        jTextFieldNIK.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNIK.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldNIK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIKActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 383, 422, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Nomor Telepon");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jTextFieldNomorTelpon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNomorTelpon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldNomorTelpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomorTelponActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNomorTelpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 430, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 430, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("PIN (4 Digit)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jTextFieldPIN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldPIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPINActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 430, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jTextFieldPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 430, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Masukan Saldo Awal:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Rp");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jTextFieldSaldoAwal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldSaldoAwal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jTextFieldSaldoAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoAwalActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldSaldoAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 400, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Buat Rekening");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 157, 48));

        jButtonBack.setBackground(new java.awt.Color(0, 51, 102));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jTextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlamatActionPerformed

    private void jTextFieldTanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTanggalLahirActionPerformed

    private void jTextFieldJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJenisKelaminActionPerformed

    private void jTextFieldNIKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIKActionPerformed

    private void jTextFieldNomorTelponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomorTelponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomorTelponActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPINActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldSaldoAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoAwalActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        Customer_Service.menu_CS frame = new Customer_Service.menu_CS();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private String generateNomorRekening() {
        Random rand = new Random();
        StringBuilder nomorRekening = new StringBuilder();

        // Membuat nomor rekening dengan 12 digit acak
        for (int i = 0; i < 12; i++) {
            nomorRekening.append(rand.nextInt(10));  // Menambahkan angka acak 0-9
        }

        return nomorRekening.toString();  // Mengembalikan nomor rekening acak
    }

    private void buatRekening(String namaLengkap, String alamat, String tanggalLahir,
            String jenisKelamin, String nomorIdentitas, String nomorTelepon,
            String email, String password, String pin, double saldo) {
        // Menghasilkan nomor rekening acak
        String nomorRekening = generateNomorRekening();

        // SQL query untuk menambahkan data rekening baru
        String sql = "INSERT INTO user (nomor_rekening, nama_lengkap, alamat, tanggal_lahir, jenis_kelamin, nomor_identitas, nomor_telepon, email, password, pin, saldo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bank", "root", ""); PreparedStatement ps = conn.prepareStatement(sql)) {

            // Set parameter untuk query
            ps.setString(1, nomorRekening);
            ps.setString(2, namaLengkap);
            ps.setString(3, alamat);
            ps.setString(4, tanggalLahir);
            ps.setString(5, jenisKelamin);
            ps.setString(6, nomorIdentitas);
            ps.setString(7, nomorTelepon);
            ps.setString(8, email);
            ps.setString(9, password);
            ps.setString(10, pin);
            ps.setBigDecimal(11, new java.math.BigDecimal(saldo));

            // Eksekusi query
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Rekening berhasil dibuat dengan nomor: " + nomorRekening);
        } catch (SQLException e) {
            // Menangani error jika ada
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal membuat rekening: " + e.getMessage());
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String namaLengkap = jTextFieldNama.getText();
        String alamat = jTextFieldAlamat.getText();
        String tanggalLahir = jTextFieldTanggalLahir.getText(); // Format input: YYYY-MM-DD
        String jenisKelamin = jTextFieldJenisKelamin.getText();
        String nomorIdentitas = jTextFieldNIK.getText();
        String nomorTelepon = jTextFieldNomorTelpon.getText();
        String email = jTextFieldEmail.getText();
        String password = jTextFieldPassword.getText();
        String pin = jTextFieldPIN.getText();

        String saldoStr = jTextFieldSaldoAwal.getText();

        double saldo = 0.0;
        try {
            saldo = Double.parseDouble(saldoStr); // Mengonversi input saldo ke tipe double
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Saldo tidak valid.");
            return;
        }
        
        // Memanggil metode untuk menambahkan rekening
        buatRekening(namaLengkap, alamat, tanggalLahir, jenisKelamin, nomorIdentitas, nomorTelepon, email, password, pin, saldo);

        // Mengosongkan input field setelah data disimpan
        jTextFieldNama.setText("");
        jTextFieldAlamat.setText("");
        jTextFieldTanggalLahir.setText("");
        jTextFieldJenisKelamin.setText("");
        jTextFieldNIK.setText("");
        jTextFieldNomorTelpon.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPassword.setText("");
        jTextFieldPIN.setText("");

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
            java.util.logging.Logger.getLogger(buatRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buatRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buatRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buatRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buatRekening().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBack;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldJenisKelamin;
    private javax.swing.JTextField jTextFieldNIK;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNomorTelpon;
    private javax.swing.JTextField jTextFieldPIN;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldSaldoAwal;
    private javax.swing.JTextField jTextFieldTanggalLahir;
    // End of variables declaration//GEN-END:variables
}
