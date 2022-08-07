package com.nasifahmed;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        //add values, use iterator after adding values

//        linkedList.add("A");
        linkedList.add("Borishal");
        linkedList.add("Comilla");
        linkedList.add("Dhaka");

        /*linkedList.add("NameUser");
        linkedList.add("NameCustomer");
        linkedList.add("NameNoName");*/



        ListIterator<String> stringListIterator = linkedList.listIterator();

        //int compareTo = stringListIterator.next().compareTo("Name0");

        while(stringListIterator.hasNext())
        {
            //stringListIterator.next().compareTo("Name0");
            //System.out.println( "List indexes: " + (stringListIterator.nextIndex()) +" Values: "+ stringListIterator.next() );
            System.out.println(stringListIterator.next().compareTo("Do") + " Comparing with Name");
            System.out.println("..........................");
        }


    }
}
