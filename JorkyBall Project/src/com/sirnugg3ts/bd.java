/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sirnugg3ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diogo
 */
public class bd {
    
    public static Connection connect() throws SQLException{
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "root";
            String password = "4k60fps5ms";
            String url = "jdbc:mysql://localhost:3306/socios?serverTimezone=UTC ";
            
            conn = DriverManager.getConnection(url, username, password);
            
        } catch (Exception ex) {
            System.err.println("Erro ao ligar à base de dados");
            ex.printStackTrace();
        }
        return conn;
    }
    
}
