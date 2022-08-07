package com.nasifahmed;

public class Animal {
    private String name;
    private int weight;

    //constructor for class Animal
    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat()
    {
        // overriding this will call the method in the Dog class first and then this.
        // i. e. while overriding this one will be executed at the end.
        System.out.println("Calling eat override function.");
    }

    public void move(int speed)
    {
        System.out.println("Animal.move() called." + speed);
    }
}
