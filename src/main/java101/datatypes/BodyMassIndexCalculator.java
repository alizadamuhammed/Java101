package main.java101.datatypes;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mass of a body: ");
        double mass = sc.nextDouble();
        System.out.print("Enter the height of a body (for example: 1.82): ");
        double height = sc.nextDouble();

        double bodyMassIndex = mass/Math.pow(height, 2);
        System.out.println("Body mass index: " + bodyMassIndex);

    }
}
