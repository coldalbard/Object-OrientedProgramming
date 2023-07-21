package main.java.homework.homework6.service;

import main.java.homework.homework6.model.SchoolChild;
import main.java.homework.homework6.model.Student;
import main.java.homework.homework6.model.User;
import main.java.homework.homework6.model.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * @apiNote Реализует интерфейсы которые нужны клиенту (Принцип разделения интерфейса -> Interface Segregation Principle)
 */
public class UserService implements Action{
    List<User> userList = new ArrayList<>();

    public UserService(List<User> userList) {
        this.userList = userList;
    }

    public UserService() {
    }

    @Override
    public void create(Type type, String name, String surname, String patronymic, Integer age, UserDescription value) {
        int id = getId(type);
        if (Type.STUDENT == type){
            userList.add(new Student(id, name, surname, patronymic, age, value));
        }
        if (Type.WORKER == type){
            userList.add(new Worker(id, name, surname, patronymic, age, value));
        }
        if (Type.SCHOOLCHILD == type){
            userList.add(new SchoolChild(id, name, surname, patronymic, age, value));
        }
    }

    @Override
    public void delete(User user) {
        if (!isUsed(user)) {
            this.userList.remove(user);
            System.out.println("Сущность удалена из спика");
        }
        else {
            System.out.println("Такой сущности нет в списках(");
        }
    }

    @Override
    public void find(User user) {
        for (User us : this.userList) {
            if (us.equals(user)){
                System.out.println(us);
            }
        }
    }

    @Override
    public void update(User user) {
        boolean flag = false;
        for (User us : this.userList) {
            if (us.equals(user)){
                flag = true;
            }
        }
        if (flag) System.out.println("Сущность изменена");
        else System.out.println("Такой сущности не существует");
    }

    @Override
    public boolean isUsed(User user) {
        for (User us : this.userList) {
            if (us.equals(user)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int getId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        boolean isWorker = Type.WORKER == type;
        boolean isSchoolChild = Type.SCHOOLCHILD == type;
        for (User user: userList) {
            if (user instanceof Worker && isWorker)lastId++;
            if (user instanceof Student && isStudent) lastId++;
            if (user instanceof SchoolChild && isSchoolChild) lastId++;
        }
        return ++lastId;
    }

    @Override
    public void printListUsers() {
        for (User user: this.userList) {
            System.out.println(user);
        }
    }
}
