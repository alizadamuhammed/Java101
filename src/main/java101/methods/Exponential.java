package main.java101.methods;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(power(num1, num2));
    }

    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else {
            return base * power(base, exponent -1);
        }
    }
}
