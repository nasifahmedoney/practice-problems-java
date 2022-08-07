package com.nasifahmed;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String customerName, double transactionAmount) {
        this.customerName = customerName;
        addTransactions(transactionAmount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions(double transactionAmount) {
        this.transactions.add(transactionAmount);
    }

    public void displayTransactions(ArrayList<Double> transactionList)
    {
        for(Double amount: transactionList)
        {
            System.out.println(amount);
        }
    }
}
