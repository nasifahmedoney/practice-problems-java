package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(250, "bread", "beef");
        hamburger.getTotalCost(hamburger.getPrice(), hamburger.getAdditionalitems(new AdditionalItems("tomato","other")).calculateAdditionalCost());

        DeluxeBurger deluxeBurger = new DeluxeBurger(300,"superbread","beef");

        deluxeBurger.getTotalCost(deluxeBurger.getPrice(), deluxeBurger.getItems().calculateAdditionalCost());

        HealthyBurger healthyBurger = new HealthyBurger(200, "bread","chicken");

        healthyBurger.getTotalCost(healthyBurger.getPrice(), healthyBurger.getAdditionalitems(new AdditionalItems("tomato","carrot")).calculateAdditionalCost());

        healthyBurger.getBurgerInfo();

    }
}
