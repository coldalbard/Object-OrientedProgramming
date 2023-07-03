package main.java.seminar.seminar2.task1;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void animalInfo();
    public void voice(){
        System.out.println("Животное по имени: " + name + " издает звук");
    }
    public void jump(){
        System.out.println("Животное по имени: " + name + " прыгает");
    }
}
