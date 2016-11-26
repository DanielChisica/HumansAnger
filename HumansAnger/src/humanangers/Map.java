/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanangers;

import java.awt.event.KeyEvent;

/**
 *
 * @author EAN
 */
//En este metodo podria ingresar un heroe como tal ya que no es necesario que el vector 
//completo se mueva, e igualmente en la batalla ya no moveremos los characters
public class Map {

    private Character Hades;
    private Character Cerberus;
    private Character Baphomet;
    private Character Ra;
    private Character Anubis;
    private Character Jesus;
    private Character Vishnu;
    private Character Arcangel;
    private Character Vassago;
    private Character Lilith;
    private Character Ucrunius;
    private Character Ganesha;
    private Character Beleth;
    private Character Bifrons;
    private Character Emmao;
    private Character Marduk;
    private Character Set;
    private Character hunterRobot;
    private Character wizardRobot;
    private Character warriorRobot;
    private int[][] mapOfWorld = new int[15][15];
    public final int empty = 0;
    public final int robot = 1;
    public final int boss = 2;
    public final int treasure = 3;
    public final int obstacle = 4;

    /**
     * Vectores que se utilizaran para almacenar los heroes y enemigos que
     * entraran a una batalla y poder ubicarlos en la grilla. No entran como
     * elementos al mapa solo a los combates
     */
    private Character[] Heroes;
    private Character[] Enemys;

    public Map() {
        this.Hades = Hades;
        this.Cerberus = Cerberus;
        this.Baphomet = Baphomet;
        this.Ra = Ra;
        this.Anubis = Anubis;
        this.Jesus = Jesus;
        this.Vishnu = Vishnu;
        this.Arcangel = Arcangel;
        this.Vassago = Vassago;
        this.Lilith = Lilith;
        this.Ucrunius = Ucrunius;
        this.Ganesha = Ganesha;
        this.Beleth = Beleth;
        this.Bifrons = Bifrons;
        this.Emmao = Emmao;
        this.Marduk = Marduk;
        this.Set = Set;
        this.hunterRobot = hunterRobot;
        this.wizardRobot = wizardRobot;
        this.warriorRobot = warriorRobot;
        this.mapOfWorld = mapOfWorld;

        for (int[] map : mapOfWorld) {
            for (int j = 0; j < map.length; j++) {
                map[j] = empty;
            }
        }

        mapOfWorld[0][6] = robot;
        mapOfWorld[0][4] = treasure;
        mapOfWorld[10][15] = treasure;
        mapOfWorld[4][4] = boss;
        mapOfWorld[0][15] = treasure;
        mapOfWorld[5][2] = treasure;
        mapOfWorld[10][2] = treasure;
        mapOfWorld[12][11] = treasure;
        mapOfWorld[8][4] = treasure;

        for (int i = 0; i < mapOfWorld.length - 1; i++) {
            mapOfWorld[1][i] = obstacle;
        }

        for (int i = 1; i < mapOfWorld[3].length; i++) {
            mapOfWorld[3][i] = obstacle;
        }

    }

    public void changeHeroesName(String hunterRobotName, String wizardRobotName, String warriorRobotName) {
        hunterRobot.setName(hunterRobotName);
        wizardRobot.setName(wizardRobotName);
        warriorRobot.setName(warriorRobotName);
    }

    public void move(Character[] Heroes) {

    }

    public void generateEnemys() {
    }

    public void save() {
    }

    public int[][] getMap() {
        return mapOfWorld;
    }

    public void load() {
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_LEFT:
                break;
            case KeyEvent.VK_DOWN:
                break;
            case KeyEvent.VK_UP:
                break;
            default:
                break;
        }
    }
    public int[] findRobot(){
        int[] retorno = new int[2];
        for (int i = 0; i < getMap().length; i++) {
            for (int j = 0; j < getMap()[i].length; j++) {
                if(getMap()[i][j]== robot){
                    retorno[0]=i;
                    retorno[1]=j;
                }
            }
        }
        return retorno;
    }
    
    public boolean moveRight(){
        int [] posHeroe = findRobot();
        try {
            switch (getMap()[posHeroe[0]][posHeroe[1]+1]) {
                case empty:
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =empty;
                    mapOfWorld[posHeroe[0]][posHeroe[1]+1] = robot;
                    return true;
                case boss:
                    break;
                case treasure:
                    grabTreasure();
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =empty;
                    mapOfWorld[posHeroe[0]][posHeroe[1]+1] = robot;
                    return true;
                case obstacle:
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("You've reached the end");
            return false;
        }
        return false;
    }
    
    public boolean moveLeft(){
        int [] posHeroe = findRobot();
        try {
            switch (getMap()[posHeroe[0]][posHeroe[1]-1]) {
                case empty:
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =empty;
                    mapOfWorld[posHeroe[0]][posHeroe[1]-1] = robot;
                    return true;
                case boss:
                    break;
                case treasure:
                    grabTreasure();
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =empty;
                    mapOfWorld[posHeroe[0]][posHeroe[1]-1] = robot;
                    return true;
                case obstacle:
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("You've reached the end");
            return false;
        }
        return false;
    }

    private void grabTreasure() {
         this.hunterRobot.setCurrentHp((int) (this.hunterRobot.getCurrentHp() + Math.random() * 5));
         
    }
}
