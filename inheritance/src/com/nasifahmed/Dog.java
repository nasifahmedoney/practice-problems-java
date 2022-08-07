package com.nasifahmed;

public class Dog extends Animal { // Dog extends class animal

    private int legs;
    private boolean tail;

    public Dog(String name, int weight, int legs, boolean tail) {
        super(name, 20); // initializing Animal Class fields
        this.legs = legs;// initializing Animal Class + Dog Class fields
        this.tail = tail;
    }

    private void run()
    {
        System.out.println("It runs");
    }

    @Override
    public void eat() {
        // Overriding the eat() method from the Animal class.
        // Dog.eat() will execute this first then Animal.eat()
        run();
        System.out.println("for food.");
        super.eat();
    }

    public void walk()
    {
        move(5);
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }
}
