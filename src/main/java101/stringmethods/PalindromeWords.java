package main.java101.stringmethods;

import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word to check if it is a palindrome: ");
        String word = sc.nextLine();

        StringBuilder reverse = new StringBuilder(word).reverse();

        if (reverse.toString().equalsIgnoreCase(word)){
            System.out.println("Your word is a palindrome");
        }
        else {
            System.out.println("Your word is not a palindrome.");
            System.out.println("The reverse of your word is " + reverse.toString().toLowerCase());
        }

    }
}
