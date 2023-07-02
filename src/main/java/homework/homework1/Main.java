package main.java.homework.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product pd1 = new Product("Яблоки", 25, 8);
        Product pd2 = new Product("Черешня", 80, 7);
        Product pd3 = new Product("Сникерс", 75, 8);
        Product pd5 = new Product("Баунти", 80, 10);
        Product pd4 = new Product("Банан", 12, 10);

        Product[] products = {pd1, pd2, pd4};
        Product[] products2 = {pd3, pd5};
        Category ct1 = new Category("Фрукты", products);
        Category ct2 = new Category("Снэки", products2);
        Category[] categories = {ct1, ct2};

        Shop shop = new Shop("Лента", categories);

        User user1 = new User("login", "password");
        User user2 = new User("Log", "Pas");
        User[] users = {user1, user2};

        System.out.printf("Введите ваш логин: ");
        String login = sc.nextLine();
        System.out.printf("Введите ваш пароль: ");
        String password = sc.nextLine();
        int sUser = 0;
        // находим есть ли человек в списке пользователей и потом впускаем
        if(user1.searchUser(users, login, password) <= users.length && user1.searchUser(users, login, password) >= 0) {
            // присваем переменной индекс пользователя
            sUser = user1.searchUser(users, login, password);

            System.out.println("Приветствуем в нашем магазине");
            ArrayList<String> buy = new ArrayList<>();
            String tovar = "";
            boolean flag = false;
            while (!flag) {
                System.out.println("\n Выберите действие: \n1.Добавить в корзину\n2.Удалить из корзины\n3.Покупка\n4.Просмотреть корзину\n5.Выход");
                int action = sc.nextInt();
                switch (action) {
                    case (1):
                        System.out.printf(shop + "\nВведите название товара который хотите добавить: ");
                        sc.nextLine();
                        tovar = sc.nextLine();
                        users[sUser].getBasket().add(categories, tovar);
                        shop.delete();
                        break;
                    case (2):
                        System.out.printf("Ваша корзина: \n" + users[sUser].getBasket() + "\nВведите название товара который хотите удалить: ");
                        sc.nextLine();
                        tovar = sc.nextLine();
                        users[sUser].getBasket().delete(categories, tovar);
                        shop.add();
                        break;
                    case (3):
                        System.out.println("Товары куплены");
                        users[sUser].setBasket(new Basket());
                        break;
                    case (4):
                        System.out.println(users[sUser].getBasket());
                        break;
                    case (5):
                        System.out.println("Спасибо что посетили наш магазин, всего доброго)");
                        flag = true;
                        break;
                    default:
                        System.out.println("Неправильно выбран пункт меню");
                }
            }
        } else System.out.println("Неверно введены данные, повторите попытку");
    }
}
