package com.nasifahmed;

class Phones
{
    int number;

    Phones()
    {
        this.number = 123456789;
    }

    void withUser()
    {
        if(number == 123456789)
        {
            System.out.println("User name is abcd and number is: " + number);
        }
    }
}

class Phoneset extends Phones
{
    public Phoneset() {
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
