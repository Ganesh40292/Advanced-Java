package com.assignment;

import java.sql.*;

public class Assignment5JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";       // change if needed
        String password = "Ganesh";   // your MySQL password

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Display result
            System.out.println("USN\tName\tBranch");
            while (rs.next()) {
                String usn = rs.getString("usn");
                String name = rs.getString("name");
                String branch = rs.getString("branch");

                System.out.println(usn + "\t" + name + "\t" + branch);
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}