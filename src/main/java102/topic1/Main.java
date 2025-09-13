package main.java102.topic1;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math", "101", 70);
        Course english = new Course("English", "102", 90);
        Course turkish = new Course("Turkish", "103", 90);
        int[] notes = {math.getNote(), english.getNote(), turkish.getNote()};
        Calculate.calcAverage(notes);
    }
}
