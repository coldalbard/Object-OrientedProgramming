package main.java.seminar.seminar5.explanation;

public class Anon {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("летим, летим");
            }
        };
        flyable.fly();
        System.out.println(flyable.getClass().getName());
        Flyable flyable2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("летим, летим");
            }
        };
        flyable2.fly();
        System.out.println(flyable2.getClass().getName());
        // Анонимные классы
        // вместо хэш кода, идет имплемент Anon implemets Flyable
        // происходит овверайд методов
        // под капотом создается Anon flyable = new Anon();
    }
}
