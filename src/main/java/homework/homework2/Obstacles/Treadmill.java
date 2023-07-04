package main.java.homework.homework2.Obstacles;

import java.util.Random;

public class Treadmill {
    private int size;

    public Treadmill(int size) {
        this.size = size;
    }
    public void mesObstacle(){
        System.out.println("Впереди беговая дорожка");
    }

    public Treadmill() {
        this.size = new Random().nextInt(1, 200);
    }

    public int getSize() {
        return size;
    }
}
