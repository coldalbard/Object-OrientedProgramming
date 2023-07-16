package main.java.seminar.seminar5.explanation;

public class Outer2 {
    int outerValue;

    public Outer2(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer2() {
    }
    public void outerMethod(){
        System.out.println(outerValue);
        outerMethod();
    }
    static class Inner{ //класс вложенный, но работает отдельно от внешнего класса
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }
        public void innerMetod(){
            System.out.println(innerValue);
            innerMetod();
        }
    }
}
