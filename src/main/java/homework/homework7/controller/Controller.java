package main.java.homework.homework7.controller;

import main.java.homework.homework7.model.Calculable;
import main.java.homework.homework7.model.ComplexCalculate;
import main.java.homework.homework7.model.LogCalculator;
import main.java.homework.homework7.view.View;

public class Controller {
    View view = new View();
    public int main(){
        return view.mainPage();
    }
    public void sum(){
        Calculable calc = view.sum();
    }
    public void division(){
        Calculable calc = view.division();
    }
    public void sub(){
        Calculable calc = view.sub();
    }

    public void multi(){
        Calculable calc = view.multi();
    }
}
