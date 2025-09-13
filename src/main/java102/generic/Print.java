package main.java102.generic;

public class Print {
    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
