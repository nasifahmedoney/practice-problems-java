package com.nasifahmed;

public class inside_the_bag extends bag {
    public inside_the_bag(int number_of_item) {
        super(number_of_item);
    }

    //public class

    @Override
    public void modify_number_of_items() {
        super.modify_number_of_items();

        System.out.println("This is the child class.");

    }
}
