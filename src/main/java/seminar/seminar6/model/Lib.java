package main.java.seminar.seminar6.model;

import main.java.seminar.seminar6.service.Searchble;

import java.util.ArrayList;
import java.util.List;

public class Lib implements Searchble {
    List<Book> libary;

    public Lib(List<Book> libary) {
        this.libary = libary;
    }

    public Lib() {
    }

    @Override
    public List<Book> searchAuthor(String authorName) {
        List<Book> searchBooks = new ArrayList<>();
        for (Book book: this.libary) {
            if (book.getAuthor().equals(authorName)) searchBooks.add(book);
        }
        return searchBooks;
    }

    public List<Book> getLibary() {
        return libary;
    }

    public void setLibary(List<Book> libary) {
        this.libary = libary;
    }
}
