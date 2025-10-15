package main.java102.booksorter;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int pageCount;
    private int publishYear;

    public Book(String name, String author, int pageCount, int publishYear) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}
