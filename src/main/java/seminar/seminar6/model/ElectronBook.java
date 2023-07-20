package main.java.seminar.seminar6.model;

import main.java.seminar.seminar6.service.BookGenre;

public class ElectronBook extends Book{
    String openFormat;
    Integer sizeFile;

    public ElectronBook(String bookName, String author, Integer size, String openFormat, Integer sizeFile, BookGenre bookGenre) {
        super(bookName, author, size, bookGenre);
        this.openFormat = openFormat;
        this.sizeFile = sizeFile;
    }

    public ElectronBook(String openFormat, Integer sizeFile) {
        this.openFormat = openFormat;
        this.sizeFile = sizeFile;
    }

    public String getOpenFormat() {
        return openFormat;
    }

    public void setOpenFormat(String openFormat) {
        this.openFormat = openFormat;
    }

    public Integer getSizeFile() {
        return sizeFile;
    }

    public void setSizeFile(Integer sizeFile) {
        this.sizeFile = sizeFile;
    }
}
