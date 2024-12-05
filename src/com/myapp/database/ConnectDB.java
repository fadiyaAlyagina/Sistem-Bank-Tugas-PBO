package com.myapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static Connection mKoneksi;

    // Method untuk membuat koneksi
    public static Connection buat() {
        // URL koneksi, sesuaikan jika Workbench menggunakan port atau host yang berbeda
        String url = "jdbc:mysql://localhost:3306/db_bank"; // pastikan db_teller adalah nama database yang benar
        String user = "root";  // username, sesuaikan dengan kredensial MySQL kamu
        String pass = ""; // password, sesuaikan dengan password MySQL kamu

        if (mKoneksi == null) {
            try {
                // Memastikan driver MySQL dimuat dengan benar
                Class.forName("com.mysql.cj.jdbc.Driver");  // Pastikan menggunakan driver yang sesuai
                
                // Menggunakan URL, username, dan password yang benar
                mKoneksi = DriverManager.getConnection(url, user, pass);
                
                System.out.println("Koneksi berhasil!");
            } catch (ClassNotFoundException ex) {
                System.out.println("Driver tidak ditemukan: " + ex);
            } catch (SQLException ex) {
                System.out.println("Koneksi gagal: " + ex);
            }
        }

        return mKoneksi;
    }

    // Method untuk menutup koneksi setelah operasi selesai
//    public static void tutupKoneksi() {
//        try {
//            if (mKoneksi != null && !mKoneksi.isClosed()) {
//                mKoneksi.close();
//                System.out.println("Koneksi ditutup!");
//            }
//        } catch (SQLException e) {
//            System.out.println("Error saat menutup koneksi: " + e.getMessage());
//        }
//    }

    public static void main(String[] args) {
        // Tes koneksi
        Connection connection = ConnectDB.buat();

        if (connection != null) {
            System.out.println("Koneksi berhasil!");
        } else {
            System.out.println("Koneksi gagal.");
        }

        // Setelah operasi selesai, kita bisa menutup koneksi
        //ConnectDB.tutupKoneksi();
    }
}
