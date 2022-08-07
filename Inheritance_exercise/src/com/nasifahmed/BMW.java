package com.nasifahmed;

public class BMW extends Cars { //Cars is SUper class
    private boolean isMoving;

    public BMW(int numberofdoors, String transmission, int numberofmilesdriven, boolean reachedDestination, boolean isMoving) {
        super(numberofdoors, transmission, numberofmilesdriven, reachedDestination);
        this.isMoving = isMoving;
    }// commenting this will not give any error because Cars() empty constructor was created.

    public BMW() {
    }

    @Override
    public void isMoving(int speed) {
        speed += 10;
        System.out.println("This is overrided method. Speed has been increased +10. Now calling the Super class function.");
        super.isMoving(speed);
    }

    public boolean isMoving() {
        return isMoving;
    }
}
