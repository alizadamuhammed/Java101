package main.java101.loops;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (number == sum) {
            System.out.println(number + " is a perfect number");
        }
        else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
