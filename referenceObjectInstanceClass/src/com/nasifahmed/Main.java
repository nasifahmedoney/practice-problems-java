package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
	    House someHouse = new House("green");
	    House anotherHouse = someHouse; // always prints same color for all objects

        System.out.println(someHouse.getHouse());
        System.out.println(anotherHouse.getHouse());
        System.out.println('\n');
        someHouse.setColor("blue");

        System.out.println(someHouse.getHouse());
        System.out.println(anotherHouse.getHouse());
        System.out.println('\n');
        House otherHouse = new House(); // another object prints another color

        otherHouse.setColor("yello");
        System.out.println('\n');
        System.out.println(someHouse.getHouse());
        System.out.println(anotherHouse.getHouse());
        System.out.println(otherHouse.getHouse());

    }
}
