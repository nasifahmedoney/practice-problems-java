package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW(4,"Auto",100, false, true);
        if(bmw.isMoving() == true)
        {
            bmw.isMoving(100);
        }
    }
}
