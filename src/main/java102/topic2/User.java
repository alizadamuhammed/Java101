package main.java102.topic2;

public class User {
    public String name;
    public static int counter = 0;

    static {
        System.out.println("Static code block");
    }

    public User(String name) {
        this.name = name;
        counter++;
    }
}
