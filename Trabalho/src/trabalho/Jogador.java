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

    public Jogador(Monstros Monstro1, Monstros Monstro2, Monstros Monstro3, Monstros monstroAtual) {
        this.Monstro1 = Monstro1;
        this.Monstro2 = Monstro2;
        this.Monstro3 = Monstro3;
        this.monstroAtual = monstroAtual;
    }

    public void MostrarMonstro() {
        if ("Rajang".equals(monstroAtual.nome)) {
            rajang.print();

        }
        if ("Ratian".equals(monstroAtual.nome)) {
            ratian.print();
        }
        if ("Kajatchi".equals(monstroAtual.nome)) {

            kajatchi.print();
        }
    }

    public Monstros Troca(int numero) {
        if (numero == 1) {
            this.monstroAtual = this.Monstro1;
        }
        if (numero == 2) {
            this.monstroAtual = this.Monstro2;
        }
        if (numero == 3) {
            this.monstroAtual = this.Monstro3;
        }
        return this.monstroAtual;
    }
}
