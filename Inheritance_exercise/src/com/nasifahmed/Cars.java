package com.nasifahmed;

public class Cars extends Vehicle { //Vehicle is Super class
    private int numberofmilesdriven;
    private boolean reachedDestination;

    public Cars(int numberofdoors, String transmission, int numberofmilesdriven, boolean reachedDestination) {
        super(numberofdoors, transmission);
        this.numberofmilesdriven = numberofmilesdriven;
        this.reachedDestination = reachedDestination;
    }

    public Cars() {  // to create an extention class empty constructor i.e public BMW() without any parameter
    }

    /*public Cars(*//*int numberofdoors, String transmission*//*) {
        super(2, "Auto");
    }*/

    public void isMoving(int speed)
    {
        if(speed > 0)
        System.out.println("The car is moving at: " + speed);
        else
            System.out.println("Car is not moving");
    }
}
