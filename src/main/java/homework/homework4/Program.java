package main.java.homework.homework4;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < 26; i++) {
            doubleList.add((double) i);
            integerList.add(i);
        }
        Calculate calc1 = new Calculate(doubleList);
        Calculate calc2 = new Calculate(integerList);
        System.out.println("calc.sum() = " + calc1.sum());
        System.out.println("calc1.multiplication() = " + calc1.multiplication());
        System.out.println("calc1.division() = " + calc1.division());
        System.out.println("calc1.binaryTranslation() = " + calc1.binaryTranslation());
    }
}
