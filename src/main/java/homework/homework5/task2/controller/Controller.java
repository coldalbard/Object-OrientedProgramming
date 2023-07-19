package main.java.homework.homework5.task2.controller;

import main.java.homework.homework5.task2.model.*;
import main.java.homework.homework5.task2.service.Phonebook;
import main.java.homework.homework5.task2.view.View;

public class Controller {
    private final Phonebook phonebook = new Phonebook();
    private final View view = new View();

    public void showPhonebook(){
        phonebook.printPhonebook();
    }
    public void findContact(){
        String search = view.searchContact();
        Contact contact = phonebook.find(search);
        if (contact == null) System.out.println("Такой контакт не найден(");
        else System.out.println("Искомый контакт: " + contact);
    }
    public void deleteContact(){
        String phone = view.deleteContact();
        if(phonebook.delete(phone)) System.out.println("Контакт удален");
        else System.out.println("Неправильно введен номер");
    }

    public void addContact(){
        Contact contact = view.addContact();
        if (phonebook.add(contact)) System.out.println("Контакт добавлен!");
        else System.out.println("Такой контакт уже существует(");
    }

    public void changeContact(){
        String phone = view.searchOldPhone();
        Contact contact = view.changeContact();
        if (phonebook.change(phone, contact)) System.out.println("Контакт изминен!");
        else System.out.println("Поиск по номеру не прошел, введены некорректные данные");
    }
    public void importPhonebook(){
//        FileType type, String locationPath, String departurePath
        String locationPath = view.fromWhere();
        String departurePath = view.where();
        FileType fileType = view.formatPhonebook();
        Format file = new TxtFormat(fileType);

        String substring1 = locationPath.substring(locationPath.length() - 4, locationPath.length());
        String substring2 = locationPath.substring(locationPath.length() - 5, locationPath.length());
        if (fileType == FileType.JSON && substring1.equals(".txt")){
            file = new TxtFormat(fileType, locationPath);
        } else if (fileType == FileType.TXT && substring1.equals(".txt")) {
            file = new TxtFormat(fileType, locationPath);
        } else if (fileType == FileType.TXT && substring2.equals(".json")){
            file = new JsonFormat(fileType, locationPath);
        } else if (fileType == FileType.JSON && substring2.equals(".json")) {
            file = new JsonFormat(fileType, locationPath);
        } else System.out.println("Неккоректные данные");


        if (file.importDate(fileType, locationPath, departurePath)) System.out.println("Контакты успешно импортированы");
        else System.out.println();
    }

    public void exportPhonebook(){
//        FileType type, String locationPath, String departurePath
        String locationPath = view.fromWhere();
        String departurePath = view.where();
        FileType fileType = view.formatPhonebook();
        Format file = null;

        String substring1 = locationPath.substring(locationPath.length() - 4, locationPath.length());
        String substring2 = locationPath.substring(locationPath.length() - 5, locationPath.length());
        if (fileType == FileType.JSON && substring1.equals(".txt")){
            file = new TxtFormat(fileType, locationPath);
        } else if (fileType == FileType.TXT && substring1.equals(".txt")) {
            file = new TxtFormat(fileType, locationPath);
        } else if (fileType == FileType.TXT && substring2.equals(".json")){
            file = new JsonFormat(fileType, locationPath);
        } else if (fileType == FileType.JSON && substring2.equals(".json")) {
            file = new JsonFormat(fileType, locationPath);
        } else System.out.println("Неккоректные данные");

        if (file.exportDate(fileType, locationPath, departurePath)) System.out.println("Контакты успешно экспортированы");
        else System.out.println();
    }

    public Phonebook getPhonebook() {
        return phonebook;
    }

    public View getView() {
        return view;
    }
}
