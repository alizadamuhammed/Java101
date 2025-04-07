package main.java101.methods;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;

        String menu = "1- Addition Operation\n"
                + "2- Subtraction Operation\n"
                + "3- Multiplication Operation\n"
                + "4- Division Operation\n"
                + "5- Exponential Number Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Modulus Operation\n"
                + "8- Rectangle Area and Perimeter Calculation\n"
                + "0- Exit";


        while (true) {
            System.out.println("====================");
            System.out.println("\n" + menu);
            System.out.print("Choose an option: ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    int[] addNums = getNumbers();
                    System.out.println(addition(addNums[0], addNums[1]));
                    break;
                case 2:
                    int[] subNums = getNumbers();
                    System.out.println(subtraction(subNums[0], subNums[1]));
                    break;
                case 3:
                    int[] mulNums = getNumbers();
                    System.out.println(multiplication(mulNums[0], mulNums[1]));
                    break;
                case 4:
                    int[] divNums = getNumbers();
                    if (divNums[1] == 0)
                        System.out.println("Division by zero is incorrect");
                    else
                        System.out.println(division(divNums[0], divNums[1]));
                    break;
                case 5:
                    int[] expNums = getNumbers();
                    System.out.println(exponential(expNums[0], expNums[1]));
                    break;
                case 6:
                    System.out.print("Enter an number: ");
                    int number = sc.nextInt();
                    System.out.println(factorial(number));
                    break;
                case 7:
                    System.out.print("Enter the first side of rectangle: ");
                    int firstSide = sc.nextInt();
                    System.out.print("Enter the second side of rectangle: ");
                    int secondSide = sc.nextInt();
                    System.out.println("Enter the third side of rectangle: ");
                    int thirdSide = sc.nextInt();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    System.exit(0);
            }
        }
    }


    static int[] getNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();

        return new int[]{firstNum, secondNum};
    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        if (b == 0)
            return 0;
        return a / b;
    }

    static int exponential(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static void rectangle(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println("Perimeter is: " + perimeter);
        int semiPerimeter = perimeter / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        System.out.println("Area is: " + area);
    }

}
