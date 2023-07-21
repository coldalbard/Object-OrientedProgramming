package main.java.homework.homework6.model;

import main.java.homework.homework6.service.Type;
import main.java.homework.homework6.service.UserDescription;

/**
 * @apiNote есть возможность использовать дочерний класс на месте родительского
 * (Принцип подстановки Барбары Лисков - >Liskov Substitution Principle)
 */
public class Worker extends User{
    private UserDescription work;
    int workerId;
    public Worker(int id, String name, String surname, String patronymic, Integer age, UserDescription value) {
        super(name, surname, patronymic, age, Type.WORKER);
        this.work = value;
        this.workerId = id;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", workerId=" + workerId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age + '\'' + ", work='" + work + '\'';
    }

    public UserDescription getWork() {
        return work;
    }

    public void setWork(UserDescription work) {
        this.work = work;
    }
}
