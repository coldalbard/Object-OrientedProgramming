package main.java.seminar.seminar2.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("qwe", "orange", 21);
        cat1.setName("Черныш");
        cat1.setColor("Черный");
        cat1.setAge(6);
        System.out.println(cat1);
        cat1.jump();
        cat1.voice();
        cat1.animalInfo();
        Animal[] catDogs = {
                new Cat("qwe", "orange", 5),
                new Dog("ads", "black", 8)
        };
        for (Animal an: catDogs) {
            if(an instanceof Cat) ((Cat)(an)).klubok();
            else System.out.println("not cat");
            an.voice();
        }
    }
}
