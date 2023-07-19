package main.java.homework.homework5.task2.view;

import main.java.homework.homework5.task2.controller.Controller;

public class ConsoleView extends Controller{
    public void runProgram(){
        Controller controller = new Controller();
        int run = 0;
        while (run != 8){
            System.out.println();
            run = controller.getView().mainPage();
            System.out.println();
            switch (run) {
                case 1 -> controller.showPhonebook();
                case 2 -> controller.findContact();
                case 3 -> controller.addContact();
                case 4 -> controller.changeContact();
                case 5 -> controller.deleteContact();
                case 6 -> controller.importPhonebook();
                case 7 -> controller.exportPhonebook();
                case 8 -> System.out.println("Всего доброго!");
            }
        }
    }
}
