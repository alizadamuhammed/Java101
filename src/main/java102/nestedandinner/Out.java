package main.java102.nestedandinner;

// Outer class
public class Out {
    public int a = 100;
    public static int b = 31;

    // Inner class
    public static class Inner {
        public static int a = 10;

        public static void run() {
            System.out.println("Run method of Inner class");
            int a = 1;
            System.out.println(a);
            System.out.println(Inner.a);
//            System.out.println(a);
//            System.out.println(this.a);
            System.out.println(Out.b);
        }
    }

    public void run() {
        System.out.println("Run method of Out class");
    }
}
