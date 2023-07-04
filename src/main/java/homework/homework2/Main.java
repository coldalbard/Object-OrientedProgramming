package main.java.homework.homework2;

import main.java.homework.homework2.Obstacles.*;

public class Main {
    public static void main(String[] args) {
        Object[] participants = {
                new Robot("terminator", 150, 800),
                new Human("chel1", 40, 200),
                new Cat("barsik", 10, 500)
        };
        Object[] actions = {
                new Wall(),
                new Treadmill()
        };
        for (Object participant : participants) {
            int count = 0;
            for (Object action : actions) {
                count += 1;
                if (participant instanceof LiveBeing && action instanceof Wall) {
                    System.out.println(((LiveBeing) participant).getName() + " проходит испытание\n");
                    if (((LiveBeing) participant).getHeight() < ((Wall) action).getHeight()) {
                        ((Wall) action).mesObstacle();
                        ((LiveBeing) participant).jump();
                        ((LiveBeing) participant).stop();
                        break;
                    } else {
                        ((Wall) action).mesObstacle();
                        ((LiveBeing) participant).jump();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((LiveBeing) participant).getName());
                    }
                }
                else if (participant instanceof LiveBeing && action instanceof Treadmill) {
                    System.out.println(((LiveBeing) participant).getName() + " проходит испытание\n");
                    if (((LiveBeing) participant).getHeight() < ((Treadmill) action).getSize()) {
                        ((Treadmill) action).mesObstacle();
                        ((LiveBeing) participant).run();
                        ((LiveBeing) participant).stop();
                        break;
                    } else {
                        ((Treadmill) action).mesObstacle();
                        ((LiveBeing) participant).run();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((LiveBeing) participant).getName());
                    }
                }
                if (participant instanceof Robot && action instanceof Wall){
                    System.out.println(((Robot) participant).getRobotName() + " робот проходит испытание\n");
                    if (((Robot) participant).getHeight() < ((Wall) action).getHeight()) {
                        ((Wall) action).mesObstacle();
                        ((Robot) participant).jump();
                        ((Robot) participant).stop();
                        break;
                    } else {
                        ((Wall) action).mesObstacle();
                        ((Robot) participant).jump();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((Robot) participant).getRobotName());
                    }
                } else if (participant instanceof Robot && action instanceof Treadmill) {
                    System.out.println(((Robot) participant).getRobotName() + " робот проходит испытание\n");
                    if (((Robot) participant).getHeight() < ((Treadmill) action).getSize()) {
                        ((Treadmill) action).mesObstacle();
                        ((Robot) participant).run();
                        ((Robot) participant).stop();
                        break;
                    } else {
                        ((Treadmill) action).mesObstacle();
                        ((Robot) participant).run();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((Robot) participant).getRobotName());
                    }
                }
            }
        }
    }
}