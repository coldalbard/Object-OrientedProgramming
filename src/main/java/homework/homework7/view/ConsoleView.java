package main.java.homework.homework7.view;

import main.java.homework.homework7.controller.Controller;

public class ConsoleView {
    Controller controller = new Controller();
    public void run(){
        System.out.println("Все данные заносятся в архив!");
        int run = 0;
        while (run != 5){
            run = controller.main();
            System.out.println();
            switch (run){
                case 1 -> controller.sum();
                case 2 -> controller.sub();
                case 3 -> controller.multi();
                case 4 -> controller.division();
                case 5 -> System.out.println("Всего доброго)");
            }
        }
    }
}
