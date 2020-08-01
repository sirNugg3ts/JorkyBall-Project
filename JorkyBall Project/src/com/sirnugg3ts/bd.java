/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sirnugg3ts;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class bd {
    
    public static Connection connect() throws SQLException{
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "sql7357963";
            String password = "pJF4tRM45x";
            String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7357963?serverTimezone=UTC ";
            
            conn = DriverManager.getConnection(url, username, password);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(new Frame(), ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return null;
        }
        return conn;
    }
    
}
