package main.java101.loops;

import java.util.Scanner;

public class MinimumMaximumNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1. number: ");
        int number = sc.nextInt();
        int min = number, max = number;
        for (int i = 1; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            number = sc.nextInt();
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}
