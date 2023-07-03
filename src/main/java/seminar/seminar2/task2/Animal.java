package main.java.seminar.seminar2.task2;

public abstract class Animal {
    protected String type;
    protected String name;
    protected static int countAnimals;
    protected int maxRunDistance;
    protected int maxSailDistance;


    public Animal() {}

    public Animal(String type, String name, int maxRunDistance, int maxSailDistance) {
        this.type = type;
        this.name = name;
        if(type.equals("Cat")){
            if (maxRunDistance > 200) this.maxRunDistance = 200;
            this.maxSailDistance = maxSailDistance;
        } else {
            if (maxRunDistance > 500) this.maxRunDistance = 500;
            if(maxSailDistance > 10) this.maxSailDistance = 10;
        }
        countAnimals++;
    }

    protected void run(int distance){
        if(distance <= maxRunDistance){
            System.out.println(type + " " + name + " - пробежала дистанцию в: " + distance + " км. ");
        } else {
            System.out.println(type + " " + name + " - НЕ пробежала дистанцию в: " + distance + " км. ");
        }
    }
    protected void sail(int distance){
        if(distance <= maxRunDistance){
            System.out.println(type + " " + name + " - проплыло дистанцию в: " + distance + " км. ");
        } else {
            System.out.println(type + " " + name + " - НЕ проплыло дистанцию в: " + distance + " км. ");
        }
    }
}
