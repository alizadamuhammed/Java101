package main.java101.classes.studentinfosystem;

public class Main {
    public static void main(String[] args) {

        Teacher teacherMath = new Teacher("Muhammed", "555", "MTH");
        Teacher teacherHistory = new Teacher("Ali", "444", "HST");
        Teacher teacherPhysics = new Teacher("Cassius", "666", "PHY");

        Course math = new Course("Math", "101", "MTH");
        math.addTeacher(teacherMath);

        Course history = new Course("History", "102", "HST");
        history.addTeacher(teacherHistory);

        Course physics = new Course("Physics", "103", "PHY");
        physics.addTeacher(teacherPhysics);

        Student s1 = new Student(math,history,physics,"Nihad","123", "4");
        s1.addBulkExamNote(80,110,90);
        s1.isPass();

    }
}
