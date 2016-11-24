/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanangers;

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
    private int[][] mapOfWorld;
    
    /**
    *Vectores que se utilizaran para almacenar los heroes y enemigos que entraran a una batalla
    * y poder ubicarlos en la grilla. No entran como elementos al mapa solo a los combates
    */
            
    private Character[] Heroes;
    private Character[] Enemys;       

    public Map(Character Hades, Character Cerberus, Character Baphomet, Character Ra, Character Anubis, Character Jesus, Character Vishnu, Character Arcangel, Character Vassago, Character Lilith, Character Ucrunius, Character Ganesha, Character Beleth, Character Bifrons, Character Emmao, Character Marduk, Character Set, Character hunterRobot, Character wizardRobot, Character warriorRobot, int[][] mapOfWorld) {
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
        
    }
    
    public void changeHeroesName(String hunterRobotName, String wizardRobotName, String warriorRobotName) {
        hunterRobot.setName(hunterRobotName);
        wizardRobot.setName(wizardRobotName);
        warriorRobot.setName(warriorRobotName);
    }
    
    public void move(Character[] Heroes) {

    }

    public void generateTreasures() {

    }

    public void findTreasure() {

    }

    public void renameCharacter(Character heroes[]) {

    }

    public void generateEnemys() {
    }

    public void save() {
    }

    public void load() {
    }
}
