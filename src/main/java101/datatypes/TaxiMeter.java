package main.java101.datatypes;

import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        double totalPrice;
        double startPrice = 10;
        double minimumPrice = 20;
        double pricePerKm = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("How many kilometers will you go? : ");
        double km = input.nextInt();
        totalPrice = startPrice + km * pricePerKm;

        if (totalPrice < minimumPrice) {
            System.out.println("You will pay: $" + minimumPrice);
        }
        else {
            System.out.println("You will pay: $" + totalPrice);
        }
    }
}
