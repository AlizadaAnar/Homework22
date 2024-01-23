package org.example.hometask1;

public class Book implements Comparable<Book>{
    public String title;
    public String author;
    public int price;

    @Override
    public int compareTo(Book b) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.title, b.title);
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
