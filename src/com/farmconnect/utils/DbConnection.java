package com.farmconnect.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/FarmConnect";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Ayush@3755";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public static void main(String[] args) {
        try (Connection connection = DbConnection.getConnection()) {
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
        }
    }

}
