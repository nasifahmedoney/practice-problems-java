package com.nasifahmed;

public class HealthyBurger extends Hamburger {

    private AdditionalItems items;
    public HealthyBurger(int price, String breadType, String meat) {
        super(price, breadType, meat);
        setBurgerType("Healthy");
    }

    @Override
    public AdditionalItems getAdditionalitems(AdditionalItems additions) {
        return super.getAdditionalitems(additions);

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
