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


        Jogador jogador1 = new Jogador(rajang,ratian,kajatchi,rajang);
        Jogador jogador2 = new Jogador(ratian,rajang,kajatchi,ratian);
        jogador1.MostrarMonstro();
        jogador1.monstroAtual.batalha(jogador1.monstroAtual, jogador2.monstroAtual);
        
    }
    
}
