package main.java.seminar.seminar6.service;

import main.java.seminar.seminar6.model.Book;

import java.util.List;

public interface Searchble {
    List<Book> searchAuthor(String authorName);
}
