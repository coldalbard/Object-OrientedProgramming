package main.java.lesson.lesson5.ex3Math.Client;

import java.util.Scanner;

import main.java.lesson.lesson5.ex3Math.Core.Views.View;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
