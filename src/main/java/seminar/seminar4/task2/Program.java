package main.java.seminar.seminar4.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        BoxWithNumber<Float> numbBox1 = new BoxWithNumber(5, 1, 2, 34, 5, 6);
        BoxWithNumber<Double> numbBox2 = new BoxWithNumber(6, 8, 1, 4, 45, 26);
        System.out.println("numbBox.average() = " + numbBox1.average());
        System.out.println("numbBox2.average() = " + numbBox2.average());
        System.out.println("numbBox1.compareAverage(numbBox2) = " + numbBox1.compareAverage(numbBox2));
    }
}
