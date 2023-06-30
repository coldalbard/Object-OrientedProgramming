package main.java.seminar.seminar1.task2;

public class SavingAccount extends Account{
    private Double percent;

    public SavingAccount(Integer accNumber, String owner, Double balance, Double percent) {
        super(accNumber, owner, balance);
        this.percent = percent;
    }

    public SavingAccount() {}

    protected void addInterest(){
        Double dbProc = getBalance() * percent / 100;
        deposit(dbProc);
    }
}
