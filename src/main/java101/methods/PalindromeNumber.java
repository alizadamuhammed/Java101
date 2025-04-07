package main.java101.methods;

public class PalindromeNumber {

    static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        int lastNum;
        while (temp != 0) {
            System.out.println("===================");
            System.out.println("Number is " + temp);
            lastNum = temp % 10;
            System.out.println("Last number is " + lastNum);
            reverse = reverse * 10 + lastNum;
            System.out.println("New number is " + reverse);
            temp = temp / 10;
        }
        if (num == reverse) {
            return true;
        };
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

}
