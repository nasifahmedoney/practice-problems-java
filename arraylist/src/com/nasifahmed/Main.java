package com.nasifahmed;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.addContacts();

        System.out.println(mobilePhone.getContacts().get(0).getName());
    }
}
