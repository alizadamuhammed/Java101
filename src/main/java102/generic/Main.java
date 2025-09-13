package main.java102.generic;

public class Main {
    public static void main(String[] args) {
//        Nullable<String> nullable = new Nullable<>("salam");
//        nullable.run();
//        Nullable<Integer> nullable2 = new Nullable<>(10);
//        nullable2.run();
//        Nullable<Double> nullable3 = new Nullable<>(1.5);
//        nullable3.run();

//        Nullable<Integer> nullable = new Nullable<>(12);
//        nullable.run();

//        Integer a = 10;
//        String b = "salam";
//        Double c = 31.1;
//
//        Test<Integer, String, Double> test = new Test<>(a, b, c);
//        test.showInfo();

        Student<String> student = new Student<>();
        student.insert("Salam");

    }
}
