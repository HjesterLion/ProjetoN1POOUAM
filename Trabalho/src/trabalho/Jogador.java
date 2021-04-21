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
public class Jogador {
    public String nomeMonstro1;
    public String nomeMonstro2;
    public String nomeMonstro3;

    public Jogador(String nomeMonstro1, String nomeMonstro2, String nomeMonstro3) {
        this.nomeMonstro1 = nomeMonstro1;
        this.nomeMonstro2 = nomeMonstro2;
        this.nomeMonstro3 = nomeMonstro3;
    }
    public void MostrarMonstro(){
        if("Rajang".equals(nomeMonstro1)|| "Rajang".equals(nomeMonstro2)||"Rajang".equals(nomeMonstro3)){
            Rajang rajang = new Rajang("Rajang","Raio",100,50,50,75);
            
        }
        if("Ratian".equals(nomeMonstro1)|| "Ratian".equals(nomeMonstro2)||"Ratian".equals(nomeMonstro3)){
             Ratian ratian = new Ratian("Ratian", "Fogo",100,75,30,30);
             ratian.print();
        }
        if("Kajatchi".equals(nomeMonstro1)|| "Kajatchi".equals(nomeMonstro2)||"Kajatchi".equals(nomeMonstro3)){
             Kajatchi kajatchi = new Kajatchi("Kajatchi","Agua",150,30,80,15);
             kajatchi.print();
        }
    }
    public void batalha(){
        
    }
}
