package com.nasifahmed;

public class AdditionalItems {

    private int additionalCost = 0;

    private int itemsCounter;
    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;
    private String item6;

    private itemswithprice itemsWithPrice = new itemswithprice();

    public AdditionalItems(String item1, String item2, String item3, String item4, String item5, String item6) {
        this.item1 = item1;
        itemValue(this.item1);

        this.item2 = item2;
        itemValue(this.item2);

        this.item3 = item3;
        itemValue(this.item3);

        this.item4 = item4;
        itemValue(this.item4);

        this.item5 = item5;
        itemValue(this.item5);

        this.item6 = item6;
        itemValue(this.item6);

        this.itemsCounter = 6;
    }

    public AdditionalItems(String item1, String item2, String item3, String item4, String item5) {
        this.item1 = item1;
        itemValue(this.item1);

        this.item2 = item2;
        itemValue(this.item2);

        this.item3 = item3;
        itemValue(this.item3);

        this.item4 = item4;
        itemValue(this.item4);

        this.item5 = item5;
        itemValue(this.item5);

        this.itemsCounter = 5;
    }

    public AdditionalItems(String item1, String item2, String item3, String item4) {
        this.item1 = item1;
        itemValue(this.item1);

        this.item2 = item2;
        itemValue(this.item2);

        this.item3 = item3;
        itemValue(this.item3);

        this.item4 = item4;
        itemValue(this.item4);

        this.itemsCounter = 4;
    }

    public AdditionalItems(String item1, String item2, String item3) {
        this.item1 = item1;
        itemValue(this.item1);

        this.item2 = item2;
        itemValue(this.item2);

        this.item3 = item3;
        itemValue(this.item3);

        this.itemsCounter = 3;
    }

    public AdditionalItems(String item1, String item2) {
        this.item1 = item1;
        itemValue(this.item1);

        this.item2 = item2;
        itemValue(this.item2);

        this.itemsCounter = 2;
    }

    public AdditionalItems(String item1) {
        this.item1 = item1;
        itemValue(this.item1);
        this.itemsCounter = 1;
    }

    public AdditionalItems() {
        this.additionalCost = 0;
        this.itemsCounter = 0;
    }

    public int calculateAdditionalCost() {
        return this.additionalCost;
    }

    private void itemValue(String item) {
        if (item.toLowerCase() == "lettuce") {
            this.additionalCost += 10;

        } else if (item.toLowerCase() == "tomato") {
            this.additionalCost += 20;


        } else if (item.toLowerCase() == "carrot") {
            this.additionalCost += 10;

        } else if (item.toLowerCase() == "other") {
            this.additionalCost += 20;

        } else if (item.toLowerCase() == "healthyItem1") {
            this.additionalCost += 30;

        } else if (item.toLowerCase() == "healthyItem2") {
            this.additionalCost += 10;
        }
    }

    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }

    public String getItem4() {
        return item4;
    }


    public void additionalItemsTaken() {
        int counter = itemsCounter;
        if(counter == 0)
        {
            System.out.println("No additional items taken.");
        }
        else {
            for (int i = 1; i <= counter; i++) {
                switch (i) {
                    case 1:
                        System.out.println(item1 + '\n' + itemsWithPrice.getPrice(item1) + '\n');break;
                    case 2:
                        System.out.println(item2 + '\n' + itemsWithPrice.getPrice(item2) + '\n');break;
                    case 3:
                        System.out.println(item3 + '\n' + itemsWithPrice.getPrice(item3) + '\n');break;
                    case 4:
                        System.out.println(item4 + '\n' + itemsWithPrice.getPrice(item4) + '\n');break;
                    case 5:
                        System.out.println(item5 + '\n' + itemsWithPrice.getPrice(item5) + '\n');break;
                    case 6:
                        System.out.println(item6 + '\n' + itemsWithPrice.getPrice(item6) + '\n');break;
                }
            }

        }

    }



}

