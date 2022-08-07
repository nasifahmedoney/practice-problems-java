package com.nasifahmed;
//
public class Hamburger {
    private String name = "Hamburger";
    private int price;
    private String breadType;
    private String meat;
    private String BurgerType = "Hamburger";
    private int totalcost;

    private AdditionalItems items;

    public Hamburger(int price, String breadType, String meat) {
        this.price = price;
        this.breadType = breadType;
        this.meat = meat;
    }

    public AdditionalItems getAdditionalitems(AdditionalItems additions)
    {
        this.items = additions;
        return items;
    }

    public int getPrice() {
        return price;
    }

    public void setBurgerType(String burgerType) {
        BurgerType = burgerType;
    }

    public String getBurgerType() {
        return BurgerType;
    }

    public void getTotalCost(int price, int additionalCost)
    {
        this.totalcost = price + additionalCost;
        System.out.println("Total cost: " + totalcost);
    }

    public void getBurgerInfo()
    {
        System.out.println("Burger: " + name +  '\n'
                + "Burger Type: " + getBurgerType() + '\n'
                + "Base Price: " + getPrice() + '\n'
                + "Additional Items: " );
        items.additionalItemsTaken();
        System.out.println("Total Cost: " + totalcost);
    }

}
