package main.java102.classrelations;

public class Student {
    private String name;
    private String student;
    private int idNumber;
    private String address;
    private int note;

    public Student(String name, String string, int idNumber, String address, int note) {
        this.name = name;
        this.student = string;
        this.idNumber = idNumber;
        this.address = address;
        if (note < 0 || note > 100) {
            note = 0;
        }
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if (note < 0 || note > 100) {
            note = 0;
        }
        this.note = note;
    }
}
