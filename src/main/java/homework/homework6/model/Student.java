package main.java.homework.homework6.model;

import main.java.homework.homework6.service.Type;
import main.java.homework.homework6.service.UserDescription;

/**
 * @apiNote есть возможность использовать дочерний класс на месте родительского
 * (Принцип подстановки Барбары Лисков - >Liskov Substitution Principle)
 */
public class Student extends User{
    private UserDescription studentGroup;
    int studentId;
    public Student(int id, String name, String surname, String patronymic, Integer age, UserDescription studentGroup) {
        super(name, surname, patronymic, age, Type.STUDENT);
        this.studentId = id;
        this.studentGroup = studentGroup;
    }

    public Student(String name, String surname, String patronymic, Integer age) {
        super(name, surname, patronymic, age, Type.STUDENT);
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age + '\'' +
                ", studentGroup='" + studentGroup + '\'';
    }

    public UserDescription getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(UserDescription studentGroup) {
        this.studentGroup = studentGroup;
    }
}
