package main.java.lesson.lesson1.ex3;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);

        System.out.println(a);
        Point2D b = new Point2D(0);
        System.out.println(b);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
