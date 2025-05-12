package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;

    public Connn() {
        try {
            // Establish connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "Sp11370@sql");

            if (connection != null) {
                System.out.println("✅ Database connection established successfully.");
            } else {
                System.out.println("❌ Failed to establish database connection.");
            }

            // Create statement only if connection is valid
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("❌ SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ General Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Connn(); // To test the connection
    }
}
