package main.java.homework.homework6.view;

import main.java.homework.homework6.model.SchoolChild;
import main.java.homework.homework6.model.Student;
import main.java.homework.homework6.model.User;
import main.java.homework.homework6.model.Worker;
import main.java.homework.homework6.service.UserDescription;

import java.util.Scanner;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    public int mainPage(){
        System.out.println("Меню:\n1. Просмотр\n2. Поиск\n3. Добавить\n4. Изменить\n5. Удалить\n6. Выход");
        System.out.printf("Выберите действие: ");
        return sc.nextInt();
    }
    public User addUser(){
        sc.nextLine();
        System.out.printf("Введите имя: ");
        String name = sc.nextLine();
        System.out.printf("Введите фамилию: ");
        String surname = sc.nextLine();
        System.out.printf("Введите отчество: ");
        String patronomyc = sc.nextLine();
        System.out.printf("Введите возраст: ");
        int age = 0;
        try {
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Убедитесь, что правильно вводите данные)");
            return addUser();
        }
        sc.nextLine();
        System.out.printf("Введите тип сущности (STUDENT, WORKER, SCHOOLCHILD): ");
        String str = sc.nextLine().toUpperCase();
        User user;
        if (str.equals("STUDENT")){
            System.out.printf("Введите название группы: ");
            String op = sc.nextLine();
            user = new Student(0, name, surname, patronomyc, age, new UserDescription(op));
        } else if (str.equals("WORKER")) {
            System.out.printf("Введите наименование работы: ");
            String op = sc.nextLine();
            user = new Worker(0, name, surname, patronomyc, age, new UserDescription(op));
        } else if (str.equals("SCHOOLCHILD")) {
            System.out.printf("Введите наименование школы: ");
            String op = sc.nextLine();
            user = new SchoolChild(0, name, surname, patronomyc, age, new UserDescription(op));
        } else {
            System.out.println("Неправильно введены данные(");
            return addUser();
        }
        return user;
    }
    public User updateUser(){
        sc.nextLine();
        System.out.printf("Введите старое имя: ");
        String name = sc.nextLine();
        System.out.printf("Введите старую фамилию: ");
        String surname = sc.nextLine();
        System.out.printf("Введите старое отчество: ");
        String patronomyc = sc.nextLine();
        System.out.printf("Введите старый возраст: ");
        int age = 0;
        try {
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Убедитесь, что правильно вводите данные)");
            return updateUser();
        }
        sc.nextLine();
        System.out.printf("Введите старый тип сущности (STUDENT, WORKER, SCHOOLCHILD): ");
        String str = sc.nextLine().toUpperCase();
        User user;
        if (str.equals("STUDENT")){
            System.out.printf("Введите старое название группы: ");
            String op = sc.nextLine();
            user = new Student(0, name, surname, patronomyc, age, new UserDescription(op));
        } else if (str.equals("WORKER")) {
            System.out.printf("Введите старое наименование работы: ");
            String op = sc.nextLine();
            user = new Worker(0, name, surname, patronomyc, age, new UserDescription(op));
        } else if (str.equals("SCHOOLCHILD")) {
            System.out.printf("Введите старое наименование школы: ");
            String op = sc.nextLine();
            user = new SchoolChild(0, name, surname, patronomyc, age, new UserDescription(op));
        } else {
            System.out.println("Неправильно введены данные(");
            return updateUser();
        }
        return user;
    }
    public User deleteUser(){
        System.out.println("Ввведите данные сущности которые хотите удалить   ");
        User user = addUser();
        return user;
    }
    public User findUser(){
        System.out.println("Ввведите данные сущности которые хотите найти   ");
        User user = addUser();
        return user;
    }

}
