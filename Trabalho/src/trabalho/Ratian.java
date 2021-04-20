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
public class Ratian extends Monstros{

    public Ratian(String nome, String tipo, int vida, int forca, int defesa, int velocidade) {
        super(nome, tipo, vida, forca, defesa, velocidade);
    }
    
    public void ataque1(){
        String nomeAtaque = "Rajada de fogo";
        String tipoAtaque = "Fogo";
        int poder = 75;
        System.out.println("Usou "+ nomeAtaque);
    } 
    public void ataque2(){
        String nomeAtaque = "Brasa";
        String tipoAtaque = "Fogo";
        int poder = 15;
        System.out.println("Usou "+ nomeAtaque);
    }
}
