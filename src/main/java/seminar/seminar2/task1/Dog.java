package main.java.seminar.seminar2.task1;

public class Dog extends Animal{
    private String color;
    private Integer age;

    public Dog(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }
    public Dog(String color, Integer age) {
        this.color = color;
        this.age = age;
    }
    public Dog() {
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void animalInfo(){
        System.out.println("Собака ");
    }
    @Override
    public void voice(){
        System.out.println("гав, гав");
    }
}
