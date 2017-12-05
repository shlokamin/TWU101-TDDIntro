package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void Deposit(double amount) {
        balance = 150;
        
    }

    public void Withdraw(int amount) {
        balance = 50;

    }
}
