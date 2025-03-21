package main.java101.conditionals;

import java.util.Scanner;

public class AirplaneTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hello. Welcome to Muhammed Airlens. Where will you go?: ");
        String nameOfCity = sc.nextLine();

        System.out.print("How long is the distance with km?: ");
        double distance = sc.nextDouble();

        System.out.print("What is the type of your ticket? 1 - one way, 2 - two ways: ");
        int ticketType = sc.nextInt();

        System.out.print("How old are you: ");
        int age = sc.nextInt();

        double price = distance * ticketType * 0.1;

        if (age <= 12) {
            price = price * 0.5;
        }
        else if (age > 12 && age <= 24) {
            price = price * 0.9;
        }
        else if (age >= 65) {
            price = price * 0.7;
        }

        System.out.println("The total price for your trip is " + price + " dollars.");
    }
}
