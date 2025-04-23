package main.java101.classess.boxsimulation;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " hits to " + foe.name + " " + this.damage + " damage");
        if (foe.isDodge()) {
            System.out.println(foe.name + " dodged this damage");
            return foe.health;
        }
        if (foe.health - this.damage < 0)
            return 0;
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double rand = Math.random() * 100;
        return (int) rand <= this.dodge;
    }
}
