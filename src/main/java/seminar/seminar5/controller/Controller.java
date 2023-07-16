package main.java.seminar.seminar5.controller;

import main.java.seminar.seminar5.dataModel.Student;
import main.java.seminar.seminar5.dataModel.Type;
import main.java.seminar.seminar5.service.UserService;
import main.java.seminar.seminar5.view.StudentView;
import main.java.seminar.seminar5.dataModel.User;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname, String patronymic){
        service.create(Type.STUDENT, name, surname, patronymic);
    }
    public void createTeacher(String name, String surname, String patronymic){
        service.create(Type.TEACHER, name, surname, patronymic);
    }
    public void setAllStudent(){
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            studentView.printConsole((Student) user);
        }
    }
}
