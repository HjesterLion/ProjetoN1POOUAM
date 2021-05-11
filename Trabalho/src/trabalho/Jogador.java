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

    public Monstros Monstro1;
    public Monstros Monstro2;
    public Monstros Monstro3;
    public Monstros monstroAtual;
    Monstros rajang = new Monstros("Rajang", "Raio", 100, 50, 50, 75, "Cuspida de Raio", "Raio", 50, "Soco Furioso", "Normal", 30);
    Monstros ratian = new Monstros("Ratian", "Fogo", 100, 75, 30, 30, "Rajada de fogo", "Fogo", 75, "Brasa", "Fogo", 15);
    Monstros kajatchi = new Monstros("Kajatchi", "Agua", 150, 30, 80, 15, "Rajada de agua", "Agua", 35, "Bolha", "Agua", 20);
    Monstros phaedra = new Monstros("Phaedra", "Planta", 100, 30, 70, 10, "Clorofila", "Planta", 50, "Rajada de Folhas", "Planta", 30);
        Monstros avion = new Monstros("Avion", "Ar", 130, 25, 90, 70, "Investida", "Ar", 50, "Tornado", "Ar", 30);
        Monstros argus = new Monstros("Argus", "Normal", 100, 80, 80, 10, "Soco Mortal", "Normal", 50, "Espada Lacerante", "Normal", 30);
    public Jogador(Monstros Monstro1, Monstros Monstro2, Monstros Monstro3, Monstros monstroAtual) {
        this.Monstro1 = Monstro1;
        this.Monstro2 = Monstro2;
        this.Monstro3 = Monstro3;
        this.monstroAtual = monstroAtual;
    }
    public Monstros Troca(int numero) {
        if (numero == 1 && Monstro1.vida > 0) {
            this.monstroAtual = this.Monstro1;
        }
        if (numero == 2 && Monstro2.vida > 0) {
            this.monstroAtual = this.Monstro2;
        }
        if (numero == 3 && Monstro3.vida > 0) {
            this.monstroAtual = this.Monstro3;
        }
        else{
            System.out.println("Não tem como trocar");
            return this.monstroAtual;
        }
        return this.monstroAtual;
    }
    public boolean todosMonstrosMorto(){
        if(this.Monstro1.vida <= 0 &&this.Monstro2.vida <= 0&& this.Monstro3.vida <= 0){
            System.out.println("Todos os Monstros foram Derrotados");
            return true;
        }
        else{
            return false;
        }
    }
}
