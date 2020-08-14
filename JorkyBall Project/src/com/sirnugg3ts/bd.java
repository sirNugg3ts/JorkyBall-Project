/*
© 2020, Diogo Pascoal. All rights reserved.
*/
package com.sirnugg3ts;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class bd {
    
    

    public static Connection connect() throws SQLException {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "diariod2_jorky";
            String password = "pJF4tRM45x";
            String url = "jdbc:mysql://diariodeumdoutor.PT:3306/diariod2_jorky?currentSchema=socios&serverTimezone=UTC ";

            conn = DriverManager.getConnection(url, username, password);

        } catch (Exception ex) {
            return null;
        }
        return conn;
    }
    public static Connection connectToHistory() throws SQLException{
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "diariod2_jorky";
            String password = "pJF4tRM45x";
            String url = "jdbc:mysql://diariodeumdoutor.PT:3306/diariod2_jorky?currentSchema=historicoCreditos&serverTimezone=UTC ";

            conn = DriverManager.getConnection(url, username, password);
            

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(new Frame(), ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return null;
        }
        return conn;
    }

}
