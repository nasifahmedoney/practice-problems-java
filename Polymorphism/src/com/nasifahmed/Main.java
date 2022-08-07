package com.nasifahmed;

class Car
{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine()
    {
        return "The engine has started";
    }

    public String accelerate()
    {
        return name + " is accelerating";
    }

    public String brake()
    {
        return "The car has stopped.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}


class Audi extends Car
{
    public Audi() {
        super("Audi", 4);
    }

    @Override
    public String startEngine() {
        return "Audi car engine has started.";
    }
}

class BMW extends Car
{
    public BMW() {
        super("BMW", 2);
    }

    @Override
    public String accelerate() {
        return super.accelerate() + "It has " + super.getCylinders() + "cylinders.";
    }

}

class Honda extends Car
{
    public Honda() {
        super("Honda", 3);
    }

    @Override
    public String brake() {
        return "Your car has stopped.";
    }
}


public class Main {

    public static void main(String[] args) {
        //display all methods of car class for each extention
        Car car = chooseVehicle();
        System.out.println("Car name: " + car.getName() + '\n' +
                            car.startEngine() + '\n' +
                            "Number of Cylinders: " + car.getCylinders() + '\n' +
                            "Pushing the brake: " + car.brake());
    }

    //choose the vehicle
    public static Car chooseVehicle()
    {
        int car = (int) ((Math.random() * 3) + 1);
        switch(car)
        {
            case 1: return new Audi();//Valid because of extention from Car
            case 2: return new BMW();//Valid because of extention from Car
            case 3: return new Honda();//Valid because of extention from Car
        }
        return null;

        /*//Extentions of Car class
        BMW bmw = new BMW();
        Audi audi = new Audi();
        Honda honda = new Honda();

        int car = (int) ((Math.random() * 2) + 1);
        switch(car)
        {
            case 1: return bmw;
            case 2: return audi;
            case 3: return honda;
        }
        return null;
        */
    }

}
