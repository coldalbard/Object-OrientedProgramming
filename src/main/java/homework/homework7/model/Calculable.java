package main.java.homework.homework7.model;

public abstract class Calculable<E extends Number> {
    public abstract Calculable sum(E a, E b);
    public abstract Calculable multi(E a, E b);
    public abstract Calculable sub(E a, E b);
    public abstract Calculable division(E a, E b);
    public abstract E getResult();
}
