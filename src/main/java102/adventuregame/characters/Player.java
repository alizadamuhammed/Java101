package main.java102.adventuregame.characters;

import main.java102.adventuregame.inventory.Inventory;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String name;
    private String charName;
    Scanner scan = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void initPlayer(Characters character) {
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setOriginalHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setCharName(character.getName());
    }

    public void printPlayerInfo() {
        System.out.println("Weapon: " + this.getInventory().getWeapon().getName() +
                "\nArmor: " + this.getInventory().getArmor().getName() +
                "\nBlock: " + this.getInventory().getArmor().getBlock() +
                "\nDamage: " + this.getTotalDamage() +
                "\nHealth: " + this.getHealth() +
                "\nMoney: " + this.getMoney());
    }

    public int getDamage() {
        return damage;
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
