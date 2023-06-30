package main.java.seminar.seminar1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "orange", 21);
        cat1.setAge(10);
        Cat cat2 = new Cat();
        System.out.println("Кот: " + cat2.getName() + " Цвет кота: " + cat2.getColor() + " Возраст: " + cat2.getAge());
        cat1.animalInfo();
        cat1.jump();
        cat2.voice();
    }
}
