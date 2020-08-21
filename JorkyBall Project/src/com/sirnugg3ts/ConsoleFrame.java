/*
© 2020, Diogo Pascoal. All rights reserved.
 */
package com.sirnugg3ts;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;

public class ConsoleFrame extends javax.swing.JFrame {

    Socio socio = new Socio();

    public ConsoleFrame() {

        initComponents();
        getRootPane().setDefaultButton(jButton1);
        jTextField1.requestFocus();

        //botões desativados enquanto não tiver sócio
        checkHistoryBtn.setEnabled(false);
        jButton3.setEnabled(false);
        jButton2.setEnabled(false);
        jogogratisBtn.setEnabled(false);
        //

        try {
            if (bd.connect() == null) {
                JOptionPane.showMessageDialog(new Frame(), "Não foi possível ligar à base de dados\n"
                        + "O programa ainda não consegue funcionar em modo offline!\n"
                        + "Obtenha ligação à internet e volte a abrir o programa", "Erro!", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SelectedIDlabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        howMuchLabel = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        profilePiicture = new javax.swing.JLabel();
        checkHistoryBtn = new javax.swing.JButton();
        massInsertBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jogogratisBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JorkyBall Club Pombal");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        SelectedIDlabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SelectedIDlabel.setText("ID:");

        jTextField1.setToolTipText("id");
        jTextField1.requestFocus();

        jButton1.setText("Search");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("--");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nome: --");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Créditos: --");

        jButton2.setText("Adicionar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Subtrair");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Novo Sócio");
        jButton4.setToolTipText("");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        checkHistoryBtn.setText("Histórico");
        checkHistoryBtn.setToolTipText("");
        checkHistoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkHistoryBtnMouseClicked(evt);
            }
        });

        massInsertBtn.setText("Alterar vários");
        massInsertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                massInsertBtnMouseClicked(evt);
            }
        });

        jLabel4.setText("Jogos Grátis: 0");

        jogogratisBtn.setText("Usar Jogo Grátis");
        jogogratisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogogratisBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SelectedIDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(massInsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profilePiicture, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkHistoryBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(howMuchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jogogratisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectedIDlabel)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(massInsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(profilePiicture, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(howMuchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jogogratisBtn)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //abre janela para criar um novo sócio
        criarSocio criarSocio1 = new criarSocio();
        criarSocio1.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        //botão para remover créditos
        int creditosRem = Integer.parseInt(howMuchLabel.getText());

        if (socio.getCreditos() - creditosRem < 0) {
            System.err.println("Quantidade Inválida");
            JOptionPane.showMessageDialog(new Frame(), "O sócio não tem créditos suficientes!", "Quantidade Inválida", JOptionPane.WARNING_MESSAGE);
        } else {
            if (creditosRem > 1) {
                JOptionPane.showMessageDialog(new Frame(), "Atenção!\nCada crédito corresponde a 1 jogo para obter o jogo grátis\n"
                        + "Caso este não seja o objetivo, por favor informar Diogo Pascoal para corrigir o erro!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }

            for (int j = 0; j < creditosRem; j++) {

                //se tiver jogos gratis perguntar se o quer usar
                if (socio.getJogos_gratis() > 0 && creditosRem > 1 && j>0) {

                    Object[] options = {"Sim", "Não"};
                    int opcao = JOptionPane.showOptionDialog(null, "O sócio " + socio.getNome() + " tem um jogo grátis que pode usar em vez de um crédito, deseja utilizar?",
                            "Jogo Grátis por usar",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "Não");
                    if (opcao == 0) {
                        socio.setJogos_gratis(socio.getJogos_gratis() - 1);
                        //atualizar no servidor

                        try ( Connection con = bd.connect()) {
                            PreparedStatement ps = con.prepareStatement("UPDATE socios SET jogos_gratis = jogos_gratis - ? WHERE id=?");
                            ps.setInt(1, 1);
                            ps.setInt(2, socio.getID());
                            ps.executeUpdate();

                            //registar no historico de creditos os jogos gratis
                            PreparedStatement ps2 = con.prepareStatement("INSERT INTO historico_creditos (id,data,creditos,operacao) VALUES (?,?,?,?) ");
                            ps2.setInt(1, socio.getID());
                            ps2.setDate(2, new java.sql.Date(System.currentTimeMillis()));
                            ps2.setInt(3, 0);
                            ps2.setString(4, "Jogo Grátis");
                            ps2.executeUpdate();
                        } catch (SQLException e) {

                        }

                    }

                } else {
                    //se não tiver jogos gratis para usar, tirar 1 crédito
                    socio.setCreditos(socio.getCreditos() - 1);
                    socio.setJogos_seguidos(socio.getJogos_seguidos() + 1);

                    if (socio.getJogos_seguidos() >= jorkyball.JOGOSGRATIS) {
                        JOptionPane.showMessageDialog(new Frame(), "O sócio " + socio.getNome() + "ganhou 1 jogo grátis!", "Jogo Grátis!", JOptionPane.INFORMATION_MESSAGE);
                        socio.setJogos_seguidos(socio.getJogos_seguidos() - jorkyball.JOGOSGRATIS);
                        socio.setJogos_gratis(socio.getJogos_gratis() + 1);

                    }
                    socio.updateCreditos(false, 1);
                    socio.updateJogosSeguidos();

                }

            }
        }

        updateInfo();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //botão que adiciona créditos
        int creditosAdd = Integer.parseInt(howMuchLabel.getText());
        System.out.println("Adicionar " + creditosAdd + "creditos");
        if (socio.getID() == -1) {
            System.err.println("NENHUM SÓCIO SELECIONADO");
        } else {
            socio.setCreditos(socio.getCreditos() + creditosAdd);
            System.out.println("Creditos do socio atualizado");
            socio.updateCreditos(true, creditosAdd);
            System.out.println("Informação uploaded");
            updateInfo();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //search button - gets socio from DB
        socio.getsSocioFromDB(Integer.parseInt(jTextField1.getText()));
        updateInfo();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        socio.getsSocioFromDB(Integer.parseInt(jTextField1.getText()));
        updateInfo();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkHistoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkHistoryBtnMouseClicked
        CheckHistory ch = new CheckHistory(socio.getID());
        ch.setVisible(true);
    }//GEN-LAST:event_checkHistoryBtnMouseClicked

    private void massInsertBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_massInsertBtnMouseClicked
        massInsert mi = new massInsert();
        mi.setVisible(true);
    }//GEN-LAST:event_massInsertBtnMouseClicked

    private void jogogratisBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogogratisBtnMouseClicked
        //função quando o jogador quer usar um jogo grátis

        socio.setJogos_gratis(socio.getJogos_gratis() - 1);

        try {
            Connection conn = bd.connectToHistory();

            //retirar o jogo gratis na BD
            PreparedStatement ps = conn.prepareStatement("UPDATE socios SET jogos_gratis = jogos_gratis - 1 WHERE id=?");
            ps.setInt(1, socio.getID());

            ps.executeUpdate();

            //registar no historico de creditos
            PreparedStatement ps2 = conn.prepareStatement("INSERT INTO historico_creditos (id,data,creditos,operacao) VALUES (?,?,?,?) ");
            ps2.setInt(1, socio.getID());
            ps2.setDate(2, new java.sql.Date(System.currentTimeMillis()));
            ps2.setInt(3, 0);
            ps2.setString(4, "Jogo Grátis");

            ps2.executeUpdate();

        } catch (SQLException ex) {

        }

        updateInfo();


    }//GEN-LAST:event_jogogratisBtnMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SelectedIDlabel;
    private javax.swing.JButton checkHistoryBtn;
    private javax.swing.JTextField howMuchLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jogogratisBtn;
    private javax.swing.JButton massInsertBtn;
    private javax.swing.JLabel profilePiicture;
    // End of variables declaration//GEN-END:variables

    private void updateInfo() {

        ImageIcon foto;

        //esta funcao apenas atualiza o NOME, ID, CRÉDITOS e JOGOS GRATIS
        //o resto da informação está atualizada no sócio mas esta função apenas atualiza o GUI
        boolean isOnServer; //verifica se a foto está no servidor
        File file = new File("./img/" + socio.getID() + ".png"); //tenta obter o ficheiro da foto local

        //jLabel1 -> Nome do sócio
        //jLabel2 -> ID do sócio
        //jLabel3 -> créditos do sócio
        jLabel1.setText(String.valueOf(socio.getID()));
        jLabel2.setText("Nome: " + socio.getNome());
        jLabel3.setText("Créditos: " + String.valueOf(socio.getCreditos()));

        if (!file.isFile()) { //se não tem a foto local

            try {
                isOnServer = ftpClient.fileExistsInServer("/img/" + socio.getID() + ".png"); //procurar o ficheiro no servidor ftp
                System.out.println(isOnServer);
                if (isOnServer) {
                    ftpClient.fileDownload(socio.getID());

                    foto = new ImageIcon("./img/" + socio.getID() + ".png");
                    Image image = foto.getImage();
                    Image newImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
                    foto = new ImageIcon(newImage);
                    profilePiicture.setIcon(foto);

                } else {
                    foto = new ImageIcon("./img/" + socio.getID() + ".png");
                    Image image = foto.getImage();
                    Image newImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
                    foto = new ImageIcon(newImage);
                    profilePiicture.setIcon(foto);
                    System.out.println("it aint here or server");
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(new Frame(), ex, "erro", JOptionPane.ERROR);
            }

        } else {
            foto = new ImageIcon("./img/" + socio.getID() + ".png");
            Image image = foto.getImage();
            Image newImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
            foto = new ImageIcon(newImage);
            profilePiicture.setIcon(foto);
            //profilePiicture.setIcon(new javax.swing.ImageIcon("./img/" + socio.getID() + ".png"));
        }

        if (socio.getID() != -1) {
            //foi encontrado um sócio
            checkHistoryBtn.setEnabled(true);
            jButton3.setEnabled(true);
            jButton2.setEnabled(true);
            checkHistoryBtn.setContentAreaFilled(true);
            jButton2.setContentAreaFilled(true);
            jButton3.setContentAreaFilled(true);

            if (socio.getJogos_gratis() > 0) {

                //se tiver um jogo grátis para usar
                jLabel4.setText("Jogos grátis: " + socio.getJogos_gratis());
                jLabel4.setForeground(new Color(51, 153, 51));
                jogogratisBtn.setEnabled(true);
                jogogratisBtn.setContentAreaFilled(true);
            } else {
                jLabel4.setText("Jogos Grátis: 0");
                jLabel4.setForeground(Color.black);
                jogogratisBtn.setEnabled(false);
                jogogratisBtn.setContentAreaFilled(false);
            }

        } else {
            checkHistoryBtn.setEnabled(false);
            jButton3.setEnabled(false);
            jButton2.setEnabled(false);
            checkHistoryBtn.setContentAreaFilled(false);
            jButton2.setContentAreaFilled(false);
            jButton3.setContentAreaFilled(false);
            jogogratisBtn.setEnabled(false);
            jogogratisBtn.setContentAreaFilled(false);
            jLabel4.setText("Jogos grátis: 0");
            jLabel4.setForeground(Color.black);
        }

    }
}
