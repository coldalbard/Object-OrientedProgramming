package main.java.seminar.seminar5.service;

import main.java.seminar.seminar5.dataModel.Student;
import main.java.seminar.seminar5.dataModel.Type;
import main.java.seminar.seminar5.dataModel.User;

import java.util.List;

public interface DataService {
    void create(Type type, String name, String surname, String patronymic);
    List<User> read();
    public List<User> readOnlyStudent();
}
