package main.java.homework.homework2;

public class Robot implements Action{
    private String robotName;
    private int runDistance;
    private int height;
    private static int count;

    public Robot(String robotName, int runDistance, int height) {
        this.robotName = robotName;
        this.runDistance = runDistance;
        this.height = height;
    }

    public Robot() {
        count += 1;
        this.robotName = "robot" + count;
        this.runDistance = count;
        this.height = count;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }
    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
    @Override
    public void stop() {System.out.println("Робот не прошел испытание\n");}
    @Override
    public int getRun() {return runDistance;}
    @Override
    public int getHeight() {return height;}
    public String getRobotName() {
        return robotName;
    }
}
