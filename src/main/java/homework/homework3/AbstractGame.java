package main.java.homework.homework3;

import java.util.*;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;
    Scanner sc = new Scanner(System.in);

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        System.out.println("comp:  " + computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
    }

    @Override
    public Answer inputValue(String value) {
        Integer bull = 0;
        Integer cow = 0;
        if (currentTry >= maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("вы проиграли по количеству попыток");
            Boolean restart = restartGame();
            if (!restart) return null;
            else if (restart) start(sizeWord, maxTry);
        }
        if(value.length() == computerWord.length()) {
            List<Integer> checkCounting = counting(value);
            bull = checkCounting.get(0);
            cow = checkCounting.get(1);
        } else {
            System.out.println("Количество символов не совподает(");
            bull = 0;
            cow = 0;
            return null;
        }
        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("вы Победили!!");
            Boolean restart = restartGame();
            if (!restart) return null;
            else if(restart) start(sizeWord, maxTry);
            bull = 0;
            cow = 0;
        }
        return new Answer(bull, cow, currentTry);
    }


    private List<Integer> counting(String value){
        List<Integer> result = new ArrayList<>();
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
        result.add(bull);
        result.add(cow);
        currentTry++;
        return result;
    }

    private boolean restartGame() {
        System.out.printf("Хотите начать игру занаво?: \nЕсли да, то введите [да], в противном случае [нет]: ");
        String restart = sc.nextLine().toLowerCase(Locale.ROOT);
        if (restart.contains("нет")) return false;
        else if (restart.contains("да")) {
            return true;
        }
        else {
            System.out.println("Неправильный ввод, попробуйте снова. ");
            return restartGame();
        }
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        String result = "";
        Random random = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += charList.get(randomIndex);
            charList.remove(randomIndex);
        }
        return result;
    }
}
