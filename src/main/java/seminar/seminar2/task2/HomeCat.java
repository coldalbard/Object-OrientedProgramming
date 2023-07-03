package main.java.seminar.seminar2.task2;

public class HomeCat extends Cat{
    protected static int count;

    public HomeCat(String name, int maxRunDistance, int maxSailDistance) {
        super(name, maxRunDistance, 0);
        count++;
    }
}
