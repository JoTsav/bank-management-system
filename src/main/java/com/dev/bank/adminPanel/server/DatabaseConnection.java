package com.dev.bank.adminPanel.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {

    static String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";
    static String username = "root";
    static String password = ""; // insert local MySQL database password 
    static Statement statement;

    static Statement Connection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            java.sql.Connection connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statement;
    }
}
