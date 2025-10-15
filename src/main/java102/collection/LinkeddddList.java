package main.java102.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkeddddList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Muhammed");
        list.add("Alizada");
        list.add("Aynur");
        list.add("Mammadova");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
