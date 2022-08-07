package com.nasifahmed;

public class bag {
    private int number_of_item = 0;

    public bag(int number_of_item) {
        this.number_of_item = number_of_item;
    }

    public void modify_number_of_items()
    {
        System.out.println("This is the parent class.");
        System.out.println("Number of items: " + this.number_of_item);


    }

    public void setNumber_of_item(int number_of_item) {
        this.number_of_item = number_of_item;
    }
}
