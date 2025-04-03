package main.java101.loops;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        long num = sc.nextInt();
        long count = 0;
        long digit = 0;


        while (num >= 1) {
            digit += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits is: " + digit);

    }
}
