package main.java.homework.homework5.task2.view;

import main.java.homework.homework5.task2.model.Contact;
import main.java.homework.homework5.task2.model.FileType;

import java.util.Locale;
import java.util.Scanner;

public class View {
    private Scanner sc = new Scanner(System.in);
    public int mainPage(){
        System.out.println("Меню:\n1. Просмотр\n2. Найти контакт\n3. Добавить\n4. Изменить\n5. Удалить\n6. Импорт\n7. Экспорт\n8. Выход");
        System.out.printf("Выберите действие: ");
        return sc.nextInt();
    }
    public Contact addContact(){
        sc.nextLine();
        System.out.printf("Введите имя: ");
        String name = sc.nextLine();
        System.out.printf("Введите фамилию: ");
        String surname = sc.nextLine();
        System.out.printf("Введите отчество: ");
        String patronomyc = sc.nextLine();
        System.out.printf("Введите номер: ");
        String phone = sc.nextLine();
        System.out.printf("Введите описание: ");
        String op = sc.nextLine();
        Contact contact = new Contact(name, surname, patronomyc, phone, op);
        return contact;
    }
    public String deleteContact(){
        sc.nextLine();
        System.out.printf("Введите номер телефона контакта, который хотите удалить: ");
        return sc.nextLine();
    }
    public String searchContact(){
        sc.nextLine();
        System.out.printf("Введите номер телефона контакта, который хотите найти: ");
        return sc.nextLine();
    }
    public Contact changeContact(){
        System.out.printf("Введите новое имя: ");
        String name = sc.nextLine();
        System.out.printf("Введите новую фамилию: ");
        String surname = sc.nextLine();
        System.out.printf("Введите новое отчество: ");
        String patronomyc = sc.nextLine();
        System.out.printf("Введите новый номер: ");
        String phone = sc.nextLine();
        System.out.printf("Введите новое описание: ");
        String op = sc.nextLine();
        Contact contact = new Contact(name, surname, patronomyc, phone, op);
        return contact;
    }
    public String searchOldPhone(){
        sc.nextLine();
        System.out.printf("Введите номер телефона контакта, который хотите изменить: ");
        return sc.nextLine();
    }

    public String fromWhere(){
        sc.nextLine();
        System.out.printf("Введите путь к исходномк файлу: ");
        return sc.nextLine();
    }
    public String where(){
        System.out.printf("Введите путь к конечному файлу: ");
        return sc.nextLine();
    }

    public FileType formatPhonebook(){
        FileType fileType = FileType.TXT;
        System.out.println("Введите формат в который хотите импортировать или экспортировать(JSON или TXT) ");
        String string;
        while (true){
            string = sc.nextLine().toUpperCase(Locale.ROOT);
            if (string.equals("JSON")) {
                fileType = FileType.JSON;
                return fileType;
            }
            if (string.equals("TXT")) {
                fileType = FileType.TXT;
                return fileType;
            }
            System.out.println("Неккоректный ввод, попробуйте заново(");
        }
    }
}
