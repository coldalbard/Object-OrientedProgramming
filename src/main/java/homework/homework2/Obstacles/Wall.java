package main.java.homework.homework2.Obstacles;

import java.util.Random;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public Wall() {
        this.height = new Random().nextInt(100, 1000);
    }
    public void mesObstacle(){
        System.out.println("Впереди стена");
    }

    public int getHeight() {
        return height;
    }
}
