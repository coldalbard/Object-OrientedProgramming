package main.java.homework.homework6.service;

/**
 * @apiNote есть возможность добавлять новые свойства (открыт для расширения, но закрыт для изменения -> Open-Closed Principle)
 */
public class UserDescription implements Description{
    String description;

    public UserDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
