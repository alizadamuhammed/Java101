package main.java102.nestedandinner;

public class Local {
    public void run(){

        class Yerel{
            private int a;

            public Yerel(int a) {
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }

        Yerel y = new Yerel(15);
        System.out.println(y.getA());

        System.out.println("Local run");


    }


}
