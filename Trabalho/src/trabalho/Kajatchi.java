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
public class Kajatchi extends Monstros{

    public Kajatchi(String nome, String tipo, int vida, int forca, int defesa, int velocidade) {
        super(nome, tipo, vida, forca, defesa, velocidade);
    }
    
    public void ataque1(){
        String nomeAtaque = "Rajada de agua";
        String tipoAtaque = "Agua";
        int poder = 35;
        System.out.println("Usou "+ nomeAtaque);
    } 
    public void ataque2(){
        String nomeAtaque = "Bolha";
        String tipoAtaque = "Agua";
        int poder = 20;
        System.out.println("Usou "+ nomeAtaque);
    }
}
