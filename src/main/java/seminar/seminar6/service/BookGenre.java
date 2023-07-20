package main.java.seminar.seminar6.service;

public class BookGenre implements Genre{
    String GenreName;

    public BookGenre(String genreName) {
        GenreName = genreName;
    }

    @Override
    public String getGenreName() {
        return GenreName;
    }

    @Override
    public String toString() {
        return "GenreName='" + GenreName + '\'';
    }
}
