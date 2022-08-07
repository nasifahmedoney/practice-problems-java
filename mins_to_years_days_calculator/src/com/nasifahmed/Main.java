package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        minstoyeardayscalc(525600);
    }
    public static void minstoyeardayscalc(int min)
    {
        int hours = min / 60; //hours 1hr = 60 min
        int days = hours / 24; //days 1 day = 24 hr
        int years = days / 365; 
        int remaining_days = days % 365;

        System.out.println(years + "Years and " + remaining_days + "Days.");
    }

}
