package main.java.seminar.seminar1.task2;

public class Account {
    private Integer accNumber;
    private String owner;
    private Double balance;
    public Account(Integer accNumber, String owner, Double balance) {
        this.accNumber = accNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public Account() {}
    public Integer getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    protected Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    protected void deposit(double amount){
        balance += amount;
    }
    protected void withDraw(double amount){
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Недостатосно средств, ваш баланс: " + balance);
        }
    }
}
