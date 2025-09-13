package main.java102.topic1;

public class Calculate {
    public static void calcAverage(int[] notes){
        double total = 0;
        for (int note : notes) {
            total += note;
        }
        double mean = total / notes.length;
        System.out.println("mean = " + mean);
    }
}
