package main.java.homework.homework7.service;

import main.java.homework.homework7.model.Calculable;
import main.java.homework.homework7.model.Calculator;
import main.java.homework.homework7.model.ComplexCalculate;

import java.util.List;

public class CalcFactory implements ICalculableFactory{
    @Override
    public Calculable create(List numbers){
        if (numbers.size() < 1){
            System.out.println("Некоректные данные");
        } else {
            switch (numbers.size()) {
//                case 1 : return new Calculator(((int) numbers.get(0)), 0);
                // вдруг если захочется добавить обычный калькулятор
                case 2:
                    return new ComplexCalculate(((float) numbers.get(0)), ((float) numbers.get(1)));
            }
        }
        return null;
    }
}
