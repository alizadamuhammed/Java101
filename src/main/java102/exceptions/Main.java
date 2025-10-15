package main.java102.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeCheckException {
//        System.out.println("Program started");
//        Scanner sc = new Scanner(System.in);
//
//        int a = 1;
//        int b = 20;
//        int c;
//        int[] arr = new int[2];
//
//        try {
//            System.out.println("Division operation started");
//            System.out.println(b / a);
//            System.out.println("Division operation finished");
//            System.out.print("Enter an integer: ");
//            c = sc.nextInt();
//            arr[5] = c;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("Program finished");
//        }
//


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try{
            checkAge(age);
        }
        catch(AgeCheckException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program finished");
    }

    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException();
        }
    }
}
