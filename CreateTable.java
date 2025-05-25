package org.example;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CreateTable {
    public static void main(String[] args) throws SQLException {


        String url = "jdbc:mysql://localhost:3306/bookstore_db";
        String user = "root";
        String password = "5140.Dream";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        String createTableSQL = "CREATE TABLE books (" +
                "id int primary key," +
                "title varchar(100) not null," +
                "author varchar(100) not null," +
                "price decimal(10, 2) not null)";

        statement.executeUpdate(createTableSQL);
        System.out.println("Table ‘books’ created successfully.");
    }
}

