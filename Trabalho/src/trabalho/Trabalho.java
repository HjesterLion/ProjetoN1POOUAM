/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author nakaz
 */
public class Trabalho {

    public static void main(String[] args) {
        Monstros rajang = new Monstros("Rajang", "Raio", 100, 50, 50, 75, "Cuspida de Raio", "Raio", 50, "Soco Furioso", "Normal", 30);
        Monstros ratian = new Monstros("Ratian", "Fogo", 100, 75, 30, 30, "Rajada de fogo", "Fogo", 75, "Brasa", "Fogo", 15);
        Monstros kajatchi = new Monstros("Kajatchi", "Agua", 150, 30, 80, 15, "Rajada de agua", "Agua", 35, "Bolha", "Agua", 20);

        boolean nocaute;

        Jogador jogador1 = new Jogador(rajang,ratian,kajatchi,rajang);
        Jogador jogador2 = new Jogador(ratian,rajang,kajatchi,ratian);
        nocaute = jogador1.monstroAtual.batalha(jogador1.monstroAtual, jogador2.monstroAtual,1);
        //jogador1.monstroAtual.batalha(jogador1.monstroAtual, jogador2.monstroAtual,2);
        jogador2.monstroAtual.print();
        jogador1.Troca(3);
        jogador1.monstroAtual.print();
        //jogador1.monstroAtual.batalha(jogador1.monstroAtual, jogador2.monstroAtual,1);
        jogador2.monstroAtual.print();
        
    }
    
}
