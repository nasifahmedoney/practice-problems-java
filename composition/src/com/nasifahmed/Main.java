package com.nasifahmed;

public class Main {

    public static void main(String[] args) {


        phones phone = new phones(new Android("Galaxy A7"), new Windows("Lumia 640XL"));

        System.out.println("Android model name: " + phone.androidDeviceName());

        Devices device = new Devices(phone);

        System.out.println(device.getPhone().getWindows().getUserName());

    }
}
