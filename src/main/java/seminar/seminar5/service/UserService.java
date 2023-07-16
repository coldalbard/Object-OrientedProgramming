package main.java.seminar.seminar5.service;

import main.java.seminar.seminar5.dataModel.Student;
import main.java.seminar.seminar5.dataModel.Teacher;
import main.java.seminar.seminar5.dataModel.Type;
import main.java.seminar.seminar5.dataModel.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    private List<User> userList = new ArrayList<>();

    @Override
    public void create(Type type, String name, String surname, String patronymic) {
        int id = getFreeId(type);
        if (Type.STUDENT == type){
            userList.add(new Student(id, name, surname, patronymic));
        }
        if (Type.TEACHER == type){
            userList.add(new Teacher(id, name, surname, patronymic));
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user: userList) {
            if (user instanceof Teacher && !isStudent)lastId++;
            if (user instanceof Student && isStudent) lastId++;
        }
        return ++lastId;
    }

    @Override
    public List<User> read() {
        return this.userList;
    }

    @Override
    public List<User> readOnlyStudent() {
        List<User> studentList = new ArrayList<>();
        for (User user: this.userList) {
            if (user instanceof Student) studentList.add(user);
        }
        return studentList;
    }
}
