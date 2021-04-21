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
public class Monstros{
    public String nome;
    public String tipo;
    public int vida;
    public int forca;
    public int defesa;
    public int velocidade;

    public Monstros(String nome, String tipo, int vida, int forca, int defesa, int velocidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }
    
    public void print(){
        System.out.println("Nome: "+ nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("Vida: "+vida);
        System.out.println("Forca: "+forca);
        System.out.println("Defesa: "+ defesa);
        System.out.println("Velocidade: "+velocidade);
        System.out.println("-------------------");
        
    }
    public void batalha(){
        
    }
    
    
}
