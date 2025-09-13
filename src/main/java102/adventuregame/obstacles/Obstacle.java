package main.java102.adventuregame.obstacles;

public class Obstacle {
    private String name;
    private int id;
    private int damage;
    private int health;
    private int moneyAward;
    private int originalHealth;


    public Obstacle(String name, int id, int damage, int health, int moneyAward) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.moneyAward = moneyAward;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyAward() {
        return moneyAward;
    }

    public void setMoneyAward(int moneyAward) {
        this.moneyAward = moneyAward;
    }
}
