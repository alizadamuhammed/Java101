package main.java101.datatypes;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double price, taxPercent, priceOfTax, priceWithTax;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the thing: ");
        price = input.nextDouble();

        if (price > 1000) {
            taxPercent = 0.08;
        }
        else {
            taxPercent = 0.18;
        }

        priceOfTax = price * taxPercent;
        priceWithTax = price + priceOfTax;
        System.out.println("The price of thing without tax is: " + price);
        System.out.println("The percent of tax is: " + taxPercent*100);
        System.out.println("The price of tax is: " + priceOfTax);
        System.out.println("The price of thing with tax is: " + priceWithTax);


    }
}
