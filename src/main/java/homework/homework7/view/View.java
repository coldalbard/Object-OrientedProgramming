package main.java.homework.homework7.view;

import main.java.homework.homework7.model.Calculable;
import main.java.homework.homework7.model.ComplexCalculate;
import main.java.homework.homework7.model.LogCalculator;

import java.util.Scanner;

public class View {
    private final Scanner sc = new Scanner(System.in);

//    public int selection(){
//        System.out.println("[1] - обычный калькулятор \n[2] - комплексный калькулятор\nВыберите дейтсвие: ");
//        // не стал писать обычный калькулятор
//        return sc.nextInt();
//    }

    public int mainPage(){
        System.out.println("\nВыберите действие\n");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        System.out.println("5: Выход\n");
        return sc.nextInt();
    }
    public Calculable sum(){
        Calculable complex1;
        Calculable complex2;
        System.out.println("\nWhere i = (-1)^1/2,\n");
        System.out.println("(a + bi) + (c + di)\n");

        System.out.println("Input a:");
        float a = sc.nextFloat();
        System.out.println("Input b:");
        float b = sc.nextFloat();
        complex1 = new ComplexCalculate(a, b);
        System.out.println("Input c:");
        float c = sc.nextFloat();
        System.out.println("Input d:");
        float d = sc.nextFloat();

        complex2 = complex1.sum(c ,d);
        LogCalculator logCalculator = new LogCalculator(complex2);
        logCalculator.sum(a + b * 0.1, c + d * 0.1);
        System.out.println("The result is: " + complex2.getResult());
        return complex2;
    }
    public Calculable sub(){
        Calculable complex1;
        Calculable complex2;
        System.out.println("\nWhere i = (-1)^1/2,\n");
        System.out.println("(a + bi) - (c + di)\n");

        System.out.println("Input a:");
        float a = sc.nextFloat();
        System.out.println("Input b:");
        float b = sc.nextFloat();
        complex1 = new ComplexCalculate(a, b);
        System.out.println("Input c:");
        float c = sc.nextFloat();
        System.out.println("Input d:");
        float d = sc.nextFloat();

        complex2 = complex1.sub(c, d);
        LogCalculator logCalculator = new LogCalculator(complex2);
        logCalculator.sub(a + b * 0.1, c + d * 0.1);
        System.out.println("The result is: " + complex2.getResult());
        return complex2;
    }

    public Calculable multi(){
        Calculable complex1;
        Calculable complex2;
        System.out.println("\nWhere i = (-1)^1/2,\n");
        System.out.println("(a + bi) * (c + di)\n");
        System.out.println("Input a:");
        float a = sc.nextFloat();
        System.out.println("Input b:");
        float b = sc.nextFloat();
        complex1 = new ComplexCalculate(a, b);
        System.out.println("Input c:");
        float c = sc.nextFloat();
        System.out.println("Input d:");
        float d = sc.nextFloat();

        complex2 = complex1.multi(c, d);
        LogCalculator logCalculator = new LogCalculator(complex2);
        logCalculator.multi(a + b * 0.1, c + d * 0.1);
        System.out.println("The result is: " + complex2.getResult());
        return complex2;
    }
    public Calculable division(){
        Calculable complex1;
        Calculable complex2;
        System.out.println("\nWhere i = (-1)^1/2,\n");
        System.out.println("(a + bi) / (c + di)\n");
        System.out.println("Input a:");
        float a = sc.nextFloat();
        System.out.println("Input b:");
        float b = sc.nextFloat();
        complex1 = new ComplexCalculate(a, b);
        System.out.println("Input c:");
        float c = sc.nextFloat();
        System.out.println("Input d:");
        float d = sc.nextFloat();

        complex2 = complex1.division(c, d);
        LogCalculator logCalculator = new LogCalculator(complex2);
        logCalculator.division(a + b * 0.1, c + d * 0.1);
        System.out.println("The result is: " + complex2.getResult());
        return complex2;
    }
}
