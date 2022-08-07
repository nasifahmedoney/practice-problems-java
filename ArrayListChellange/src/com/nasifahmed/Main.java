package com.nasifahmed;

import java.util.ArrayList;

class Contact//mobile phone class
{
    private ArrayList<name_number> contactList = new ArrayList<name_number>();

    //store data inside the "name_number" object
    //store objects inside the list
    //find the object containing the data

    public void addelements()
    {
        //check if already exists
        contactList.add(new name_number("name1", "123456789"));
        contactList.add(new name_number("name2", "12345"));
        contactList.add(new name_number("name3", "12345678"));
        contactList.add(new name_number("name4", "12345678"));
    }

    public void printList()
    {
        System.out.println("Number of elements in the list: " + contactList.size());
        for(int i = 0; i < contactList.size(); i++)
        {
            System.out.println(contactList.get(i).getName());
            System.out.println(contactList.get(i).getNumber());
        }
    }

    public int findContactObjectIndex(String name)
    {
		//sub string matched indexes
		//string1 is a substring of string2
		//string2.contains(string1)
		//return is boolean
		//store sub string matches in an index array(return type/ method type)
		//print the indexes
		
		//str1.toLowerCase().contains(str2.toLowerCase())

        for(int i = 0; i < contactList.size(); i++)
        {
            if(contactList.get(i).getName().toLowerCase() == name.toLowerCase())
            {
                return i;
            }
        }
        return -1;
    }

    public void subStringMatched(String name)
    {
        ArrayList<Integer> matchedContacts = subStringMatchedContacts(name);
        for(int i = 0; i < matchedContacts.size(); i++)
        {
            System.out.println(contactList.get(matchedContacts.get(i)).getName());
            System.out.println(contactList.get(matchedContacts.get(i)).getNumber());
        }
    }

	public ArrayList<Integer> subStringMatchedContacts(String name)
	{
        ArrayList<Integer> matched = new ArrayList<Integer>();

		for(int i = 0; i < contactList.size(); i++)
        {
            if(contactList.get(i).getName().toLowerCase().contains(name.toLowerCase()))
            {
                matched.add(i);
            }
        }

		return matched;
	}

    public void findContact(String name)
    {
        if(findContactObjectIndex(name) < 0)
        {
            System.out.println("Contact not found.");
        }
        else
        {
            System.out.println("Contact Found: " + contactList.get(findContactObjectIndex(name)).getName());
            System.out.println("Contact Number: " + contactList.get(findContactObjectIndex(name)).getNumber());
        }
    }

    public void updateExistingContact(String name)
    {
        //use contactList.set(index, contact object)
        //or get the index use setters update the existing object
        //create a new object set the object in its index

		int contactIndex = findContactObjectIndex(name);
		if(contactIndex == -1)
		{
			System.out.println("Contact not found to update");
		}
		else
		{
			contactList.set(contactIndex, new name_number("new contact", "123456789"));
			System.out.println("Contact has been updated.");
		}
    }
	
}

class name_number extends Contact
{
    private String name;
    private String number;

    public name_number()
    {

    }
    public name_number(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName()
    {
        return name;
    }
    public String getNumber()
    {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    //constructor with only name return the object chech if this.name == name
    //a constructor with a function that will match the namei if matched return the object
    //define a function that returns the name match and return object
    //get the indexof the object
    //access all the objects in the list using loop?
}

public class Main {

    public static void main(String[] args)
    {
        Contact contact = new Contact();
        contact.addelements();

        contact.findContact("name1");
        System.out.println("Substring matched: ");
        contact.subStringMatched("na");

        contact.updateExistingContact("name2");

        System.out.println("updated arraylist: ");
        contact.printList();
    }
}
