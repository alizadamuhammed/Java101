package main.java101.loops;

import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = sc.nextInt();

        // first number will always be smaller than second number
        if (firstNum > secondNum) {
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        int GCD = 0;

        for (int i = 1; i <= firstNum; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                GCD = i;
            }
        }

        // LCM = (a*b)/GCD(a,b)
        int LCM = (firstNum * secondNum)/GCD;

        System.out.println("The GCD of " + firstNum + " and " + secondNum + " is " + GCD);
        System.out.println("The LCM of " + firstNum + " and " + secondNum + " is " + LCM);


    }
}
