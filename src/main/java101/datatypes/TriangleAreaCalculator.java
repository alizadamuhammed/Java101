package main.java101.datatypes;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a side of the triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter the b side of the triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter the c side of the triangle: ");
        double c = sc.nextDouble();

        double u = (a + b + c) / 2;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("The area of the triangle is " + area);

    }
}
