package main.java.homework.homework6.model;

import main.java.homework.homework6.service.Type;
import main.java.homework.homework6.service.UserDescription;

/**
 * @apiNote есть возможность использовать дочерний класс на месте родительского
 * (Принцип подстановки Барбары Лисков - >Liskov Substitution Principle)
 */
public class SchoolChild extends User {
    private UserDescription school;
    int childId;
    public SchoolChild(int id, String name, String surname, String patronymic, Integer age, UserDescription value) {
        super(name, surname, patronymic, age, Type.SCHOOLCHILD);
        this.school = value;
        this.childId = id;
    }

    public SchoolChild(String name, String surname, String patronymic, Integer age) {
        super(name, surname, patronymic, age, Type.SCHOOLCHILD);
    }


    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", childId=" + childId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age + '\'' + ", school='" + school + '\'';
    }

    public UserDescription getSchool() {
        return school;
    }

    public void setSchool(UserDescription school) {
        this.school = school;
    }
}
