/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistem_ATM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alyag
 */
public class tarikTunai extends javax.swing.JFrame {

    /**
     * Creates new form tarikTunai
     */
    public tarikTunai() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private String noRekening = login.MainApp.akunLogin;

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
        jButtonTarikTunai = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldJumlahTarik = new javax.swing.JTextField();
        jLabelSaldoSaatIni = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tarik Tunai");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButtonTarikTunai.setBackground(new java.awt.Color(204, 255, 204));
        jButtonTarikTunai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonTarikTunai.setForeground(new java.awt.Color(0, 51, 51));
        jButtonTarikTunai.setText("Tarik Tunai");
        jButtonTarikTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTarikTunaiActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTarikTunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 370, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Saldo Anda saat ini adalah");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 190, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/withdraw.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Masukkan Nominal");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jTextFieldJumlahTarik.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        jPanel1.add(jTextFieldJumlahTarik, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 370, 30));

        jLabelSaldoSaatIni.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelSaldoSaatIni.setForeground(new java.awt.Color(0, 51, 102));
        jLabelSaldoSaatIni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaldoSaatIni.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 102)));
        jPanel1.add(jLabelSaldoSaatIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 440, 330, 80));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 70, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Sistem_ATM.menu_ATM frame = new Sistem_ATM.menu_ATM();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean tarikTunai(double amount) {
        String noRekening = login.MainApp.akunLogin; // Mengambil noRekening dari akun yang login

        // Pastikan amount lebih dari 0 sebelum diproses
        if (amount <= 0) {
            System.out.println("Jumlah tarik harus lebih besar dari 0");
            return false;  // Tidak lanjut jika jumlah setor tidak valid
        }

        // Update saldo di database sesuai dengan nomor rekening yang login
        String sqlUpdateSaldo = "UPDATE user SET saldo = saldo - ? WHERE nomor_rekening = ?";
        String sqlInsertMutasi = "INSERT INTO mutasi (tanggal, nomor_rekening_pengirim, nomor_rekening_tujuan, saldo_awal, saldo_akhir, status) "
                + "VALUES (NOW(), ?, ?, ?, ?, ?)";

        Connection con1 = null;  // Koneksi ke database
        PreparedStatement pstmtUpdate = null;  // PreparedStatement untuk update saldo
        PreparedStatement pstmtMutasi = null;  // PreparedStatement untuk insert mutasi
        ResultSet rsSaldo = null;  // ResultSet untuk saldo

        try {
            // Membuat koneksi ke database menggunakan DriverManager
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bank", "root", "");

            // Cek saldo pengirim sebelum tarik tunai
            String sqlGetSaldo = "SELECT saldo FROM user WHERE nomor_rekening = ?";
            pstmtUpdate = con1.prepareStatement(sqlGetSaldo);
            pstmtUpdate.setString(1, noRekening);
            rsSaldo = pstmtUpdate.executeQuery();

            if (rsSaldo.next()) {
                double saldoPengirim = rsSaldo.getDouble("saldo");

                // Pastikan saldo cukup
                if (saldoPengirim < amount) {
                    System.out.println("Saldo tidak cukup");
                    return false;
                }

                // Update saldo pengirim
                pstmtUpdate = con1.prepareStatement(sqlUpdateSaldo);
                pstmtUpdate.setDouble(1, amount);
                pstmtUpdate.setString(2, noRekening);
                pstmtUpdate.executeUpdate();

                // Insert ke tabel mutasi dengan status "Tarik Tunai"
                pstmtMutasi = con1.prepareStatement(sqlInsertMutasi);
                pstmtMutasi.setString(1, noRekening);  // Pengirim
                pstmtMutasi.setString(2, null);         // Tidak ada tujuan untuk tarik tunai
                pstmtMutasi.setDouble(3, saldoPengirim);
                pstmtMutasi.setDouble(4, saldoPengirim - amount);
                pstmtMutasi.setString(5, "Tarik Tunai");  // Status transaksi
                pstmtMutasi.executeUpdate();

                System.out.println("Tarik tunai berhasil!");
                return true;
            } else {
                System.out.println("Rekening tidak ditemukan.");
                return false;
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            // Pastikan koneksi dan resource lainnya ditutup setelah digunakan
            try {
                if (rsSaldo != null) {
                    rsSaldo.close();
                }
                if (pstmtUpdate != null) {
                    pstmtUpdate.close();
                }
                if (pstmtMutasi != null) {
                    pstmtMutasi.close();
                }
                if (con1 != null) {
                    con1.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public double getSaldo(String noRekeningPengirim) {
        String sql = "SELECT saldo FROM user WHERE nomor_rekening = ?";
        double saldo = 0.0;

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Memuat driver dan membuat koneksi ke database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bank", "root", "");

            // Menyiapkan statement
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, noRekeningPengirim);

            // Mengeksekusi query
            rs = pstmt.executeQuery();
            if (rs.next()) {
                saldo = rs.getDouble("saldo"); // Sesuaikan nama kolom
            }
        } catch (Exception e) {
            e.printStackTrace(); // Menangkap semua pengecualian
        } finally {
            // Menutup semua resource
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return saldo;
    }

    private void jButtonTarikTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTarikTunaiActionPerformed
        double saldo = getSaldo(noRekening); // Mendapatkan saldo sebelum tarik tunai

        String amountText = jTextFieldJumlahTarik.getText();

        // Validasi input
        if (amountText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jumlah tarik tunai tidak boleh kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            if (amount <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah tarik harus lebih besar dari 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (amount > saldo) {
                JOptionPane.showMessageDialog(this, "Jumlah tarik tidak boleh melebihi dari saldo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Proses tarik tunai
            boolean success = tarikTunai(amount);
            if (success) {
                saldo -= amount; // Update saldo setelah tarik tunai
                JOptionPane.showMessageDialog(this, "Tarik tunai berhasil!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                jTextFieldJumlahTarik.setText(""); // Kosongkan field setelah berhasil
                jLabelSaldoSaatIni.setText("Rp " + saldo); // Menampilkan saldo yang sudah terupdate
            } else {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat tarik tunai.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Jumlah tarik tunai tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonTarikTunaiActionPerformed

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
            java.util.logging.Logger.getLogger(tarikTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tarikTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tarikTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tarikTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tarikTunai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonTarikTunai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelSaldoSaatIni;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldJumlahTarik;
    // End of variables declaration//GEN-END:variables
}
