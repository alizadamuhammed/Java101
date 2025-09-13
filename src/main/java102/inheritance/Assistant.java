package main.java102.inheritance;

public class Assistant extends Academician{
    private String officeHours;

    public Assistant(String name, String number, String email, String department, String title, String officeHours) {
        super(name, number, email, department, title);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void enterLesson() {

    }
}
