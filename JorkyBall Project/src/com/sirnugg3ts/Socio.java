/*
© 2020, Diogo Pascoal. All rights reserved.
*/
package com.sirnugg3ts;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class Socio {

    private String nome;
    private int ID;
    private int creditos;

    public Socio(String nome, int ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public Socio() {
        nome = null;
        ID = -1;
        creditos = -1;

    }

    public boolean insereNovoSocio() throws SQLException {
        try ( Connection conn = bd.connect();  PreparedStatement patat = conn.prepareStatement("INSERT INTO socios (id,nome,creditos) VALUES (?, ?, ?)")) {

            patat.setInt(1, ID);
            patat.setString(2, nome);
            patat.setInt(3, creditos);

            patat.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new Frame(), e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;

        }
        return true;
    }

    public void getsSocioFromDB(int id) throws SQLException {
        try ( Connection conn = bd.connect();  Statement stat = conn.createStatement()) {
            boolean hasResultSet = stat.execute("SELECT nome,creditos FROM socios WHERE id = " + id);
            if (hasResultSet) {
                ResultSet resultado = stat.getResultSet();
                resultado.next();

                this.ID = id;
                this.nome = resultado.getString("nome");
                this.creditos = resultado.getInt("creditos");
            } else {
                System.out.println("ID INVÁLIDO!");

            }
        } catch (Exception e) {
            System.err.println(e);
            this.ID = -1;
            this.nome = null;
            this.creditos = -1;
            JOptionPane.showMessageDialog(new Frame(), e, "Erro!", JOptionPane.ERROR_MESSAGE);

        }
    }

    public int getLastID() throws SQLException {
        try ( Connection conn = bd.connect();  Statement stat = conn.createStatement()) {
            boolean hasResultSet = stat.execute("SELECT id FROM socios ORDER BY id DESC limit 1");
            if (hasResultSet) {
                ResultSet resultado = stat.getResultSet();
                resultado.next();

                return resultado.getInt("id");
            } else {
                return -1;
            }
        }
    }

    public void updateCreditos() throws SQLException {
        try ( Connection conn = bd.connect();  PreparedStatement patat = conn.prepareStatement("UPDATE socios SET creditos = ? WHERE id = ?")) {
            patat.setInt(1, creditos);
            patat.setInt(2, ID);

            patat.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new Frame(), e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getID() {
        return ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void displayAllData() {
        try ( Connection conn = bd.connect();  Statement stat = conn.createStatement()) {

            boolean hasResultSet = stat.execute("SELECT * FROM socios");

            if (hasResultSet) {
                ResultSet result = stat.getResultSet();
                ResultSetMetaData metaData = result.getMetaData();

                int columnCount = metaData.getColumnCount();

                //display column labels
                for (int i = 1; i <= columnCount; i++) {
                    System.out.println(metaData.getColumnLabel(i) + "\t\t");

                }
                System.out.println();

                while (result.next()) {
                    System.out.println(result.getInt("id") + result.getString("nome") + result.getInt("creditos"));
                }
            }

        } catch (SQLException e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

}
