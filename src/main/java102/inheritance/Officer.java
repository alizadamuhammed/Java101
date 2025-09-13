package main.java102.inheritance;

public abstract class Officer extends Employee {
    private String department;
    private String workHours;

    public Officer(String name, String number, String email, String department, String workHours) {
        super(name, number, email);
        this.department = department;
        this.workHours = workHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public void work() {
        System.out.println(this.getName() + " doing his jobs.");
    }

    @Override
    public void enter() {
        System.out.println(this.getName() + " named officer entered the university.");
    }
}
