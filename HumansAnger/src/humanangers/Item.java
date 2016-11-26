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
public class Item {
    private int rate;
    private int type;
    private boolean equip;

    public Item(int rate, int type, boolean equip) {
        this.rate = rate;
        this.type = type;
        this.equip = equip;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isEquip() {
        return equip;
    }

    public void setEquip(boolean equip) {
        this.equip = equip;
    }

        
}
