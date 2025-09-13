package main.java102.inheritance;

public abstract class Academician extends Employee {
    private String department;
    private String title;

    public Academician(String name, String number, String email, String department, String title) {
        super(name, number, email);
        this.department = department;
        this.title = title;
    }

    @Override
    public void     enter() {
        System.out.println(this.getName() + " named academician entered the university.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void enterLesson();
}
