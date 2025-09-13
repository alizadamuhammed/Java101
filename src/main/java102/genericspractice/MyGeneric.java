package main.java102.genericspractice;

import java.util.Arrays;

public class MyGeneric<T> {

    private T[] array;
    private int capacity;
    private int size;


    public MyGeneric(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    public MyGeneric() {
        this(10);
    }

    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public MyGeneric<T> sublist(int start, int finish) {
        if (start < 0) start = 0;
        if (finish > this.size) finish = this.size;
        if (start >= finish) return new MyGeneric<>();

        MyGeneric<T> sub = new MyGeneric<>(finish - start);
        for (int i = start; i < finish; i++) {
            sub.array[i] = array[i];
            sub.size++;
        }
        return sub;
    }

    public T[] toArray() {
        return Arrays.copyOf(this.array, this.size);
    }

    public boolean contains(T data) {
        for (int i = 0; i < this.size; i++) {
            if ((this.array[i] == null && data == null) || (this.array[i] != null && this.array[i].equals(data))) {
                return true;
            }
        }
        return false;
    }

    public void add(T t) {
        if (isCapacityFull()) {
            openCapacityArea();
        }
        this.array[this.size++] = t;
    }

    private boolean isCapacityFull() {
        return this.size == this.capacity;
    }

    private void openCapacityArea() {
        this.capacity *= 2;
        T[] newArray = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    private T[] getArray() {
        return array;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public T getByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return this.array[index];
    }

    public T removeByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removed = this.array[index];

        for (int i = 0; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.size - 1] = null;
        this.size--;

        return removed;
    }

    public T setByIndex(int index, T t) {
        if (index < 0 || index >= size) {
            return null;
        }
        T oldValue = this.array[index];
        this.array[index] = t;
        return oldValue;
    }

    @Override
    public String toString() {
        return "MyGeneric{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
