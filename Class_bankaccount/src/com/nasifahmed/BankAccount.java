package com.nasifahmed;

public class BankAccount {
    private int account_number;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private int newinteger;

    public void setAccount_number(int account_number)
    {
        this.account_number = account_number;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositMoney)
    {
        this.balance = this.balance + depositMoney;
        System.out.println("Your Balance is: " + this.balance);
    }

    public void withdrawFunds(int withdrawMoney)
    {
        if(this.balance - withdrawMoney < 0)
        {
            System.out.println("Money cannot be withdrawn due to insufficient fund.");
        }
        else
        {
            this.balance = this.balance - withdrawMoney;
            System.out.println("Your current balance is: " + this.balance);
        }

    }
}
