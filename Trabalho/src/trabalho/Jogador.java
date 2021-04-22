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
    public String monstroAtual;
    Rajang rajang = new Rajang("Rajang","Raio",100,50,50,75);
    Ratian ratian = new Ratian("Ratian", "Fogo",100,75,30,30);
    Kajatchi kajatchi = new Kajatchi("Kajatchi","Agua",150,30,80,15);

    public Jogador(String nomeMonstro1, String nomeMonstro2, String nomeMonstro3,String monstroAtual) {
        this.nomeMonstro1 = nomeMonstro1;
        this.nomeMonstro2 = nomeMonstro2;
        this.nomeMonstro3 = nomeMonstro3;
        this.monstroAtual = monstroAtual;
    }
    public void MostrarMonstro(){
        if("Rajang".equals(monstroAtual)){
            rajang.print();
            
        }
        if("Ratian".equals(monstroAtual)){
             ratian.print();
        }
        if("Kajatchi".equals(monstroAtual)){
           
             kajatchi.print();
        }
    }
    public void Batalha(String monstroAtacado){
        int ataque;
        if(monstroAtacado == "Rajang" && monstroAtual == monstroAtacado){
            rajang.vida -= rajang.defesa;
            System.out.println("atacou com sucesso");
        }
        
    }
    public String Troca(int numero){
        if(numero == 1){
           this.monstroAtual = nomeMonstro1;
        }
        if(numero == 2){
           this.monstroAtual = nomeMonstro2;
        }
        if(numero == 3){
           this.monstroAtual = nomeMonstro3;
        }
        return this.monstroAtual;
    }
}
