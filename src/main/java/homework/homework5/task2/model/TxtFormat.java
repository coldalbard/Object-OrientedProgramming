package main.java.homework.homework5.task2.model;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class TxtFormat extends Format{
    private String fileName;

    public TxtFormat(FileType formatName) {
        super(formatName);
        this.fileName = "D:\\oopJava\\gbproj\\src\\main\\java\\homework\\homework5\\task2\\service\\phonebook.txt";
    }
    public TxtFormat(FileType formatName, String fileName) {
        super(formatName);
        this.fileName = fileName;
    }

    @Override
    public boolean exportDate(FileType type, String locationPath, String path) {
        File newFile = new File(path);
        String cont = dateTxt(locationPath);
        if(type == FileType.TXT) cont = dateTxt(locationPath);
        if (type == FileType.JSON) cont = dateJson(locationPath);
        try {
            if (newFile.exists() == false) newFile.createNewFile();
            PrintWriter out = new PrintWriter(newFile);
            out.append(cont);
            out.close();
        }
        catch (Exception e){
            System.out.println("Неверно указан исходный или конечный файл(");
            return false;
        }
        return true;
    }

    @Override
    public boolean importDate(FileType type, String locationPath, String departurePath) {
        StringBuilder sb = new StringBuilder();
        if (type == FileType.TXT) sb = new StringBuilder(dateTxt(locationPath));
        if (type == FileType.JSON) sb = new StringBuilder(dateJson(locationPath));

        File newFile = new File(departurePath);
        try {
            if (newFile.exists() == false) newFile.createNewFile();
            PrintWriter out = new PrintWriter(newFile);
            out.append(sb.toString());
            out.close();
        }
        catch (Exception e){
            System.out.println("Неверно указан исходный или конечный файл(");
            return false;
        }
        return true;
    }

    @Override
    public String dateJson(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                if ((char)c == '=') {
                    sb.append("\":");
                    continue;
                }
                if ((char)c == '\n') {
                    sb.append("-,");
                    continue;
                }
                sb.append(Character.toString(c));
                if ((char)c == ' ') sb.append("\"");
            }
        } catch (Exception ex) {
            System.out.println("Неверно указан исходный или конечный файл(");
        }
        sb.deleteCharAt(sb.length() - 1);
        String f = sb.toString();
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = f.split("-,");
        stringBuilder.append("[").append("\n");
        for (String string : strings) {
            stringBuilder.append("    {\"").append(string).append("},\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);
        stringBuilder.append("\n").append("]");
        return stringBuilder.toString();
    }

    @Override
    public String dateTxt(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                sb.append(Character.toString(c));
            }
        } catch (Exception ex) {
            System.out.println("Неверно указан исходный или конечный файл(");
        }
        return sb.toString();
    }

    public void edit(List<Contact> contacts){
        StringBuilder sb = new StringBuilder();
        for (Contact contact: contacts) {
            sb.append(contact).append("\n");
            try {
                FileWriter fw = new FileWriter(fileName, false);
                fw.write(sb.toString());
                fw.close();
            } catch (Exception e){
                System.out.println("Неверно указан исходный или конечный файл(");
            }
        }
    }


}
