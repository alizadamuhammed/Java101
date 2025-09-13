package main.java102.interfacee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter price: ");
        double price = sc.nextDouble();
        System.out.println("Please enter card number: ");
        String cardNumber = sc.next();
        System.out.println("Please enter card expiry: ");
        String cardExpiry = sc.next();
        System.out.println("Please enter card cvv: ");
        String cardCVV = sc.next();

        System.out.println("Choose bank: \n" +
                "1. A bank\n2. B bank\n3. C bank");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ABank aPos = new ABank("Bank A", "121212", "1212112");
                aPos.connect("127.0.0.1");
                aPos.sendCardInfo(price,  cardNumber, cardExpiry, cardCVV);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
