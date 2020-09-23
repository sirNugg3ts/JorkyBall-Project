/*
© 2020, Diogo Pascoal. All rights reserved.
 */
package com.sirnugg3ts;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class massInsert extends javax.swing.JFrame {

    ArrayList<Integer> listaID = new ArrayList<>();
    ArrayList<Integer> listaDeIDaAlterar = new ArrayList<>();

    public massInsert() {
        initComponents();

        try {
            listaID = obtemListaId();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }

    public static ArrayList<Integer> obtemListaId() throws SQLException {
        ArrayList<Integer> lista = new ArrayList<>();
        Connection conn = bd.connect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id FROM socios");
        while (rs.next()) {
            int novoID = rs.getInt("id");
            lista.add(novoID);
        }
        return lista;
    }

    public boolean checkIfIdExists(int id) {

        for (int i = 0; i < listaID.size(); i++) {
            if (id == listaID.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void addIdToTableGUI(int newID) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[1];
        row[0] = newID;
        model.addRow(row);
        jTable1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idadicionar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID a adicionar:");

        jButton1.setText("adicionar ID");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Selecionado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Créditos:");

        jButton2.setText("Adicionar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Remover");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jButton3)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int id = Integer.parseInt(idadicionar.getText());
        if (checkIfIdExists(id)) {

            boolean isAlreadyIn = false;

            for (int i = 0; i < listaDeIDaAlterar.size(); i++) {
                if (id == listaDeIDaAlterar.get(i)) {
                    isAlreadyIn = true;
                    break;
                }
            }

            if (!isAlreadyIn) {
                listaDeIDaAlterar.add(id);
                addIdToTableGUI(id);
            } else {
                JOptionPane.showMessageDialog(null, "ID repetido", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este ID não existe!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int creditosAdd = Integer.parseInt(jTextField1.getText());

        for (int i = 0; i < listaDeIDaAlterar.size(); i++) {
            Socio socio_atualizar = new Socio();
            socio_atualizar.getsSocioFromDB(listaDeIDaAlterar.get(i));

            socio_atualizar.setCreditos(socio_atualizar.getCreditos() + creditosAdd);

            socio_atualizar.updateCreditos(true, creditosAdd);
        }
        JOptionPane.showMessageDialog(null, "Operações Concluídas", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        int creditosRem = Integer.parseInt(jTextField1.getText());

        for (int i = 0; i < listaDeIDaAlterar.size(); i++) {

            Socio socio_atualizar = new Socio();
            socio_atualizar.getsSocioFromDB(listaDeIDaAlterar.get(i));

            //verificar se tem creditos suficientes ou jogos grátis para 
            if (socio_atualizar.getCreditos() + socio_atualizar.getJogos_gratis() < creditosRem) {

                JOptionPane.showMessageDialog(null, "O Sócio com ID " + socio_atualizar.getID() + " não tem créditos suficientes\n"
                        + "Não serão removidos créditos", "Erro de créditos!", JOptionPane.WARNING_MESSAGE);

                break;

            } else // se conseguir pagar com os jogos gratis que tem
            if (socio_atualizar.getJogos_gratis() >= creditosRem) {

                Object[] options = {"Sim", "Não"};
                int opcao = JOptionPane.showOptionDialog(null, "O sócio " + socio_atualizar.getNome() + " tem jogos grátis que pode usar em vez de créditos (que não são suficientes), deseja utilizar?",
                        "Jogo Grátis por usar",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "Não");
                if (opcao == 0) {
                    socio_atualizar.setJogos_gratis(socio_atualizar.getJogos_gratis() - creditosRem);
                    try {
                        Connection conn = bd.connect();

                        //retirar o jogo gratis na BD
                        PreparedStatement ps = conn.prepareStatement("UPDATE socios SET jogos_gratis = jogos_gratis - ? WHERE id=?");
                        ps.setInt(1, creditosRem);
                        ps.setInt(2, socio_atualizar.getID());

                        ps.executeUpdate();

                        //registar no historico de creditos
                        PreparedStatement ps2 = conn.prepareStatement("INSERT INTO historico_creditos (id,data,creditos,operacao) VALUES (?,?,?,?) ");
                        ps2.setInt(1, socio_atualizar.getID());
                        ps2.setDate(2, new java.sql.Date(System.currentTimeMillis()));
                        ps2.setInt(3, 1);
                        ps2.setString(4, "Jogo Grátis");
                        ps2.executeUpdate();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex, "erro", JOptionPane.ERROR);
                    }

                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "O sócio " + socio_atualizar.getNome() + " não tem créditos suficientes!", "Faltam créditos!", JOptionPane.ERROR);
                    break;
                }
            }

            for (int j = 0; j < creditosRem; j++) {

                socio_atualizar.setCreditos(socio_atualizar.getCreditos() - 1);
                socio_atualizar.setJogos_seguidos(socio_atualizar.getJogos_seguidos() + 1);

                if (socio_atualizar.getJogos_seguidos() >= jorkyball.JOGOSGRATIS) {
                    JOptionPane.showMessageDialog(null, "O sócio " + socio_atualizar.getNome() + "ganhou 1 jogo grátis!", "Jogo Grátis!", JOptionPane.INFORMATION_MESSAGE);
                    socio_atualizar.setJogos_seguidos(socio_atualizar.getJogos_seguidos() - jorkyball.JOGOSGRATIS);
                    socio_atualizar.setJogos_gratis(socio_atualizar.getJogos_gratis() + 1);

                }
                socio_atualizar.updateCreditos(false, 1);
                socio_atualizar.updateJogosSeguidos();

            }

        }
        JOptionPane.showMessageDialog(null, "Operações Concluídas", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idadicionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
