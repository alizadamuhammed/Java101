package main.java101.loops;

import java.util.Scanner;

public class TriangleMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line count: ");
        int n = sc.nextInt();
        int star = 1;

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star += 2;
        }

    }
}
