package main.java101.loops;

import java.util.Scanner;

public class DivisibleByThreeAndFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        for(int i = 1; i < number; i++) {
            if(i % 3 == 0 && i % 4 == 0)
                System.out.println(i);
        }

    }
}
