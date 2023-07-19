package main.java.homework.homework5.task2.model;

import java.util.List;

public abstract class Format {
    private FileType formatName;
    public Format(FileType formatName){
        this.formatName = formatName;
    }
    public abstract boolean exportDate(FileType type, String locationPath, String path);
    public abstract boolean importDate(FileType type, String locationPath, String departurePath);
    public abstract String dateJson(String path);
    public abstract String dateTxt(String path);

    public FileType getFormatName() {
        return formatName;
    }
}
