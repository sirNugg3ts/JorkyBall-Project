/*
© 2020, Diogo Pascoal. All rights reserved.
 */
package com.sirnugg3ts;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

public class Socio {

    //propriedades do sócio
    private String nome;
    private int ID;
    private int creditos;
    private int numeroTlm;
    private String email;
    private java.sql.Date dataNascimento;
    private java.sql.Date dataInscricao;
    private int jogos_seguidos;
    private int jogos_gratis;
    private int jogosTotal;

    //construtor base
    public Socio() {
        nome = email = null;
        creditos = ID = jogos_seguidos = jogos_gratis = jogosTotal = -1;
        dataInscricao = dataNascimento = null;

    }

    public boolean insereNovoSocio() {
        //returns true if sucess uploading the new Socio
        try (Connection conn = bd.connect()) {
            PreparedStatement patat = conn.prepareStatement("INSERT INTO socios (id,nome,creditos,email,nTlm,dataNascimento,dataInscricao) VALUES (?, ?, ?,?,?,?,?)");
            patat.setInt(1, ID);
            patat.setString(2, nome);
            patat.setInt(3, creditos);
            patat.setString(4, email);
            patat.setInt(5, numeroTlm);
            patat.setDate(6, dataNascimento);
            patat.setDate(7, dataInscricao);

            patat.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void getsSocioFromDB(int id) {
        //gets ALL the info from an id
        try (Connection conn = bd.connect()) {

            Statement stat = conn.createStatement();
            boolean hasResultSet = stat.execute("SELECT nome,creditos,email,nTlm,dataNascimento,dataInscricao,jogos_seguidos,jogos_gratis,jogosTotal FROM socios WHERE id = " + id);
            if (hasResultSet) {
                ResultSet resultado = stat.getResultSet();
                resultado.next();

                this.ID = id;
                this.nome = resultado.getString("nome");
                this.creditos = resultado.getInt("creditos");
                this.email = resultado.getString("email");
                this.numeroTlm = resultado.getInt("nTlm");
                this.dataNascimento = resultado.getDate("dataNascimento");
                this.dataInscricao = resultado.getDate("dataInscricao");
                this.jogos_seguidos = resultado.getInt("jogos_seguidos");
                this.jogos_gratis = resultado.getInt("jogos_gratis");
                this.jogosTotal = resultado.getInt("jogosTotal");
            }
        } catch (Exception e) {
            System.err.println(e);
            this.nome = this.email = null;
            ID = creditos = numeroTlm = jogos_gratis = jogos_seguidos = jogosTotal = -1;
            dataNascimento = dataInscricao = null;
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getLastID() {
        try (Connection conn = bd.connect(); Statement stat = conn.createStatement()) {
            boolean hasResultSet = stat.execute("SELECT id FROM socios ORDER BY id DESC limit 1");
            if (hasResultSet) {
                ResultSet resultado = stat.getResultSet();
                resultado.next();

                return resultado.getInt("id");
            }
        } catch (SQLException ex) {
        }
        return -1;
    }

    public void updateCreditos(boolean op, int alt) {
        //if op == true -> adicionar
        //if op == false -> remover
        //alt -> quantidade de créditos a serem usados

        //o objeto Sócio do programa já está atualizado, esta função irá apenas enviar a informação
        try (Connection conn = bd.connect()) {
            PreparedStatement patat = conn.prepareStatement("UPDATE socios SET creditos = ? WHERE id = ?");

            patat.setInt(1, creditos);
            patat.setInt(2, ID);
            patat.executeUpdate();

            patat = conn.prepareStatement("UPDATE socios SET jogosTotal = jogosTotal + ? WHERE id = ?");
            patat.setInt(1, alt);
            patat.setInt(2, ID);
            patat.executeUpdate();

            //vai registar a alteração na tabela historico_creditos
            //SE ESTA FUNÇÃO NÃO ESTIVER A FUNCIONAR, INSERIR conn.setSchema("historico_creditos")
            //conn.setSchema("historico_creditos");
            PreparedStatement patat2 = conn.prepareStatement("INSERT INTO historico_creditos (id,data,creditos,operacao) VALUES (?,?,?,?)");
            patat2.setInt(1, ID);
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            patat2.setDate(2, sqlDate);
            patat2.setInt(3, alt);

            if (op) {
                patat2.setString(4, "adicionar");
            } else {
                patat2.setString(4, "remover");
            }

            patat2.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateJogosSeguidos() {
        try (Connection conn = bd.connect()) {
            PreparedStatement p = conn.prepareStatement("UPDATE socios SET jogos_seguidos=?,jogos_gratis=? WHERE id=?");
            p.setInt(1, jogos_seguidos);
            p.setInt(2, jogos_gratis);
            p.setInt(3, ID);
            p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "erro", JOptionPane.ERROR);
        }
    }

    public void displayAllData() {
        try (Connection conn = bd.connect(); Statement stat = conn.createStatement()) {

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

    public int getNumeroTlm() {
        return numeroTlm;
    }

    public void setNumeroTlm(int numeroTlm) {
        this.numeroTlm = numeroTlm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.sql.Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(java.sql.Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public java.sql.Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(java.sql.Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public int getJogos_seguidos() {
        return jogos_seguidos;
    }

    public void setJogos_seguidos(int jogos_seguidos) {
        this.jogos_seguidos = jogos_seguidos;
    }

    public int getJogos_gratis() {
        return jogos_gratis;
    }

    public void setJogos_gratis(int jogos_gratis) {
        this.jogos_gratis = jogos_gratis;
    }

    public int getJogosTotal() {
        return jogosTotal;
    }

    public void setJogosTotal(int jogosTotal) {
        this.jogosTotal = jogosTotal;
    }
}
