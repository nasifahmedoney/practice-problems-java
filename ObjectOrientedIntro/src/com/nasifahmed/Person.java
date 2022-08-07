package com.nasifahmed;

public class Person {

    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;

        String nameCheck = this.name.toLowerCase();
        if(nameCheck.equals("nasif"))
        {
            this.age = 28;
        }
    }

    public String getName()
    {
        return ( this.name + " is " + this.age + " Years Old." );
    }

    public void displayNameandAge(String Name)
    {
        setName(Name);
        System.out.println(getName());
    }
}
