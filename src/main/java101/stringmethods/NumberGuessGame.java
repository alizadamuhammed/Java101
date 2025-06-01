package main.java101.stringmethods;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10);

        Scanner sc = new Scanner(System.in);

        int wrongScore = 5;
        System.out.println("Please enter a number between 1 and 100");
        while (wrongScore > 0) {
            int guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations! You won!");
                break;
            } else if (guess > number) {
                System.out.println("Your number is too much!");
                wrongScore--;
                System.out.println("You have "+ wrongScore + " chance. Please try again");
            } else if (number > guess) {
                System.out.println("Your number is too low!");
                wrongScore--;
                System.out.println("You have "+ wrongScore + " chance. Please try again");
            } else {
                System.out.println("Please enter a number between 1 and 100");
                System.out.println("You have "+ wrongScore + " chance. Please try again");
                wrongScore--;
            }

            if (wrongScore == 0) {
                System.out.println("You didnt have a chance :( , try later");
            }
        }

    }
}
