package main.java.homework.homework6.view;

import main.java.homework.homework6.controller.Controller;

public class ConsoleView extends Controller {
    public void runProgram(){
        Controller controller = new Controller();
        int run = 0;
        while (run != 6){
            System.out.println();
            run = controller.getUsv().mainPage();
            System.out.println();
            switch (run) {
                case 1 -> controller.print();
                case 2 -> controller.findUser();
                case 3 -> controller.addUser();
                case 4 -> controller.updataUser();
                case 5 -> controller.deleteUser();
                case 6 -> System.out.println("Всего доброго!");
            }
        }
    }
}
