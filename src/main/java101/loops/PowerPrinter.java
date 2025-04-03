package main.java101.loops;

import java.util.Scanner;

public class PowerPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 1; i <= number; i *= 5) {
            System.out.print(i + ", ");
        }
    }
}
