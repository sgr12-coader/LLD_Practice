package DesignPatterns.CreationalDesignPattern.ObjectPoolDesignPattern;


import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
//    Connection mysqlConnection;
    DBConnection(){
        try {
            System.out.println("Creating new connection");
//            mysqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:330", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
