package main.java.seminar.seminar6.model;

import main.java.seminar.seminar6.service.BookGenre;

public class Book {
    private String bookName;
    private String author;
    private int size;
    private BookGenre bookGenre;

    public Book(String bookName, String author, int size, BookGenre bookGenre) {
        this.bookName = bookName;
        this.author = author;
        this.size = size;
        this.bookGenre = bookGenre;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", size=" + size +
                ", bookGenre=" + bookGenre +
                '}';
    }
}
