package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDataBase {
    static Connection connection;
    public static Connection openConnection() {
        String url = "jdbc:mysql://localhost:3306/voyadatabase";
        String username = "root";
        String password = "root";
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
