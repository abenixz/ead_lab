package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bookstore_db";
        String user = "root";
        String password = "5140.Dream";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database successfully");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
