package main.java.seminar.seminar6;

import main.java.seminar.seminar6.model.Book;
import main.java.seminar.seminar6.model.JsonFormatter;
import main.java.seminar.seminar6.model.Lib;
import main.java.seminar.seminar6.service.BookGenre;
import main.java.seminar.seminar6.service.Formatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("qwe1", "qwe", 89, new BookGenre("Военный")),
                new Book("qwe2", "qwe", 89, new BookGenre("Комедия")),
                new Book("qw3", "qwe", 89, new BookGenre("Военный"))
        ));
        Lib lib = new Lib(books);
        System.out.println(lib.searchAuthor("qwe"));
        System.out.println();
        Formatter jsonFormatter = new JsonFormatter();
        jsonFormatter.formatted(books);
    }
}
