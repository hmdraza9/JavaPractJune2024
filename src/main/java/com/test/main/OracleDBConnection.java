package com.test.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDBConnection {
    public static void main(String[] args) {
        // Database Connection Details
        String url = "jdbc:oracle:thin:@localhost:1521:ORCLCDB"; // Replace XE with your DB Service Name
        String user = "sys as sysdba";  // Replace with your Oracle username
        String password = "mypassword"; // Replace with your Oracle password

        // Establishing connection
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to Oracle Database!");

            // Run SELECT Query
            String selectQuery = "SELECT * FROM employees";
            try (PreparedStatement stmt = conn.prepareStatement(selectQuery);
                 ResultSet rs = stmt.executeQuery()) {
                    System.out.println("rs.toString(): "+rs.toString());

                while (rs.next()) {
                    System.out.println("Employee ID: " + rs.getInt("employee_id") +
                            ", Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}