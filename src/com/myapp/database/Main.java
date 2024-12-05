/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.database;
import com.myapp.database.ConnectDB;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String args[]) throws SQLException {
        Connection koneksi = ConnectDB.buat();

    }

    public class Teller {

        public boolean validatePin(String noRekening, String pin) {
            String sql = "SELECT * FROM user WHERE nomor_rekening = ? AND pin = ?";
            try (Connection conn = ConnectDB.buat(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, noRekening);
                pstmt.setString(2, pin);

                ResultSet rs = pstmt.executeQuery();
                return rs.next(); // Kembali true jika data ditemukan
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
    }
}
