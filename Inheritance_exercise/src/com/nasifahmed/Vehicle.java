package com.nasifahmed;
//a person gets into a bmw which has two doors and auto gear transmission,
// car drove for a 100 miles, already initialized
// Now the car will drive another 100 miles or user given number of miles
// vehicle has reached its destination or not if 200 miles driven

public class Vehicle {

    private int numberofdoors;
    private String transmission;

    // a constructor without parameter, setting is up will not give any error extending in Cars class
    // when there is a constructor with parameters

    public Vehicle() {
    }

    public Vehicle(int numberofdoors, String transmission) {
        this.numberofdoors = numberofdoors;
        this.transmission = transmission;
    }

}
