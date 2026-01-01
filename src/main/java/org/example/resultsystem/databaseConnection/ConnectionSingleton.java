package org.example.resultsystem.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static final String DB_HOST = "localhost";
    private static final String DB_NAME = "no";
    private static final String DB_USER_NAME = "root";
    private static final String DB_PASSWORD = "Aa1!Bb2@";
    private static final String DB_URL = "jdbc:mysql://"+DB_HOST+"/"+DB_NAME;
    private static Connection connection;
    private static ConnectionSingleton singleton = new ConnectionSingleton();
    private  ConnectionSingleton(){
        try {

            connection = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
