package main.java101.conditionals;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("You have successfully logged in!");
        }
        else {
            System.out.println("You have unsuccessfully logged in!");
            System.out.print("Do you want to reset your password? (Y/N): ");
            String answer = sc.nextLine();

            if (answer.toUpperCase().equals("Y")) {
                System.out.print("Enter your new password: ");
                password = sc.nextLine();

                if (password.equals("admin")) {
                    System.out.println("Password cannot be same as old password, please try again");
                }
                else System.out.println("You succesfully reset your password");
            }
        }
    }
}
