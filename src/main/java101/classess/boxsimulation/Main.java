package main.java101.classess.boxsimulation;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 7, 100, 100, 50);
        Fighter f2 = new Fighter("Joe Frazier", 9, 100, 85, 40);

        Match match = new Match(80, 110, f1, f2);
        match.run();
    }
}
