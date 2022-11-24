package com.example.base;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {

    public Connection connection = null;
    public String jdbcURL = "jdbc:postgresql://46.229.214.241:5432/Popova";
    public String username;
    public String password;

    public void Connection() throws IOException, SQLException {


        try {
            //Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            connection = DriverManager.getConnection(jdbcURL, "Popova", "Popova");
            System.out.println("Connected");
            //return connection;

        } catch (SQLException e) {
            System.out.println("Error in connection");
            e.printStackTrace();
            //return null;
        }
    }

    public ResultSet gettable(String sql) {
        try {
            ResultSet rs = connection.createStatement().executeQuery(sql);
            return rs;
        } catch (Exception e) {
            return null;
        }

    }

}