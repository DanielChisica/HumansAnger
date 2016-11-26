/**
 *
 */
package humanangers;

/**
 * @author Luis Carcamo
 * @ChangeLog : 14/11/16 No es necesario usar el stat Speed,x,y con los getter
 * and setter 14/11/16 Accuracy != Agility, es mas razonable una parte. 14/11/16
 * Varios stats o atributos fueron eliminados del constructor dado que son
 * generales. 14/11/16 Se corrigio la clase habilidad 14/11716 Se añadio la
 * habilidad "Bless"
 *
 *
 */
//
public class Character {

    private String name;
    private int hp = 1000;
    private int mp = 300;
    private int currentHp;
    private int atk = 1000;
    private int def =  atk*3/4;
    private int agility = 250;
    private int accuracy;
    private boolean usemagic, useskill;
    private double  dmgRate, dffRate, evaRate, manaRate, hpRate;

 
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public boolean isUsemagic() {
        return usemagic;
    }

    public void setUsemagic(boolean usemagic) {
        this.usemagic = usemagic;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

       public boolean isUseskill() {
        return useskill;
    }

    public void setUseskill(boolean useskill) {
        this.useskill = useskill;
    }

    public int getDmgRate() {
        return (int) dmgRate;
    }

    public void setDmgRate(int dmgRate) {
        this.dmgRate = dmgRate;
    }

    public int getDffRate() {
        return (int) dffRate;
    }

    public void setDffRate(int dffRate) {
        this.dffRate = dffRate;
    }

    public int getEvaRate() {
        return (int) evaRate;
    }

    public void setEvaRate(int evaRate) {
        this.evaRate = evaRate;
    }

    public int getManaRate() {
        return (int) manaRate;
    }

    public void setManaRate(int manaRate) {
        this.manaRate = manaRate;
    }

    public int getHpRate() {
        return (int) hpRate;
    }

    public void setHpRate(int hpRate) {
        this.hpRate = hpRate;
    }

    public Character(String name, boolean useskill, boolean usemagic, double dmgRate, double dffRate, double evaRate, double manaRate, double hpRate) {

        this.name = name;
        this.hp = (int) (hp * (1 + Math.random() * hpRate));
        this.currentHp = hp;
        this.atk = (int) (atk * (1 + Math.random() * (dmgRate)));
        this.def = (int) (def * (1 + Math.random() * (dffRate)));
        this.agility = (int) (agility * (1 + Math.random() * (evaRate)));
        this.accuracy = (int) (0.75 * agility); // Changelog. Linea 9
        this.useskill = useskill;
        this.usemagic = usemagic;
        this.mp = (int) (mp * 1 + Math.random() * (manaRate));
        

    }

}
