package main.java.homework.homework7.model;

public class ComplexCalculate extends Calculable{
    private float a;
    private float b;
    private float newA;
    private float newB;

    public ComplexCalculate(float a, float b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public Calculable sum(Number a, Number b) {
        newA = this.a + a.floatValue();
        newB = this.b * ((float) 0.1) + b.floatValue() * ((float) 0.1);
        ComplexCalculate newCalculate = new ComplexCalculate(newA, newB);
        return newCalculate;
    }

    @Override
    public Calculable multi(Number a, Number b) {
        newA = (this.a * a.floatValue()) - ((this.b * ((float) 0.1)) * (b.floatValue() * ((float) 0.1)));
        newB = ((this.b * ((float) 0.1)) * a.floatValue()) + (this.a * (b.floatValue() * ((float) 0.1)));
        ComplexCalculate newCalculate = new ComplexCalculate(newA, newB);
        return newCalculate;
    }

    @Override
    public Calculable sub(Number a, Number b) {
        newA = this.a - a.floatValue();
        newB = this.b * ((float) 0.1) - b.floatValue() * ((float) 0.1);
        ComplexCalculate newCalculate = new ComplexCalculate(newA, newB);
        return newCalculate;
    }

    @Override
    public Calculable division(Number a, Number b) {
        newA = ((this.a * a.floatValue()) + ((this.b * ((float) 0.1)) * (b.floatValue() * ((float) 0.1)))) / ((a.floatValue() * a.floatValue()) + ((b.floatValue() * ((float) 0.1)) * (b.floatValue()* ((float) 0.1))));
        newB = (((this.b * ((float) 0.1)) * a.floatValue()) - (this.a * (b.floatValue() * (float) 0.1))) / ((a.floatValue() * a.floatValue()) + ((b.floatValue() * ((float) 0.1)) * (b.floatValue() * ((float) 0.1))));
        ComplexCalculate newCalculate = new ComplexCalculate(newA, newB);
        return newCalculate;
    }

    @Override
    public Number getResult() {
        return a + b;
    }

    @Override
    public String toString() {
        return "ComplexCalculate{ " +
                "a=" + a +
                ", b=" + b + " }";
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
