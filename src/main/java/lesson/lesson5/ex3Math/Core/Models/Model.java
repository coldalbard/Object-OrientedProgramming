package main.java.lesson.lesson5.ex3Math.Core.Models;

import main.java.lesson.lesson5.ex3Math.Mathematics.CalculateArea.Calculate;
import main.java.lesson.lesson5.ex3Math.Mathematics.Shapes.Canvas;
import main.java.lesson.lesson5.ex3Math.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}
