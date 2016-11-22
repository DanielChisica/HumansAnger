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
    //ahora pruebo mi usuario
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


    public void run() {

    }

    public void defend() {
//
    }

    public void useSkill() {
    }
    
    

}
