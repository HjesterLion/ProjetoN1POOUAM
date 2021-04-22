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

        String monstroatual1;
        String monstroatual2;
        Jogador jogador1 = new Jogador("Rajang", "Ratian","Kajatchi",monstroatual1 ="Rajang");
        Jogador jogador2 = new Jogador("Ratian", "Rajang","Kajatchi",monstroatual2 ="Ratian");
        jogador1.MostrarMonstro();
        jogador2.MostrarMonstro();
        jogador1.Batalha("Rajang");
        jogador1.MostrarMonstro();
        monstroatual1 = jogador1.Troca(3);
        jogador1.MostrarMonstro();
        jogador1.Troca(1);
        jogador1.MostrarMonstro();
        
        
    }
    
}
