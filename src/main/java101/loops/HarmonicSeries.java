package main.java101.loops;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        double result = 0;

        for (double i = 1; i < n; i++) {
            result += 1/i;
        }
        System.out.println(result);

    }
}
