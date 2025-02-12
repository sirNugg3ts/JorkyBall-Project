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

        getRootPane().setDefaultButton(searchBtn);
        idTextField.requestFocus();

        //botões desativados enquanto não tiver sócio
        disableButtons();

        if (bd.connect() == null) {
            JOptionPane.showMessageDialog(new Frame(), "Não foi possível ligar à base de dados\n"
                    + "O programa ainda não consegue funcionar em modo offline!\n"
                    + "Obtenha ligação à internet e volte a abrir o programa", "Erro!", JOptionPane.ERROR_MESSAGE);
            dispose();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SelectedIDlabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        labelCreditos = new javax.swing.JLabel();
        addCreditsBtn = new javax.swing.JButton();
        substractBtn = new javax.swing.JButton();
        howMuchLabel = new javax.swing.JTextField();
        newSocioBtn = new javax.swing.JButton();
        profilePicture = new javax.swing.JLabel();
        checkHistoryBtn = new javax.swing.JButton();
        massInsertBtn = new javax.swing.JButton();
        freeGamesLabel = new javax.swing.JLabel();
        jogogratisBtn = new javax.swing.JButton();
        jogosSeguidosLabel = new javax.swing.JLabel();
        fichaSocioBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JorkyBall Club Pombal");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        SelectedIDlabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SelectedIDlabel.setText("ID:");

        idTextField.setToolTipText("");
        idTextField.requestFocus();

        searchBtn.setText("Search");
        searchBtn.setToolTipText("");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        searchBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchBtnKeyPressed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        idLabel.setText("--");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel.setText("Nome: --");

        labelCreditos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        labelCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCreditos.setText("Créditos: --");

        addCreditsBtn.setText("Adicionar");
        addCreditsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCreditsBtnMouseClicked(evt);
            }
        });

        substractBtn.setText("Subtrair");
        substractBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                substractBtnMouseClicked(evt);
            }
        });

        newSocioBtn.setText("Novo Sócio");
        newSocioBtn.setToolTipText("");
        newSocioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newSocioBtnMouseClicked(evt);
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

        freeGamesLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        freeGamesLabel.setText("Jogos Grátis: 0");

        jogogratisBtn.setText("Usar Jogo Grátis");
        jogogratisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogogratisBtnMouseClicked(evt);
            }
        });

        jogosSeguidosLabel.setText("jogos seguidos: 0");

        fichaSocioBtn.setText("Ficha Sócio");
        fichaSocioBtn.setToolTipText("");
        fichaSocioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fichaSocioBtnMouseClicked(evt);
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
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SelectedIDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(massInsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newSocioBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkHistoryBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fichaSocioBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(addCreditsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(howMuchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jogogratisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(substractBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(freeGamesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jogosSeguidosLabel)))
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
                            .addComponent(idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(massInsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(profilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(labelCreditos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(newSocioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(fichaSocioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(freeGamesLabel)
                .addGap(18, 18, 18)
                .addComponent(jogosSeguidosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCreditsBtn)
                    .addComponent(howMuchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(substractBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jogogratisBtn)
                .addContainerGap())
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

    private void newSocioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newSocioBtnMouseClicked
        //abre janela para criar um novo sócio
        criarSocio criarSocio1 = new criarSocio();
        criarSocio1.setVisible(true);
    }//GEN-LAST:event_newSocioBtnMouseClicked

    private void substractBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_substractBtnMouseClicked

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
        updateInfo();
    }//GEN-LAST:event_substractBtnMouseClicked

    private void addCreditsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCreditsBtnMouseClicked
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
    }//GEN-LAST:event_addCreditsBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        //search button - gets socio from DB
        socio.getsSocioFromDB(Integer.parseInt(idTextField.getText()));
        updateInfo();
    }//GEN-LAST:event_searchBtnMouseClicked

    private void searchBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBtnKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchBtnKeyPressed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        socio.getsSocioFromDB(Integer.parseInt(idTextField.getText()));
        updateInfo();


    }//GEN-LAST:event_searchBtnActionPerformed

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

        try (Connection conn = bd.connectToHistory()) {

            //retirar 1 jogo gratis na BD
            PreparedStatement ps = conn.prepareStatement("UPDATE socios SET jogos_gratis = jogos_gratis - 1 WHERE id=?");
            ps.setInt(1, socio.getID());

            ps.executeUpdate();

            ps = conn.prepareStatement("UPDATE socios SET jogosTotal = jogosTotal + ? WHERE id = ?");
            ps.setInt(1, 1);
            ps.setInt(2, socio.getID());
            ps.executeUpdate();

            //registar no historico de creditos
            PreparedStatement ps2 = conn.prepareStatement("INSERT INTO historico_creditos (id,data,creditos,operacao) VALUES (?,?,?,?) ");
            ps2.setInt(1, socio.getID());
            ps2.setDate(2, new java.sql.Date(System.currentTimeMillis()));
            ps2.setInt(3, 0);
            ps2.setString(4, "Jogo Grátis");

            ps2.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "erro", JOptionPane.ERROR);
        }
        updateInfo();

    }//GEN-LAST:event_jogogratisBtnMouseClicked

    private void fichaSocioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fichaSocioBtnMouseClicked
        // TODO add your handling code here:
        fichaSócio fs = new fichaSócio(socio, profilePicture.getIcon());
        fs.setVisible(true);
    }//GEN-LAST:event_fichaSocioBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SelectedIDlabel;
    private javax.swing.JButton addCreditsBtn;
    private javax.swing.JButton checkHistoryBtn;
    private javax.swing.JButton fichaSocioBtn;
    private javax.swing.JLabel freeGamesLabel;
    private javax.swing.JTextField howMuchLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jogogratisBtn;
    private javax.swing.JLabel jogosSeguidosLabel;
    private javax.swing.JLabel labelCreditos;
    private javax.swing.JButton massInsertBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton newSocioBtn;
    private javax.swing.JLabel profilePicture;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton substractBtn;
    // End of variables declaration//GEN-END:variables

    private void updateInfo() {

        loadFoto();

        if (socio.getID() != -1) {
            //foi encontrado um sócio
            enableButtons();

            if (socio.getJogos_gratis() > 0) {

                //se tiver um jogo grátis para usar
                freeGamesLabel.setText("Jogos grátis: " + socio.getJogos_gratis());
                freeGamesLabel.setForeground(new Color(51, 153, 51));
                jogogratisBtn.setEnabled(true);
                jogogratisBtn.setContentAreaFilled(true);
            } else {
                freeGamesLabel.setText("Jogos Grátis: 0");
                freeGamesLabel.setForeground(Color.black);
                jogogratisBtn.setEnabled(false);
                jogogratisBtn.setContentAreaFilled(false);
            }

        } else {
            disableButtons();
        }

    }

    private void loadFoto() {
        ImageIcon foto;

        File file = new File("./img/" + socio.getID() + ".png"); //tenta obter o ficheiro da foto local

        idLabel.setText(String.valueOf(socio.getID()));
        nameLabel.setText("Nome: " + socio.getNome());
        labelCreditos.setText("Créditos: " + String.valueOf(socio.getCreditos()));
        jogosSeguidosLabel.setText("Jogos seguidos: " + String.valueOf(socio.getJogos_seguidos()));

        if (!file.isFile()) { //se não tem a foto local

            try { //procurar foto no servidor
                if (ftpClient.fileExistsInServer("/img/" + socio.getID() + ".png")) {
                    System.out.println("Foto disponível no servidor");

                    ftpClient.fileDownload(socio.getID());

                    foto = new ImageIcon("./img/" + socio.getID() + ".png");
                    Image image = foto.getImage();
                    Image newImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);//resize photo to 300 x 300
                    foto = new ImageIcon(newImage);
                    profilePicture.setIcon(foto);

                } else { //its not local or online
                    foto = new ImageIcon("./img/-1.png");
                    Image image = foto.getImage();
                    Image newImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
                    foto = new ImageIcon(newImage);
                    profilePicture.setIcon(foto);
                    System.out.println("O sócio selecionado não tem foto");
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex, "erro", JOptionPane.ERROR);
            }

        } else { //photo is available locally
            foto = new ImageIcon("./img/" + socio.getID() + ".png");
            Image image = foto.getImage();
            Image newImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH); //resize photo to 300x300
            foto = new ImageIcon(newImage);
            profilePicture.setIcon(foto);
        }
    }

    private void disableButtons() {
        checkHistoryBtn.setEnabled(false);
        substractBtn.setEnabled(false);
        addCreditsBtn.setEnabled(false);
        fichaSocioBtn.setEnabled(false);
        fichaSocioBtn.setContentAreaFilled(false);
        checkHistoryBtn.setContentAreaFilled(false);
        addCreditsBtn.setContentAreaFilled(false);
        substractBtn.setContentAreaFilled(false);
        jogogratisBtn.setEnabled(false);
        jogogratisBtn.setContentAreaFilled(false);
        freeGamesLabel.setText("Jogos grátis: 0");
        freeGamesLabel.setForeground(Color.black);
    }

    private void enableButtons() {
        checkHistoryBtn.setEnabled(true);
        substractBtn.setEnabled(true);
        addCreditsBtn.setEnabled(true);
        checkHistoryBtn.setContentAreaFilled(true);
        addCreditsBtn.setContentAreaFilled(true);
        substractBtn.setContentAreaFilled(true);
        fichaSocioBtn.setEnabled(true);
        fichaSocioBtn.setContentAreaFilled(true);

    }
}
