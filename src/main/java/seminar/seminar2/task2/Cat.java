package main.java.seminar.seminar2.task2;

public class Cat extends Animal{
    protected static int count;

    public Cat(String name, int maxRunDistance, int maxSailDistance) {
        super("Cat", name, maxRunDistance, 0);
        count++;
    }
}
