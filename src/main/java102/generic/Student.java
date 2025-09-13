package main.java102.generic;

public class Student<T> implements IDatabase<T> {

    @Override
    public boolean insert(T data) {
        return false;
    }

    @Override
    public boolean delete(T data) {
        return false;
    }

    @Override
    public boolean update(T data) {
        return false;
    }

    @Override
    public T select(T data) {
        return null;
    }
}
