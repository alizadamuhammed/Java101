package main.java101.arrays;

public class ArrayHelper {

    static void averageCalculator(int[] list) {
        double sum = 0;

        for (int j : list) {
            sum += j;
        }
        double average = sum / list.length;
        System.out.println("Average: " + average);
    }

    static void harmonicCalculator(double[] list) {
        double sum = 0;
        for (double j : list) {
            sum += 1 / j;
        }
        System.out.println("Harmonic: " + sum);
    }
}
