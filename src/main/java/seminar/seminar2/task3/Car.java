package main.java.seminar.seminar2.task3;

public class Car implements Transport{

    @Override
    public void run() {
        System.out.println("Машина начала движение");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}
