package main.java102.topic1;

public class Player {
    public String name;
    public int idNo;

    public static int counter = 2;

    public Player(String name, int idNo) {
        this.name = name;
        this.idNo = idNo;
    }

    public void showName() {
        System.out.println(this.name);
    }
}
