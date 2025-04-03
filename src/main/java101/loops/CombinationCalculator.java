package main.java101.loops;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        System.out.print("enter r: ");
        int r = sc.nextInt();

        long nFact = 1;
        long rFact = 1;
        long nrFact = 1;

        for (int i = 1; i <= n; i++) {
            nFact = i * nFact;
        }
        for (int i = 1; i <= r; i++) {
            rFact = i * rFact;
        }
        for (int i = 1; i <= n - r; i++) {
            nrFact = nrFact * i;
        }

        long combination = nFact / (rFact * nrFact);
        System.out.println("Combination : " + combination);

    }
}
