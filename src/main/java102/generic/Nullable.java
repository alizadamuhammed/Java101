package main.java102.generic;

public class Nullable<T> {
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull() {
        return value == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("value is null");
        } else {
            System.out.println("value is " + value);
        }
    }
}
