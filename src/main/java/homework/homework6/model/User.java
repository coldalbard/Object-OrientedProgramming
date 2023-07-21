package main.java.homework.homework6.model;

import main.java.homework.homework6.service.Type;
import main.java.homework.homework6.service.UserDescription;

/**
 * @apiNote class User отвечает только за хранение информации о данных о человеке.
 * (единственная ответственность -> Single Responsibility Principle)
 */
public abstract class User {
    protected String name;
    protected String surname;
    protected String patronymic;
    protected Integer age;
    protected Type type;

    public User(String name, String surname, String patronymic, Integer age, Type type) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return type + ", " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age='" + age + '\'';
    }

    public Type getType() {
        return type;
    }
}
