/*
© 2020, Diogo Pascoal. All rights reserved.
 */
package com.sirnugg3ts;

import javax.swing.Icon;

public class fichaSócio extends javax.swing.JFrame {

    public fichaSócio(Socio socio, Icon fotografiaSocio) {
        initComponents();

        foto.setIcon(fotografiaSocio);
        nome.setText("Nome: " + socio.getNome());
        dataNascimento.setText("Data de Nascimento: " + socio.getDataNascimento());
        dataInscricao.setText("Data de Nascimento: " + socio.getDataInscricao());
        jogosEfetuados.setText("Jogos Efetuados: " + String.valueOf(socio.getJogosTotal()));
        id.setText("ID: " + String.valueOf(socio.getID()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        dataNascimento = new javax.swing.JLabel();
        dataInscricao = new javax.swing.JLabel();
        jogosEfetuados = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ficha Sócio");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nome.setText("Nome:");

        dataNascimento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dataNascimento.setText("Data Nascimento:");

        dataInscricao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dataInscricao.setText("Data Inscrição:");

        jogosEfetuados.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jogosEfetuados.setText("Jogos Efetuados:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome)
                    .addComponent(dataNascimento)
                    .addComponent(dataInscricao)
                    .addComponent(jogosEfetuados))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(nome)
                .addGap(69, 69, 69)
                .addComponent(dataNascimento)
                .addGap(69, 69, 69)
                .addComponent(dataInscricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jogosEfetuados)
                .addGap(52, 52, 52))
        );

        foto.setMaximumSize(new java.awt.Dimension(300, 300));
        foto.setMinimumSize(new java.awt.Dimension(300, 300));

        id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(id)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dataInscricao;
    private javax.swing.JLabel dataNascimento;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jogosEfetuados;
    private javax.swing.JLabel nome;
    // End of variables declaration//GEN-END:variables
}
