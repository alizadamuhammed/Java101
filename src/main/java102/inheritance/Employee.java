package main.java102.inheritance;

public abstract class Employee {
    private String name;
    private String number;
    private String email;

    public Employee(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public static void loginUsers(Employee[] loginUsers) {
        for (Employee e : loginUsers) {
            e.enter();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void enter();

    public void exit() {
        System.out.println(this.name + " Exited the university.");
    }

    public void canteen() {
        System.out.println(this.name + " Entered the canteen.");
    }


}
