package humanangers;

import java.awt.event.KeyEvent;
import java.util.Arrays;

public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Map map1=new Map();
        map1.verMapa();
        map1.moveRight();
        map1.verMapa();
        map1.moveRight();
        map1.verMapa();
        map1.moveRight();
        map1.verMapa();
        map1.moveRight();
        map1.verMapa();
        map1.moveRight();
        map1.verMapa();
        map1.moveRight();
        map1.verMapa();
        map1.moveRight();
        map1.verMapa();
        map1.moveRight();
        map1.verMapa();
        map1.moveDown();
        map1.verMapa();
        /**
        Battlefield battlefield = new Battlefield(); 
        //Asigna enemigos aleatoriamente
        Character[] enemigos = battlefield.generarEnemigos((int) (Math.random() * 4));
        battlefield.setFoes(enemigos);
        //Asigna Heroes aleatoriamente
        Character[] heroes = battlefield.generarHeroes((int) (Math.random() * 4));
        battlefield.setUsr(heroes);
        //Inicia un autobatalla
        battlefield.autoKombat(battlefield.getHeroes(), battlefield.getFoes());
        */
    
        
    }
    
    
   

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
    private static int[][] mapOfWorld = new int[15][15];
    /**public static final int 0 = 0;
    public static final int 1 = 1;  Robot
    public static final int 2 = 2;  Boss
    public static final int 3 = 3;  Treasure
    public static final int 4 = 4;  Obstacle
    */
    
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
                map[j] = 0;
            }
        }

        mapOfWorld[0][6] = 1;
        mapOfWorld[0][4] = 3;
        mapOfWorld[10][14] = 3;
        mapOfWorld[4][4] = 2;
        mapOfWorld[0][14] = 3;
        mapOfWorld[5][2] = 3;
        mapOfWorld[10][2] = 3;
        mapOfWorld[12][11] = 3;
        mapOfWorld[8][4] = 3;

        for (int i = 0; i < mapOfWorld.length - 1; i++) {
            mapOfWorld[1][i] = 4;
        }

        for (int i = 1; i < mapOfWorld[3].length; i++) {
            mapOfWorld[3][i] = 4;
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
                if(getMap()[i][j]== 1){
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
                case 0:
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =0;
                    mapOfWorld[posHeroe[0]][posHeroe[1]+1] = 1;
                    return true;
                case 2:
                    break;
                case 3:
                    //grabTreasure();
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =0;
                    mapOfWorld[posHeroe[0]][posHeroe[1]+1] = 1;
                    return true;
                case 4:
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
                case 0:
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =0;
                    mapOfWorld[posHeroe[0]][posHeroe[1]-1] = 1;
                    return true;
                case 2:
                    break;
                case 3:
                    grabTreasure();
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =0;
                    mapOfWorld[posHeroe[0]][posHeroe[1]-1] = 1;
                    return true;
                case 4:
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
    
    public boolean moveDown(){
        int [] posHeroe = findRobot();
        try {
            switch (getMap()[posHeroe[0]+1][posHeroe[1]]) {
                case 0:
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =0;
                    mapOfWorld[posHeroe[0]+1][posHeroe[1]] = 1;
                    return true;
                case 2:
                    break;
                case 3:
                    //grabTreasure();
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =0;
                    mapOfWorld[posHeroe[0]+1][posHeroe[1]] = 1;
                    return true;
                case 4:
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

     public boolean moveUp(){
        int [] posHeroe = findRobot();
        try {
            switch (getMap()[posHeroe[0]-1][posHeroe[1]]) {
                case 0:
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =0;
                    mapOfWorld[posHeroe[0]-1][posHeroe[1]] = 1;
                    return true;
                case 2:
                    break;
                case 3:
                    //grabTreasure();
                    mapOfWorld[posHeroe[0]][posHeroe[1]] =0;
                    mapOfWorld[posHeroe[0]-1][posHeroe[1]] = 1;
                    return true;
                case 4:
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
    public void verMapa(){
        for (int i = 0; i < mapOfWorld.length; i++) {
            System.out.println(Arrays.toString(mapOfWorld[i]));
        }
        System.out.println();
        System.out.println();
    }
    
    
    
  
}
