package main.java101.classess.studentinfosystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNum;
    String classes;
    double averege;
    boolean isPass;

    public Student(Course c1, Course c2, Course c3, String name, String studentNum, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.studentNum = studentNum;
        this.classes = classes;
        this.averege = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100)
            this.c1.note = note1;
        if (note2 >= 0 && note2 <= 100)
            this.c2.note = note2;
        if (note3 >= 0 && note3 <= 100)
            this.c3.note = note3;
    }

    void printNotes() {
        System.out.println(this.c1.name + " note of " + this.name + " is " + this.c1.note);
        System.out.println(this.c2.name + " note of " + this.name + " is " + this.c2.note);
        System.out.println(this.c3.name + " note of " + this.name + " is " + this.c3.note);
        System.out.println("Average of " + this.name + " is " + this.averege);
    }

    void isPass() {
        this.averege = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.averege > 0.0){
            System.out.println(this.name + " is passed the course!");
            this.isPass = true;
        }
        else {
            System.out.println(this.name + " is not passed the course!");
            this.isPass = false;
        }
        printNotes();
    }

    void calcAvarage() {
        this.averege = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
    }
}
