package main.java.seminar.seminar4.task1;

public class Program {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        Integer sum = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj()); // нужно кастить
        System.out.println(sum);
        intBox1.setObj("20");
        Integer sum2 = 0;
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer){
            sum2 = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj());
            System.out.println("sum = " + sum);
        }
        System.out.println("sum2 = " + sum2);
        GenBox<Integer> gen1 = new GenBox(10);
        GenBox<Integer> gen2 = new GenBox(20);
        Integer sumGenBox = gen1.getObj() + gen2.getObj(); // не нужно кастить
        System.out.println("sumGenBox = " + sumGenBox);
//        gen2.setObj("10"); // несовпадение типов, ошибка компиляции

    }
}
