package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(10000);

        account.depositFunds(10000);

        account.withdrawFunds(5000);

        account.withdrawFunds(25000);

    }
}
