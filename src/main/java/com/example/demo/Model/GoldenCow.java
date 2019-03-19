package com.example.demo.Model;

public class GoldenCow {

    private String name;
    private int account;
    private double balance;

    public GoldenCow(String name, int account, double balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "GoldenCow{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", balance=" + balance +
                '}';
    }
}
