package main.java102.classrelations;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Muhammed", "Alizada", 85, "AA", 99);
        Student st2 = new Student("Aynur", "Mammadova", 86, "BB", 99);
        Student st3 = new Student("Bob", "Marley", 87, "CC", 99);

        Course math = new Course("Math", "101");
        Student[] students = {st1, st2, st3};
        System.out.println(math.calcAverage(students));

    }


}
