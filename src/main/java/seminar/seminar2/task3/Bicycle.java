package main.java.seminar.seminar2.task3;

public class Bicycle implements Transport{
    @Override
    public void run() {
        System.out.println("Велосипед начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановаился");
    }
}
