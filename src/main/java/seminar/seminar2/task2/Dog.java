package main.java.seminar.seminar2.task2;

public class Dog extends Animal{
    protected static int count;

    public Dog(String name, int maxRunDistance, int maxSailDistance) {
        super("Dog", name, maxRunDistance, maxSailDistance);
        count++;
    }
}
