package main.java.homework.homework7.model;

import main.java.homework.homework7.model.Logable;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LogCalculator extends Calculable{
    private Calculable decorated;
    private String filePath = "D:\\oopJava\\gbproj\\src\\main\\java\\homework\\homework7\\CalcLog.txt";

    public LogCalculator(Calculable decorated) {
        this.decorated = decorated;
    }

    @Override
    public Calculable sum(Number a, Number b) {
        logAction("вызвался метод суммы с параметрами : " + a + " + " + b + " = " + decorated.getResult());
        return decorated.sum(a, b);
    }

    @Override
    public Calculable multi(Number a, Number b) {
        logAction("вызвался метод умножения с параметрами : " + a + " * " + b + " = " + decorated.getResult());
        return decorated.multi(a, b);
    }

    @Override
    public Calculable sub(Number a, Number b) {
        logAction("вызвался метод вычитания с параметрами : " + a + " - " + b + " = " + decorated.getResult());
        return decorated.sub(a, b);
    }

    @Override
    public Calculable division(Number a, Number b) {
        logAction("вызвался метод деления с параметрами : " + a + " / " + b + " = " + decorated.getResult());
        return decorated.division(a, b);
    }

    @Override
    public Number getResult() {
        return decorated.getResult();
    }
    public void logAction(String st){
        File newFile = new File(filePath);
        try {
            if (newFile.exists() == false) newFile.createNewFile();
            PrintWriter out = new PrintWriter(new FileWriter(newFile, true));
            out.append(st);
            out.append("\n");
            out.close();
        }
        catch (Exception e){
            System.out.println("Неверно указан исходный или конечный файл(");
        }
    }
}
