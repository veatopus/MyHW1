package com.example.myhw1.data;

import com.example.myhw1.data.models.Book;

import java.util.ArrayList;
import java.util.List;

public class TestRepo {

    public static List<Book> getBookList() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Lion King", "lalala"));
        books.add(new Book("The Lion King 2", "lalala2"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        books.add(new Book("The Lion King 3", "lalala3"));
        return books;
    }
}