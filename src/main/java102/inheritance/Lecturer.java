package main.java102.inheritance;

public class Lecturer extends Academician {
    private String doorNumber;

    public Lecturer(String name, String number, String email, String department, String title, String doorNumber) {
        super(name, number, email, department, title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public void enter() {
        System.out.println(this.getName() + " named lecturer entered the university.");
    }

    @Override
    public void enterLesson() {
        
    }
}
