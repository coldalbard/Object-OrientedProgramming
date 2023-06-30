package main.java.seminar.seminar1.task2;

public class CreditAccount extends Account{
    private Double percent;
    public CreditAccount(Integer accNumber, String owner, Double balance, Double percent) {
        super(accNumber, owner, balance);
        this.percent = percent;
    }
    public CreditAccount() {}
    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }
    protected void calculateInterest(){
        Double dB = getBalance() * percent / 100;
        withDraw(dB);
    }

}
