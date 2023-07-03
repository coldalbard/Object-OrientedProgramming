package main.java.seminar.seminar2.task2;

public class Main {
    public static void main(String[] args) {
//        HomeCat homeCat = new HomeCat("barsik", 100, 23);
        Animal[] animals = {
                new HomeCat("barsik", 100, 23),
                new Dog("asd", 10000, 2354),
                new Tiger("asdwadad", 5984, 15),
                new Cat("sadzzxcx", 78945, 10)
        };
        for (Animal animal : animals) {
            animal.run(150);
            animal.sail(20);
        }
        System.out.println(Animal.countAnimals);
        System.out.println(Cat.count);
        System.out.println(HomeCat.count);
        System.out.println(Tiger.count);
        System.out.println(Dog.count);
    }
}
