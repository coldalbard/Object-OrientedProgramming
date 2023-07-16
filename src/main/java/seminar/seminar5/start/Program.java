package main.java.seminar.seminar5.start;

import main.java.seminar.seminar5.controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("name", "surname", "patronomyc");
        controller.createStudent("name", "surname", "patronomyc");
        controller.createStudent("name", "surname", "patronomyc");
        controller.createStudent("name", "zxc", "patronomyc");
        controller.getAllStudent();
    }
}
