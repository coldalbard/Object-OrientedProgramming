package main.java.homework.homework1;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }
    public User() {}
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Basket getBasket() {
        return basket;
    }
    public void setBasket(Basket basket) {
        this.basket = basket;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }

    /**@ApiNote Функция для того, чтобы узнать есть ли у нас пользователь
     * @param users список пользователей
     * @param login логин
     * @param password пароль
     * @return userNumber индекс в списке
     */
    public int searchUser(User[] users, String login, String password){
        int userNumber = -1;
        for (int i = 0; i < users.length; i++) {
            if(users[i].getLogin().contains(login) && users[i].getPassword().contains(password)){
                userNumber = i + 1;
                break;
            }
        }
        return userNumber;
    }
}
