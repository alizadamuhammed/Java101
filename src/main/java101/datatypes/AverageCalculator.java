package main.java101.datatypes;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to program");

        System.out.print("Please enter your Math note: ");
        double mathNote = sc.nextDouble();
        System.out.print("Please enter your Physics note: ");
        double physicsNote = sc.nextDouble();
        System.out.print("Please enter your Chemistry note: ");
        double chemistryNote = sc.nextDouble();
        System.out.print("Please enter your Engineering note: ");
        double engineeringNote = sc.nextDouble();

        double averageNote = (mathNote + physicsNote + chemistryNote + engineeringNote) / 4;
        System.out.println("Your average note is: " + averageNote);

    }
}
