/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanangers;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author EAN
 */
public class Bestiary {

    private final Character Hades;
    private final Character Cerberus;
    private final Character Baphomet;
    private final Character Ra;
    private final Character Anubis;
    private final Character Jesus;
    private final Character Vishnu;
    private final Character Arcangel;
    private final Character Vassago;
    private final Character Lilith;
    private final Character Ucrunius;
    private final Character Ganesha;
    private final Character Beleth;
    private final Character Bifrons;
    private final Character Emmao;
    private final Character Marduk;
    private final Character Set;
    private final Character hunterRobot;
    private final Character wizardRobot;
    private final Character warriorRobot;

    public Bestiary(Character Hades, Character Cerberus, Character Baphomet, Character Ra, Character Anubis, Character Jesus, Character Vishnu, Character Arcangel, Character Vassago, Character Lilith, Character Ucrunius, Character Ganesha, Character Beleth, Character Bifrons, Character Emmao, Character Marduk, Character Set, Character hunterRobot, Character wizardRobot, Character warriorRobot) {
        this.Hades = new Character("Hades", false, true, 2.5, 3, 0.8, 0.7, 0.8);
        this.Cerberus = new Character("Cerberus", false, true, 0.25, 1.35, 1, 1, 0.4);
        this.Baphomet = new Character("Baphomet", false, true, 0.65, 2, 1.2, 0.6, 0.65);
        this.Ra = new Character("ra", false, true, 3.5, 3.7, 1.6, 0.65, 0.93);
        this.Anubis = new Character("Anubis", true, true, 1.15, 1.2, 0.6, 0.60, 0.60);
        this.Jesus = new Character("Jesus", true, true, 4, 5, 1.8, 1.5, 0.83);
        this.Vishnu = new Character("Vishnu", true, true, 0, 3.2, 0, 0, 0);
        this.Arcangel = new Character("Arcangel", true, true, 0, 0, 0, 0, 0);
        this.Vassago = new Character("Vassago", true, true, 0, 0, 0, 0, 0);
        this.Lilith = new Character("Lilith", true, true, 0, 0, 0, 0, 0);
        this.Ucrunius = new Character("Ucrunius", true, true, 0, 0, 0, 0, 0);
        this.Ganesha = new Character("Ganesha", true, true, 0, 0, 0, 0, 0);
        this.Beleth = new Character("Beleth", true, true, 0, 0, 0, 0, 0);
        this.Bifrons = new Character("Bifrons", true, true, 0, 0, 0, 0, 0);
        this.Emmao = new Character("Emmao", true, true, 0, 0, 0, 0, 0);
        this.Marduk = new Character("Marduk", true, true, 0, 0, 0, 0, 0);

        //Daniel
        this.Set = Set;
        this.hunterRobot = hunterRobot;
        this.wizardRobot = wizardRobot;
        this.warriorRobot = warriorRobot;
    }

    /**
     * Cambia el nombre de los personajes, a los nombres dados por el Usuario
     *
     * @param Yourname
     */
    public void changeHeroesName(String hunterRobotName, String wizardRobotName, String warriorRobotName) {
        hunterRobot.setName(hunterRobotName);
        wizardRobot.setName(wizardRobotName);
        warriorRobot.setName(warriorRobotName);
    }

    public void bless(Character y, Character x) {

        if (y.getMp() > 600) {
            y.setMp(y.getMp() - 600);
            // Esta habilidad consume el 600 del mp que tenga disponible el personaje 
            if (0 >= x.getCurrentHp()) {
                x.setCurrentHp(x.getHp() * 3 / 4);
            } else if (x.getCurrentHp() > 0) {
                x.setCurrentHp(x.getHp() * 1 / 2);
            }
        }
    }

    public void IncreaseDefense(Character[] team) {

        for (int i = 0; i < team.length; i++) {
            while (TimeUnit.MINUTES.equals(1.5)) { //Mientras pasen 1.5 minutos (90 segundos), se va ir consumiendo el mp del equipo en 75 u
                for (int k = 0; k < team.length; k++) {
                    team[k].setMp(team[k].getMp() - 75);
                }
                for (int j = 0; j < team.length; j++) {
                    team[i].setDef((int) (team[i].getDef() * 1.5));
                }

            }
        }

    }

    public void IncreaseAtk(Character[] team) { //Mientras pasen 90 segundos el rate de daño sera 2 pero el mp se ira descontando 75
        while (TimeUnit.SECONDS.equals(90)) {
            for (int i = 0; i < team.length; i++) {
                team[i].setMp(team[i].getMp() - 75);
                for (int j = 0; j < team.length; j++) {
                    team[j].setDmgRate((int) (team[i].getDmgRate() * 2));
                }
            }

        }
    }

    public void Heal(Character[] team) { //Aumenta la vida del grupo, pero solo el personaje en la posicion 0 puede usarlo
        for (int i = 0; i < team.length; i++) {
            team[i].setHp((int) (team[i].getHp() + Math.random() * (350 - 600)));

        }
        team[0].setMp(team[0].getMp() - 250);

    }

}
