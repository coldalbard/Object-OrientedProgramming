package main.java.seminar.seminar6.model;

import main.java.seminar.seminar6.service.Format;
import main.java.seminar.seminar6.service.Formatter;

import java.util.List;

public class JsonFormatter implements Formatter {

    @Override
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println(book + " переведена в формат" + Format.JSON);
        }
    }
}
