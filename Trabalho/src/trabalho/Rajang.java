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
public class Rajang extends Monstros{

    public Rajang(String nome, String tipo, int vida, int forca, int defesa, int velocidade) {
        super(nome, tipo, vida, forca, defesa, velocidade);
    }
    
    public void ataque1(){
        String nomeAtaque = "Cuspida de Raio";
        String tipoAtaque = "Raio";
        int poder = 50;
        System.out.println("Usou "+ nomeAtaque);
    } 
    public void ataque2(){
        String nomeAtaque = "Soco Furioso";
        String tipoAtaque = "Normal";
        int poder = 30;
        System.out.println("Usou "+ nomeAtaque);
    }
    
}
