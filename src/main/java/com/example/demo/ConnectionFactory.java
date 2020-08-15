package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){

        System.out.println("Conectando ao Banco");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/apirest?useTimezone=true&serverTimezone=UTC", "root", "");
        }catch(SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}