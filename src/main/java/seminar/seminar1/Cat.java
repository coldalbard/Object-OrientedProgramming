package main.java.seminar.seminar1;

public class Cat extends Animal{
    private String color;
    private Integer age;

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

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error");
        }
    }

    public Cat(){

    }

    @Override
    public void animalInfo() {
        System.out.println("Кот: " + super.getName() + " Цвет кота: " + getColor() + " Возраст: " + getAge());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
