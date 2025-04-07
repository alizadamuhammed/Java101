package main.java101.methods;

import java.util.Scanner;

public class PatternWithRecursiveMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        printPattern(n,n,false);

    }

    static void printPattern(int original, int current, boolean increasing) {
        System.out.println(current + " ");
        if (current <= 0) {
            increasing = true;
        }

        if (current == original && increasing) {
            return;
        }

        if (increasing) {
            printPattern(original, current + 5, true);
        } else {
            printPattern(original, current - 5, false);
        }
    }
}
