package main.java.seminar.seminar2.task2;

public class Tiger extends Cat{
    protected static int count;

    public Tiger(String name, int maxRunDistance, int maxSailDistance) {
        super(name, maxRunDistance, 0);
        count++;
    }
}
