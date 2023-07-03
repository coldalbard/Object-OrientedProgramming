package main.java.seminar.seminar2.task3;

public class Motocycle implements Transport{
    @Override
    public void run() {
        System.out.println("Мотоцикл начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл остановился");
    }
}
