/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;

/**
 *
 * @author nakaz
 */
public class Trabalho {

    public static void main(String[] args) {
        Monstros rajang = new Monstros("Rajang", "Raio", 100, 50, 50, 75, "Cuspida de Raio", "Raio", 50, "Soco Furioso", "Normal", 30);
        Monstros ratian = new Monstros("Ratian", "Fogo", 100, 75, 30, 30, "Rajada de fogo", "Fogo", 75, "Brasa", "Fogo", 15);
        Monstros kajatchi = new Monstros("Kajatchi", "Agua", 150, 30, 80, 15, "Rajada de agua", "Agua", 35, "Bolha", "Agua", 20);
        Monstros phaedra = new Monstros("Phaedra", "Planta", 100, 30, 70, 10, "Clorofila", "Planta", 50, "Rajada de Folhas", "Planta", 30);
        Monstros avion = new Monstros("Avion", "Ar", 130, 25, 90, 70, "Investida", "Ar", 50, "Tornado", "Ar", 30);
        Monstros argus = new Monstros("Argus", "Normal", 100, 80, 80, 10, "Soco Mortal", "Normal", 50, "Espada Lacerante", "Normal", 30);
        boolean nocaute;

        int escolhaJogador1;
        int escolhaJogador2;
        int turnoJogador1 = 0;
        int turnoJogador2 = 0;
        Scanner entrada = new Scanner(System.in);
        Jogador jogador1 = new Jogador(rajang, ratian, kajatchi, rajang);
        Jogador jogador2 = new Jogador(phaedra, avion, argus, phaedra);

        do {
            System.out.println("Jogador 1");
            System.out.println("Escolha sua acao");
            System.out.println("1 - Para atacar");
            System.out.println("2 - Para trocar de monstro");
            escolhaJogador1 = entrada.nextInt();
            System.out.println("Jogador 2");
            System.out.println("Escolha sua acao");
            System.out.println("1 - Para atacar");
            System.out.println("2 - Para trocar de monstro");
            escolhaJogador2 = entrada.nextInt();
            if (escolhaJogador1 == 2) {
                System.out.println("Escolha monstro voce Deseja trocar");
                if (jogador1.Monstro1.vida > 0) {
                    System.out.println("1 - " + jogador1.Monstro1.nome);
                }
                if (jogador1.Monstro2.vida > 0) {
                    System.out.println("2 - " + jogador1.Monstro2.nome);
                }
                if (jogador1.Monstro3.vida > 0) {
                    System.out.println("3 - " + jogador1.Monstro3.nome);
                }
                jogador1.Troca(entrada.nextInt());
                turnoJogador1++;
            }
            if (escolhaJogador2 == 2) {
                System.out.println("Escolha monstro voce Deseja trocar");
                if (jogador1.Monstro1.vida > 0) {
                    System.out.println("1 - " + jogador2.Monstro1.nome);
                }
                if (jogador1.Monstro2.vida > 0) {
                    System.out.println("2 - " + jogador2.Monstro2.nome);
                }
                if (jogador1.Monstro3.vida > 0) {
                    System.out.println("3 - " + jogador2.Monstro3.nome);
                }
                jogador2.Troca(entrada.nextInt());
                turnoJogador2++;
            }
            if (escolhaJogador1 == 1 && escolhaJogador2 == 1) {
                if (jogador1.monstroAtual.velocidade > jogador2.monstroAtual.velocidade) {
                    jogador1.monstroAtual.mostrarAtaques();
                    System.out.println("Jogador 1 ");
                    System.out.println("Escolhar seu ataque: ");
                    do {

                        System.out.println("repetiu");
                        escolhaJogador1 = entrada.nextInt();
                    } while (escolhaJogador1 < 1 || escolhaJogador1 > 2);
                    nocaute = jogador1.monstroAtual.batalha(jogador1.monstroAtual, jogador2.monstroAtual, escolhaJogador1);
                    turnoJogador1++;
                    System.out.println("-----------------------------------------");
                    if (nocaute == false) {
                        jogador2.monstroAtual.mostrarAtaques();
                        System.out.println("Jogador 2 ");
                        System.out.println("Escolhar seu ataque: ");
                        do {
                            escolhaJogador2 = entrada.nextInt();
                        } while (escolhaJogador2 < 1 || escolhaJogador2 > 2);
                        nocaute = jogador2.monstroAtual.batalha(jogador2.monstroAtual, jogador1.monstroAtual, escolhaJogador2);
                        turnoJogador2++;
                        if (nocaute == true) {
                            System.out.println("Escolha monstro voce Deseja trocar");
                            if (jogador1.Monstro1.vida > 0) {
                                System.out.println("1 - " + jogador1.Monstro1.nome);
                            }
                            if (jogador1.Monstro2.vida > 0) {
                                System.out.println("2 - " + jogador1.Monstro2.nome);
                            }
                            if (jogador1.Monstro3.vida > 0) {
                                System.out.println("3 - " + jogador1.Monstro3.nome);
                            }
                            jogador1.Troca(entrada.nextInt());
                            turnoJogador1++;
                        }
                    } else {
                        System.out.println("Escolha monstro voce Deseja trocar");
                        if (jogador2.Monstro1.vida > 0) {
                            System.out.println("1 - " + jogador2.Monstro1.nome);
                        }
                        if (jogador2.Monstro2.vida > 0) {
                            System.out.println("2 - " + jogador2.Monstro2.nome);
                        }
                        if (jogador2.Monstro3.vida > 0) {
                            System.out.println("3 - " + jogador2.Monstro3.nome);
                        }
                        jogador2.Troca(entrada.nextInt());
                        turnoJogador2++;
                    }
                } else {
                    jogador2.monstroAtual.mostrarAtaques();
                    System.out.println("Jogador 2 ");
                    System.out.println("Escolhar seu ataque: ");
                    do {
                        escolhaJogador2 = entrada.nextInt();
                    } while (escolhaJogador2 < 1 || escolhaJogador2 > 2);
                    nocaute = jogador2.monstroAtual.batalha(jogador2.monstroAtual, jogador1.monstroAtual, escolhaJogador1);
                    turnoJogador2++;
                    System.out.println("-----------------------------------------");
                    if (nocaute == false) {
                        jogador1.monstroAtual.mostrarAtaques();
                        System.out.println("Jogador 1 ");
                        System.out.println("Escolhar seu ataque: ");
                        do {
                            escolhaJogador1 = entrada.nextInt();
                        } while (escolhaJogador1 > 1 || escolhaJogador1 < 2);
                        nocaute = jogador1.monstroAtual.batalha(jogador1.monstroAtual, jogador2.monstroAtual, escolhaJogador2);

                        turnoJogador1++;

                        if (nocaute == true) {
                            System.out.println("Escolha monstro voce Deseja trocar");
                            if (jogador2.Monstro1.vida > 0) {
                                System.out.println("1 - " + jogador2.Monstro1.nome);
                            }
                            if (jogador2.Monstro2.vida > 0) {
                                System.out.println("2 - " + jogador2.Monstro2.nome);
                            }
                            if (jogador2.Monstro3.vida > 0) {
                                System.out.println("3 - " + jogador2.Monstro3.nome);
                            }
                            jogador2.Troca(entrada.nextInt());
                            turnoJogador2++;
                        }
                    } else {
                        System.out.println("Escolha monstro voce Deseja trocar");
                        if (jogador1.Monstro1.vida > 0) {
                            System.out.println("1 - " + jogador1.Monstro1.nome);
                        }
                        if (jogador1.Monstro2.vida > 0) {
                            System.out.println("2 - " + jogador1.Monstro2.nome);
                        }
                        if (jogador1.Monstro3.vida > 0) {
                            System.out.println("3 - " + jogador1.Monstro3.nome);
                        }
                        jogador1.Troca(entrada.nextInt());
                        turnoJogador1++;
                    }

                }
            }
            if (escolhaJogador1 == 1 && turnoJogador1 == 0) {
                jogador1.monstroAtual.mostrarAtaques();
                System.out.println("Jogador 1 ");
                System.out.println("Escolhar seu ataque: ");
                do {
                    escolhaJogador1 = entrada.nextInt();
                } while (escolhaJogador1 < 1 || escolhaJogador1 > 2);
                nocaute = jogador1.monstroAtual.batalha(jogador1.monstroAtual, jogador2.monstroAtual, escolhaJogador1);
                System.out.println("-----------------------------------------");

                if (nocaute == true) {
                    System.out.println("Escolha monstro voce Deseja trocar");
                    if (jogador2.Monstro1.vida > 0) {
                        System.out.println("1 - " + jogador2.Monstro1.nome);
                    }
                    if (jogador2.Monstro2.vida > 0) {
                        System.out.println("2 - " + jogador2.Monstro2.nome);
                    }
                    if (jogador2.Monstro3.vida > 0) {
                        System.out.println("3 - " + jogador2.Monstro3.nome);
                    }
                    jogador2.Troca(entrada.nextInt());
                    turnoJogador2++;
                }
            }
            if (escolhaJogador2 == 2 && turnoJogador2 == 0) {
                jogador2.monstroAtual.mostrarAtaques();
                System.out.println("Jogador 2 ");
                System.out.println("Escolhar seu ataque: ");
                do {
                    escolhaJogador2 = entrada.nextInt();
                } while (escolhaJogador2 > 1 || escolhaJogador2 < 2);
                nocaute = jogador1.monstroAtual.batalha(jogador2.monstroAtual, jogador1.monstroAtual, escolhaJogador2);
                if (nocaute == true) {
                    System.out.println("Escolha monstro voce Deseja trocar");
                    if (jogador1.Monstro1.vida > 0) {
                        System.out.println("1 - " + jogador1.Monstro1.nome);
                    }
                    if (jogador1.Monstro2.vida > 0) {
                        System.out.println("2 - " + jogador1.Monstro2.nome);
                    }
                    if (jogador1.Monstro3.vida > 0) {
                        System.out.println("3 - " + jogador1.Monstro3.nome);
                    }
                    jogador1.Troca(entrada.nextInt());
                    turnoJogador1++;
                }
            }
            turnoJogador1 = 0;
            turnoJogador2 = 0;
        } while (jogador1.todosMonstrosMorto() == false || jogador2.todosMonstrosMorto() == false);

        if (jogador1.todosMonstrosMorto() == true) {
            System.out.println("Vencedor é o Jogador 2");
        } else {
            System.out.println("Vencedor é o Jogador 1");
        }

    }

}
