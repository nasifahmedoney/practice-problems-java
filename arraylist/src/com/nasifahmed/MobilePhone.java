package com.nasifahmed;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public ArrayList<Contacts> getContacts() {
        return contacts;
    }

    public void addContacts()
    {
        System.out.println("Please enter contact name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter contact number: ");
        String number = scanner.nextLine();

        //check if already exists
        //Contacts newContact = new Contacts(name,number);
        contacts.add(new Contacts(name,number));

        System.out.println("A new contact has been added.");
        //contacts.add(new Contacts(name,number));
    }


    public void modifyContacts()
    {
        System.out.println("Enter contact name to modify: ");
        String name = scanner.nextLine();

        
    }


}
