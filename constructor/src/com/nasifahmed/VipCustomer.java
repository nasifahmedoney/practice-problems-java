package com.nasifahmed;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer()
    {
        this("nasif", 12345, "nasif@nasif.com");
        System.out.println("Constructor with default values");
    }
    public VipCustomer(String name, double creditLimit)
    {
        this(name,creditLimit, "nasif.nasif@nasif.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
