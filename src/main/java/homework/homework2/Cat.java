package main.java.homework.homework2;

public class Cat extends LiveBeing implements Action{
    private String catName;
    private int runDistance;
    private int height;
    private static int count;

    public Cat(String catName, int runDistance, int height) {
        this.catName = catName;
        this.runDistance = runDistance;
        this.height = height;
    }
    public Cat() {
        count += 1;
        this.catName = "cat" + count;
        this.runDistance = count;
        this.height = count;
    }
    @Override
    public void run() {
        System.out.println("Кот бежит");
    }
    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }
    @Override
    public void stop() {
        System.out.println("Кот не прошел испытание\n");
    }
    @Override
    public int getRun() {
        return runDistance;
    }

    @Override
    public String getName() {
        return catName;
    }
    @Override
    public int getHeight() {
        return height;
    }
}
