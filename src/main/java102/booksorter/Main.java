package main.java102.booksorter;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 310, 1937);
        Book b2 = new Book("Pride and Prejudice", "Jane Austen", 279, 1813);
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee", 281, 1960);
        Book b4 = new Book("1984", "George Orwell", 328, 1949);
        Book b5 = new Book("The Catcher in the Rye", "J.D. Salinger", 277, 1951);

        Set<Book> books = new TreeSet<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for (Book b : books) {
            System.out.println(b);
        }

        Comparator<Book> sortByPageCount = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPageCount(), o2.getPageCount());
            }
        };

        Set<Book> booksByPageCount = new TreeSet<>(sortByPageCount);

        booksByPageCount.addAll(books);
        for (Book b : booksByPageCount) {
            System.out.println(b);
        }

    }
}
