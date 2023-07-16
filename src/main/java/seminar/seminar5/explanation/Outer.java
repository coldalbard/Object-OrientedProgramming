package main.java.seminar.seminar5.explanation;

public class Outer {
    int outerValue;

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer() {
    }
    public void outerMethod(){
        System.out.println(outerValue);
        outerMethod();
    }
    class Inner{ //класс вложенный, работает только когда мы создали сущность внешнего класса
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }
        public void innerMetod(){
            System.out.println(innerValue);
            System.out.println(outerValue);
            innerMetod();
            outerMethod();
        }
    }
}
