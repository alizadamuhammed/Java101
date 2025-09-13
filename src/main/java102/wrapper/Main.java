package main.java102.wrapper;

public class Main {
    public static void main(String[] args) {
//        Integer b = 20;
//        int a = 20;
//        String salam = b.toString();
//
//        String a = "10";
//        int b = 10;
//        System.out.println(a + b);

        //AutoBoxing
        int a = 1;
        Integer b = a;

        //Boxing
        Integer c = Integer.valueOf(a);

        //AutoUnboxing
        int d = c;

        //Unboxing
        int e = c.intValue();




    }
}
