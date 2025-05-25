package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class InsertBook {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/bookstore_db";
        String username = "root";
        String password = "5140.Dream";

        String sql = "INSERT INTO books (id, title, author, price) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, 1);
            stmt.setString(2, "Yelim Ejat");
            stmt.setString(3, "Hadis Alemayehu");
            stmt.setDouble(4, 250.0);

            int rowsInserted = stmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
