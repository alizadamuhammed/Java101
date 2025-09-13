package main.java102.topic1;

public class Course {
    public String name;
    public String code;
    public int note;

    public Course(String name, String code, int note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
