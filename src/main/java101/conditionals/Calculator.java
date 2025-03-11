package main.java101.conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();

        System.out.println("which opration do you want to use?");
        System.out.println("1-add\n2-subtract\n3-multiply\n4-divide");
        System.out.print("enter operation: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("result: " + (a + b));
                break;
            case 2:
                System.out.println("result: " + (a - b));
                break;
            case 3:
                System.out.println("result: " + (a * b));
                break;
            case 4:
                System.out.println("result: " + (a / b));
                break;
        }
    }
}
