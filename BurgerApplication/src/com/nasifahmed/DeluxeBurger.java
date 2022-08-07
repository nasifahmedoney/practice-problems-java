package com.nasifahmed;

public class DeluxeBurger extends Hamburger {

    private AdditionalItems items = new AdditionalItems("Drink", "Chips");

    public DeluxeBurger(int price, String breadType, String meat) {
        super(price, breadType, meat);
        setBurgerType("Deluxe");
    }

    public AdditionalItems getItems() {
        return items;
    }

    @Override
    public void getTotalCost(int price, int additionalCost) {
        super.getTotalCost(price, additionalCost);
    }

    @Override
    public void getBurgerInfo() {
        super.getBurgerInfo();
    }
}
