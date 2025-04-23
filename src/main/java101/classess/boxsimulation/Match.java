package main.java101.classess.boxsimulation;

import java.util.*;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match() {
    }

    ;

    public Match(int minWeight, int maxWeight, Fighter f1, Fighter f2) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.f1 = f1;
        this.f2 = f2;
    }

    void run() {
        if (isCheck()) {
            if (whoWillStart() == 0) {
                System.out.println(this.f1.name + " starts the game");
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("===========NEW ROUND===========");
                    this.f2.health = this.f1.hit(f2);
                    System.out.println("The health of " + this.f2.name + " is " + this.f2.health);
                    if (isWin()) {
                        System.out.println("======================");
                        System.out.println(this.f1.name + " won the match");
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    System.out.println("The health of " + this.f1.name + " is " + this.f1.health);
                    if (isWin()) {
                        System.out.println("======================");
                        System.out.println(this.f2.name + " won the match");
                        break;
                    }
                }
            } else {
                System.out.println(this.f2.name + " starts the game");

                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("===========NEW ROUND===========");
                    this.f1.health = this.f2.hit(f1);
                    System.out.println("The health of " + this.f1.name + " is " + this.f1.health);
                    if (isWin()) {
                        System.out.println("======================");
                        System.out.println(this.f2.name + " won the match");
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    System.out.println("The health of " + this.f2.name + " is " + this.f2.health);
                    if (isWin()) {
                        System.out.println("======================");
                        System.out.println(this.f1.name + " won the match");
                        break;
                    }
                }
            }
        } else {
            System.out.println("The weight of boxers is not suitable");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) &&
                (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    int whoWillStart() {
        return (int) (Math.random() * 2);
    }

    boolean isWin() {
        return this.f1.health == 0 || this.f2.health == 0;
    }
}
