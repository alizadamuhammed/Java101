package main.java102.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(null);
        set.add(-1);
        set.add(-10);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


//        HashSet<List<String>> set = new HashSet<>();
//
//        for(int i = 0; i < t; i++){
//            List<String> list = new ArrayList<>();
//            list.add(pair_left[i]);
//            list.add(pair_right[i]);
//            set.add(list);
//        }


    }
}