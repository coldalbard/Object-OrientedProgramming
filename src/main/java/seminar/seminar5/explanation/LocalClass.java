package main.java.seminar.seminar5.explanation;

public class LocalClass {
    public static void main(String[] args) {
        class Local{ // пример создания локального класса, нужен в определенном месте программы(управляющие методы и т.п)
            int local;

            public Local(int local) {
                this.local = local;
            }

            public Local() {
            }

            @Override
            public String toString() {
                return "Local{" +
                        "local=" + local +
                        '}';
            }
        }
        Local local = new Local(3);
        System.out.println("local = " + local);
    }
}
