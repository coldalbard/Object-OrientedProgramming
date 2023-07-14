package main.java.seminar.seminar4.task3;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= 100; i+=50) {
            doubleList.add((double) i);
            integerList.add(i);
        }
        Calculate calc1 = new Calculate(doubleList);
        Calculate calc2 = new Calculate(integerList);
        System.out.println("calc.sum() = " + calc1.sum());
        System.out.println("calc2.sum() = " + calc2.sum());
    }
}
