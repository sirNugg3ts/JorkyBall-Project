/*
© 2020, Diogo Pascoal. All rights reserved.
*/

package com.sirnugg3ts;

import java.util.Scanner;


public class jorkyball {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsoleFrame().setVisible(true);

            }
        });

            boolean keepGoing = true;

            Scanner teclado = new Scanner(System.in);

            System.out.println("JorkyBall Clube Pombal - Gestor de créditos\n"
                    + "Made by: Diogo Pascoal 2020");

            while (keepGoing) {
                int option;

                System.out.println("\n*******************\n");

                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Retirar créditos a um sócio");
                System.out.println("2 - Adicionar créditos a um sócio");
                System.out.println("3 - Criar um sócio");
                System.out.println("4 - Sair");

                option = teclado.nextInt();

                switch (option) {
                    case 1: {
                        int idSocio, creditosAremover;
                        System.out.println("\nInsira o ID do sócio: ");
                        idSocio = teclado.nextInt();

                        Socio socio = new Socio();

                       
                            socio.getsSocioFromDB(idSocio);
                       

                        System.out.println("\nO sócio tem " + socio.getCreditos() + " créditos");
                        System.out.println("\nQuantos créditos deseja remover?");
                        System.out.println("\nCréditos a remover: ");
                        creditosAremover = teclado.nextInt();

                        if (socio.getCreditos() - creditosAremover < 0) {
                            System.out.println("\nNão pode remover esta quantidade de créditos");
                        } else {
                            socio.setCreditos(socio.getCreditos() - creditosAremover);

                                socio.updateCreditos(false,creditosAremover);
                        }
                        break;
                    }

                    case 2: {
                        int idSocio, creditosAadicionar;
                        System.out.println("\nInsira o ID do sócio: ");
                        idSocio = teclado.nextInt();

                        Socio socio = new Socio();

                        
                            socio.getsSocioFromDB(idSocio);
                       
                       

                        System.out.println("\nO sócio tem " + socio.getCreditos() + " créditos");
                        System.out.println("\nQuantos créditos deseja adicionar?");
                        System.out.println("\nCréditos a adicionar: ");
                        creditosAadicionar = teclado.nextInt();

                        if (creditosAadicionar < 0) {
                            System.out.println("Valor inválido");
                        } else {
                            socio.setCreditos(socio.getCreditos() + creditosAadicionar);
                                socio.updateCreditos(true,creditosAadicionar);
                        }
                        break;
                    }

                    case 3: {
                        Socio socio = new Socio();
                            socio.setID(socio.getLastID() + 1);
                        Scanner readName = new Scanner(System.in);
                        System.out.println("O ID deste novo sócio será " + socio.getID());

                        System.out.println("Insira o nome do novo sócio: ");
                        socio.setNome(readName.nextLine());

                        System.out.println(socio.getNome());

                        socio.setCreditos(0);

                            socio.insereNovoSocio();
                            System.out.println("Novo Sócio adicionado com sucesso!");
                        break;
                    }
                    case 4: {
                        keepGoing = false;
                        break;
                    }
                    default:
                        System.err.println("Opção Inválida");
                        break;
                }
            }
        }

    }
