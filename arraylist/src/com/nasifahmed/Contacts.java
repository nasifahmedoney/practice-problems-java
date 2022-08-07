package com.nasifahmed;

public class Contacts extends MobilePhone {
    private String name;
    private String number;

    public Contacts() {
    }

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
