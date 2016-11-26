/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanangers;

/**
 *
 * @author tania
 */
public class Battlefield {

    //Falta implementar un for conn un Math random por el numero de enemigos a enfrentar.
    private Character[] heroes;
    private Character[] foes;

    public Character[] getHeroes() {
        return heroes;
    }

    public Character[] getFoes() {
        return foes;
    }

    public void setUsr(Character[] heroes) {
        this.heroes = heroes;
    }

    public void setFoes(Character[] foes) {
        this.foes = foes;
    }

    public void battle(Character[] heroes, Character[] foes) {
        this.foes = foes;
        this.heroes = heroes;

    }

    //Este codiggo se puede omitir ya que se puede reemplazar por un boton en el GUI
    //e imprimir un mensaje cuando se retiren del juego como viles ratas
    public void run() {

    }

    public void defend() {
    }

    public void useSkill() {
    }

    public Character[] generarEnemigos(int num) {
        //Genera enemigos con stat aleatorios.
        //Num = numero de enemigos
        Character[] enemigos = new Character[num];
        int rate = (int) (Math.random() * 2);
        for (int i = 0; i < enemigos.length; i++) {
            enemigos[i] = new Character("Enemy " + i, true, true, rate, rate, rate, rate, rate);
        }
        return enemigos;
    }

    public Character[] generarHeroes(int num) {
        //Genera Heroes con stat aleatorios.
        //Num = numero de Heroes
        Character[] Heroes = new Character[num];
        int rate = (int) (Math.random() * 2);
        for (int i = 0; i < Heroes.length; i++) {
            Heroes[i] = new Character("Heroe " + i, true, true, rate, rate, rate, rate, rate);
        }
        return Heroes;

    }

    public void autoKombat(Character[] heroes, Character[] enemigos) {
        int contador = 0;
        System.out.println("Ha inciado el combate");
        if (agilidadGrupal(heroes) > agilidadGrupal(enemigos)) {
            System.out.println("¡La batalla ha comenzado!" + "Los heroes tienen el turno");
            contador++;

        } else {
            System.out.println("¡La batalla ha comenzado!" + "Los Enemigos tienen el turno");

        }

    }

    public int agilidadGrupal(Character[] x) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i].getAgility();

        }

        return total;
    }
}
