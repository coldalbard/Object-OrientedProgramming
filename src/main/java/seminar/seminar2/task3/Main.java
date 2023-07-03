package main.java.seminar.seminar2.task3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle =new Bicycle();
        Motocycle motocycle = new Motocycle();
        human.stop();
        human.drive(bicycle);
        human.stop();
        human.drive(motocycle);
        human.stop();
    }
}
