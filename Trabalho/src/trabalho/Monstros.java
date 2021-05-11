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
public class Monstros {

    public String nome;
    public String tipo;
    public int vida;
    public int forca;
    public int defesa;
    public int velocidade;
    String nomeAtaque1;
    String tipoAtaque1;
    int poder1;
    String nomeAtaque2;
    String tipoAtaque2;
    int poder2;

    public Monstros(String nome, String tipo, int vida, int forca, int defesa, int velocidade, String nomeAtaque1, String tipoAtaque1, int poder1, String nomeAtaque2, String tipoAtaque2, int poder2) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.nomeAtaque1 = nomeAtaque1;
        this.tipoAtaque1 = tipoAtaque1;
        this.poder1 = poder1;
        this.nomeAtaque2 = nomeAtaque2;
        this.tipoAtaque2 = tipoAtaque2;
        this.poder2 = poder2;
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Vida: " + vida);
        System.out.println("Forca: " + forca);
        System.out.println("Defesa: " + defesa);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("-------------------");

    }
    public void mostrarAtaques(){
        System.out.println("----------------------------------");
        System.out.println("Ataque 1");
        System.out.println("Nome do ataque 1: "+ nomeAtaque1);
        System.out.println("Tipo do ataque 1: "+ tipoAtaque1);
        System.out.println("Poder do ataque 1: "+ poder1);
        System.out.println("----------------------------------");
        System.out.println("Ataque 2");
        System.out.println("Nome do ataque 2: "+ nomeAtaque2);
        System.out.println("Tipo do ataque 2: "+ tipoAtaque2);
        System.out.println("Poder do ataque 2: "+ poder2);
        System.out.println("-------------------------------");
    }

    public int ataque1(Monstros monstro1, Monstros monstro2) {

        int dano;
        String tipoAtaque = monstro1.tipoAtaque1;
        dano = (monstro1.poder1 + monstro1.forca) - monstro2.defesa;
        dano = verificaElemento(monstro1, monstro2, dano, tipoAtaque);
        return dano;
    }

    public int ataque2(Monstros monstro1, Monstros monstro2) {
        String tipoAtaque = monstro1.tipoAtaque2;
        int dano;
        dano = (monstro1.poder2 + monstro1.forca) - monstro2.defesa;
        dano = verificaElemento(monstro1, monstro2, dano, tipoAtaque);
        return dano;
    }

    public boolean batalha(Monstros monstro1, Monstros monstro2,int escolhaAtaque) {
        if (escolhaAtaque == 1) {
            monstro2.vida -= monstro1.ataque1(monstro1, monstro2);
            return verificaNocaute(monstro2);
       }
        else {
            monstro2.vida -= monstro1.ataque2(monstro1, monstro2);
            return verificaNocaute(monstro2);
       }
    }

    public int verificaElemento(Monstros monstro1, Monstros monstro2, int dano, String tipoAtaque) {
        int danoElemento;
        if (tipoAtaque.equals("Agua")) {
            if ("Ar".equals(monstro2.tipo)) {
                danoElemento = dano / 2;
                return danoElemento;
            }
            if (monstro2.tipo.equals("Fogo")) {
                danoElemento = dano * 2;
                return danoElemento;
            } else {
                return danoElemento = dano * 1;
            }
        }
        if (tipoAtaque.equals("Fogo")) {
            if ("Agua".equals(monstro2.tipo)) {
                danoElemento = dano / 2;
                return danoElemento;
            }
            if (monstro2.tipo.equals("Planta")) {
                danoElemento = dano * 2;
                return danoElemento;
            } else {
                return danoElemento = dano * 1;

            }
        }
        if (tipoAtaque.equals("Planta")) {
            if ("Fogo".equals(monstro2.tipo)) {
                danoElemento = dano / 2;
                return danoElemento;
            }
            if (monstro2.tipo.equals("Raio")) {
                danoElemento = dano * 2;
                return danoElemento;
            } else {
                return danoElemento = dano * 1;
            }

        }
        if (tipoAtaque.equals("Raio")) {
            if ("Planta".equals(monstro2.tipo)) {
                danoElemento = dano / 2;
                return danoElemento;
            }
            if (monstro2.tipo.equals("Ar")) {
                danoElemento = dano * 2;
                return danoElemento;
            } else {
                return danoElemento = dano * 1;
            }

        }
        if (tipoAtaque.equals("Ar")) {
            if ("Raio".equals(monstro2.tipo)) {
                danoElemento = dano / 2;
                return danoElemento;
            }
            if (monstro2.tipo.equals("Agua")) {
                danoElemento = dano * 2;
                return danoElemento;
            } else {
                return danoElemento = dano * 1;
            }

        } 
        else {
            return danoElemento = dano * 1;
        }

    }

    public boolean verificaNocaute(Monstros monstro) {
        if (monstro.vida > 0) {
            System.out.println("vida do Monstro eh " + monstro.vida);
            return false;
        } else {
            System.out.println("Monstro derrotado");
            return true;
        }
    }
}
