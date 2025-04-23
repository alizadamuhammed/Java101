package main.java101.classess.studentinfosystem;

public class Teacher {
    String name;
    String mobileNumber;
    String branch;

    public Teacher(String name, String mobileNumber, String branch) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.branch = branch;
    }

    void printInfo() {
        System.out.println("Name: " + name
                + "\nMobile Number: " + mobileNumber
                + "\nBranch: " + branch);
    }
}
