package org.example.hometask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Feslegen", "HAO", 12));
        bookList.add(new Book("Steve Jobs", "Paul", 23));
        bookList.add(new Book("Success", "Armo", 14));

        Collections.sort(bookList);

        for(Book book: bookList) {
            System.out.println(book);
        }
    }
}