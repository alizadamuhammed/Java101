package main.java102.circle;

public class Circle {
    public int radius;
    public final double PI_SAYISI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calcArea(){
        double area = PI_SAYISI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
}
