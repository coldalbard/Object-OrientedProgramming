package main.java.homework.homework2;

public class Human extends LiveBeing implements Action{
    private String humanName;
    private int runDistance;
    private int height;
    private static int count;

    public Human(String humanName, int runDistance, int height) {
        this.humanName = humanName;
        this.runDistance = runDistance;
        this.height = height;
    }
    public Human() {
        this.humanName = "human" + count;
        this.runDistance = count;
        this.height = count;
        count += 1;
    }
    @Override
    public void run() {System.out.println("Человек бежит");}
    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }
    @Override
    public void stop() {
        System.out.println("Человек не прошел испытание\n");
    }
    @Override
    public int getRun() {
        return runDistance;
    }
    @Override
    public int getHeight() {
        return height;
    }
    public String getName() {
        return humanName;
    }
}
