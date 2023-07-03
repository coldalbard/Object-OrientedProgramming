package main.java.lesson.lesson2.ex6.Interface;

import main.java.lesson.lesson2.ex6.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
