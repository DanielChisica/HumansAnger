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
        int rate = (int) (Math.random() * 1.5);
        for (int i = 0; i < enemigos.length; i++) {
            enemigos[i] = new Character("Enemy " + i + "", true, true, (int) (Math.random() * 1.2), (int) (Math.random() * 1.2), (int) (Math.random() * 2), rate, rate);
        }
        return enemigos;
    }
    
    public Character[] generarHeroes(int num) {
        //Genera Heroes con stat aleatorios.
        //Num = numero de Heroes
        Character[] Heroes = new Character[num];
        int rate = (int) (Math.random() * 1.5);
        for (int i = 0; i < Heroes.length; i++) {
            Heroes[i] = new Character("Heroe " + i + "", true, true, (int) (Math.random() * 1.2), (int) (Math.random() * 1.2), (int) (Math.random() * 2), rate, rate);
        }
        return Heroes;
        
    }
    
    public void autoKombat(Character[] heroes, Character[] enemigos) {
        int contador = 0;
        while (saludTotal(heroes) != 0 || saludTotal(enemigos) != 0) {
            
           
                System.out.println("Ha inciado el combate");
                if (agilidadGrupal(heroes) > agilidadGrupal(enemigos)) {
                    System.out.println("¡La batalla ha comenzado!" + "Los heroes tienen el turno");
                    
                    for (int i = 0; i < heroes.length; i++) {
                        for (int j = 0; j < enemigos.length; j++) {
                            int dmg = heroes[i].getAtk() - enemigos[j].getDef();
                            if (dmg < 0) {
                                int tmg = enemigos[j].getDef() - heroes[i].getAtk();
                                dmg = tmg - dmg;
                            }
//                    System.out.println("La defensa del enemigo " + j + " es " + enemigos[j].getDef());
//                    System.out.println("El daño del ataque fue " + dmg);
                            enemigos[i].setCurrentHp(enemigos[i].getHp() - dmg);
                            
                        }
                        if (enemigos[i].getCurrentHp() <= 0) {
                            enemigos[i].setAccuracy(0);
                            enemigos[i].setAgility(0);
                            enemigos[i].setAtk(0);
                            enemigos[i].setDef(0);
                            enemigos[i].setMp(0);
                            System.out.println("El personaje " + enemigos[i].getName() + " esta muerto");
                        } else {
                            System.out.println("La salud restante de " + enemigos[i].getName() + " fue de " + enemigos[i].getCurrentHp());
                        }
                    
//                   contador++; 
                }
            } else if (agilidadGrupal(enemigos)>agilidadGrupal(heroes)) {
                System.out.println("¡La batalla ha comenzado!" + "Los Enemigos tienen el turno");
                
                for (int i = 0; i < heroes.length; i++) {
                    for (int j = 0; j < enemigos.length; j++) {
                        int dmg = enemigos[i].getAtk() - heroes[j].getDef();
                        if (0 >= dmg) {
                            int tmg = enemigos[j].getDef() - heroes[i].getAtk();
                            dmg = tmg - dmg;
                        }
//                    System.out.println("La defensa del heroe " + j + " es " + heroes[j].getDef());
//                    System.out.println("El daño del ataque fue " + dmg);
                        heroes[i].setCurrentHp(heroes[i].getHp() - dmg);
                        
                    }
                    if (heroes[i].getHp() <= 0) {
                        heroes[i].setAccuracy(0);
                        heroes[i].setAgility(0);
                        heroes[i].setAtk(0);
                        heroes[i].setDef(0);
                        heroes[i].setMp(0);
                        System.out.println("El personaje " + heroes[i].getName() + " ha sido asesinado");
                    } else {
                        System.out.println("La salud restante del " + heroes[i].getName() + " fue de " + heroes[i].getCurrentHp());
                    }
                }
//              contador--;  
            }
            {
                
            }
            
        }
    }
    
    public int agilidadGrupal(Character[] x) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i].getAgility();
            
        }
        total-=1/4;
        
        return total;
    }
    
    public int saludTotal(Character[] personajes) {
        int total = 0;
        for (int i = 0; i < personajes.length; i++) {
            total += personajes[i].getCurrentHp();
        }
        return total;
    }
    
}
