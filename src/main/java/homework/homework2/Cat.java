package main.java.homework.homework2;

public class Cat implements Action{

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
        return getRunDistance();
    }

    @Override
    public int getHeight() {
        return getH();
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getH() {
        return height;
    }

    public String getCatName() {
        return catName;
    }
}
