package com.nasifahmed;

public class itemswithprice {

    private String item;
    private int price;

    private int lettucePrice = 10;
    private int tomatoPrice = 20;
    private int carrotPrice = 10;
    private int otherPrice = 20;
    private int healthyItem1Price = 30;
    private int healthyItem2Price = 10;


    public int getPrice(String item) {
        if (item.toLowerCase() == "lettuce")
        {
            return lettucePrice;
        } else if (item.toLowerCase() == "tomato")
        {
            return tomatoPrice;
        } else if (item.toLowerCase() == "carrot")
        {
            return carrotPrice;
        } else if (item.toLowerCase() == "other")
        {
            return otherPrice;
        } else if (item.toLowerCase() == "healthyItem1")
        {
            return healthyItem1Price;
        } else if (item.toLowerCase() == "healthyItem2")
        {
            return healthyItem2Price;
        }
        return price;
    }
}
