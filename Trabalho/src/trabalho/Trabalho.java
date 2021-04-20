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
        Rajang rajang = new Rajang("Rajang","Raio",100,50,50,75);
        Ratian ratian = new Ratian("Ratian", "Fogo",100,75,30,30);
        Kajatchi kajatchi = new Kajatchi("Kajatchi","Agua",150,30,80,15);
        rajang.print();
        kajatchi.ataque1();
        
    }
    
}
