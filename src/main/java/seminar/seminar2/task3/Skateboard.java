package main.java.seminar.seminar2.task3;

public class Skateboard implements Transport{

    @Override
    public void run() {
        System.out.println("Скейтборд начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Скейтборд остановился");
    }
}
