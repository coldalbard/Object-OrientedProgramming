package main.java.homework.homework2;

public class Human implements Action{
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
        count += 1;
        this.humanName = "human" + count;
        this.runDistance = count;
        this.height = count;
    }


    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек пргает");
    }

    @Override
    public void stop() {
        System.out.println("Человек не прошел испытание\n");
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

    public String getHumanName() {
        return humanName;
    }
}
