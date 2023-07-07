package main.java.homework.homework3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogFile lgf = new LogFile();
        AbstractGame game = new NumberGame();
        System.out.printf("rus - русский алфавит, en - английский алфавит, num - число\n");
        boolean flag = false;
        while (!flag) {
            System.out.printf("Введите на каких символах будем играть: ");
            String language = scanner.nextLine();
            if (language.equals("rus")) {
                flag = true;
                game = new RuGame();
            }
            else if (language.equals("en")) {
                flag = true;
                game = new EnGame();
            }
            else if (language.equals("num")) {
                flag = true;
                game = new NumberGame();
            }
            else System.out.println("Неправильный ввод(\n");
        }
        System.out.printf("Введите количество символов, для генерации слова: ");
        int size = scanner.nextInt();
        game.start(size, size);
        scanner.nextLine();
        while (!game.getGameStatus().equals(GameStatus.FINISH)){
            String value = scanner.nextLine();
            Answer answer = game.inputValue(value);
            if (answer!=null){
                System.out.printf("bull = %d, cow = %d\n", answer.getBull(), answer.getCow());
                lgf.saveToFile(value);
                lgf.saveToFile(answer.toString());
            }
        }
    }
}
