package main.java.seminar.seminar1.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreditAccount ca = new CreditAccount(12, "Ivan", 1200.0, 20.0);
        SavingAccount sa = new SavingAccount(12, "Ivan", 1000.0, 10.0);
        System.out.println(ca.getBalance());
        ca.calculateInterest();
        System.out.println(ca.getBalance());
        System.out.println("sa.getBalance() = " + sa.getBalance());
        sa.addInterest();
        System.out.println("sa.getBalance() = " + sa.getBalance());
    }
}
