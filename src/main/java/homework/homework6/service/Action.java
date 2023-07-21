package main.java.homework.homework6.service;
import main.java.homework.homework6.model.User;

/**
 * @apiNote  (Принцип разделения интерфейса -> Interface Segregation Principle)
 */
public interface Action {
    void create(Type type, String name, String surname, String patronymic, Integer age, UserDescription value);
    void delete(User user);
    void find(User user);
    void update(User user);
    boolean isUsed(User user);
    int getId(Type type);
    void printListUsers();
}
