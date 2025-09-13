package main.java102.adventuregame.inventory;

import java.util.ArrayList;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private ArrayList<String> items;

    public  Inventory() {
        this.weapon = new Weapon("Punch",0,0,0);
        this.armor = new Armor("Naked", 0,0,0);
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        if(!items.contains(item)) {
            items.add(item);
            System.out.println(item + " has been added to the inventory");
        }
        else  {
            System.out.println(item + " has already been added to the inventory");
        }
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
