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
        int count = 0;
        for (Object participant : participants) {
            count = 0;
            for (Object action : actions) {
                count += 1;
                if (action instanceof Wall && participant instanceof Human){
                    System.out.println(((Human) participant).getHumanName() + " проходит испытание\n");
                    if(((Human) participant).getHeight() < ((Wall) action).getHeight()){
                        ((Wall) action).mesObstacle();
                        ((Human) participant).jump();
                        ((Human) participant).stop();
                        break;
                    } else if (((Human) participant).getHeight() >= ((Wall) action).getHeight()) {
                        ((Wall) action).mesObstacle();
                        ((Human) participant).jump();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((Human) participant).getHumanName());
                    }
                }
                if (action instanceof Treadmill && participant instanceof Human){
                    System.out.println(((Human) participant).getHumanName() + " проходит испытание\n");
                    if(((Human) participant).getRun() < ((Treadmill) action).getSize()){
                        ((Treadmill) action).mesObstacle();
                        ((Human) participant).run();
                        ((Human) participant).stop();
                        break;
                    } else if (((Human) participant).getRun() >= ((Treadmill) action).getSize()) {
                        ((Treadmill) action).mesObstacle();
                        ((Human) participant).run();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((Human) participant).getHumanName());
                    }
                }
                if (action instanceof Wall && participant instanceof Cat){
                    System.out.println(((Cat) participant).getCatName() + " проходит испытание\n");
                    if(((Cat) participant).getHeight() < ((Wall) action).getHeight()){
                        ((Wall) action).mesObstacle();
                        ((Cat) participant).jump();
                        ((Cat) participant).stop();
                        break;
                    } else if (((Cat) participant).getHeight() >= ((Wall) action).getHeight()) {
                        ((Wall) action).mesObstacle();
                        ((Cat) participant).jump();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((Cat) participant).getCatName());
                    }
                }
                if (action instanceof Treadmill && participant instanceof Cat){
                    System.out.println(((Cat) participant).getCatName() + " проходит испытание\n");
                    if(((Cat) participant).getRun() < ((Treadmill) action).getSize()){
                        ((Treadmill) action).mesObstacle();
                        ((Cat) participant).run();
                        ((Cat) participant).stop();
                        break;
                    } else if (((Cat) participant).getRun() >= ((Treadmill) action).getSize()) {
                        ((Treadmill) action).mesObstacle();
                        ((Cat) participant).run();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((Cat) participant).getCatName());
                    }
                }
                if (action instanceof Wall && participant instanceof Robot){
                    System.out.println(((Robot) participant).getRobotName() + " проходит испытание\n");
                    if(((Robot) participant).getHeight() < ((Wall) action).getHeight()){
                        ((Wall) action).mesObstacle();
                        ((Robot) participant).jump();
                        ((Robot) participant).stop();
                        break;
                    } else if (((Robot) participant).getHeight() >= ((Wall) action).getHeight()) {
                        ((Wall) action).mesObstacle();
                        ((Robot) participant).jump();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((Robot) participant).getRobotName());
                    }
                }
                if (action instanceof Treadmill && participant instanceof Robot){
                    System.out.println(((Robot) participant).getRobotName() + " проходит испытание\n");
                    if(((Robot) participant).getRun() < ((Treadmill) action).getSize()){
                        ((Treadmill) action).mesObstacle();
                        ((Robot) participant).run();
                        ((Robot) participant).stop();
                        break;
                    } else if (((Robot) participant).getRun() >= ((Treadmill) action).getSize()) {
                        ((Treadmill) action).mesObstacle();
                        ((Robot) participant).run();
                        if (count == actions.length) System.out.printf("Участник %s прошел все испытания\n\n", ((Robot) participant).getRobotName());
                    }
                }
            }
        }
    }
}
