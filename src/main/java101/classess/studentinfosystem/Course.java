package main.java101.classess.studentinfosystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equalsIgnoreCase(teacher.branch)) {
            this.teacher = teacher;
//            printTeacherInfo();
        } else
            System.out.println("This teacher's branch is not equals with course branch");
    }

    void printTeacherInfo() {
        this.teacher.printInfo();
    }
}
