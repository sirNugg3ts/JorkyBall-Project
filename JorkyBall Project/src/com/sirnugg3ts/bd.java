/*
© 2020, Diogo Pascoal. All rights reserved.
 */
package com.sirnugg3ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class bd {

    public static Connection connect() {
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "diariod2_jorky";
            String password = "pJF4tRM45x";
            String url = "jdbc:mysql://diariodeumdoutor.PT:3306/diariod2_jorky?currentSchema=socios&serverTimezone=UTC ";

            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return conn;
    }

    public static Connection connectToHistory() {
        Connection conn;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "diariod2_jorky";
            String password = "pJF4tRM45x";
            String url = "jdbc:mysql://diariodeumdoutor.PT:3306/diariod2_jorky?currentSchema=historicoCreditos&serverTimezone=UTC ";

            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return conn;
    }
}
