package main.java.homework.homework6.controller;


import main.java.homework.homework6.model.SchoolChild;
import main.java.homework.homework6.model.Student;
import main.java.homework.homework6.model.User;
import main.java.homework.homework6.model.Worker;
import main.java.homework.homework6.service.UserDescription;
import main.java.homework.homework6.service.UserService;
import main.java.homework.homework6.view.UserView;

public class Controller {
    private final UserService service = new UserService();
    private final UserView usv = new UserView();

    public void print(){
        service.printListUsers();
    }
    public void addUser(){
        User user = usv.addUser();
        UserDescription us = new UserDescription("");
        if (user instanceof Student) us = ((Student) user).getStudentGroup();
        if (user instanceof Worker) us = ((Worker) user).getWork();
        if (user instanceof SchoolChild) us = ((SchoolChild) user).getSchool();
        if(service.isUsed(user)) System.out.println("Такая сущность уже существует( ");
        else service.create(user.getType(), user.getName(), user.getSurname(), user.getPatronymic(), user.getAge(), us);
    }

    public void deleteUser(){
        User user = usv.deleteUser();
        service.delete(user);
    }
    public void updataUser(){
        User user = usv.updateUser();
        service.update(user);
    }
    public void findUser(){
        User user = usv.findUser();
        service.find(user);
    }

    public UserService getService() {
        return service;
    }

    public UserView getUsv() {
        return usv;
    }
}
