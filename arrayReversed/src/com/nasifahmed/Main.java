package com.nasifahmed;

public class Main {

    public static void main(String[] args)
    {
        int[] array = {10,20,30,40,50,60,70,80,90,100};
        reversedArray(array);
    }

    private static void reversedArray(int[] array)
    {
        int[] reversed = new int[array.length];

        for(int i = 0; i < array.length; i++)
        {
            reversed[i] = array[(array.length-1) - i];
        }

        for(int i = 0; i <array.length; i++)
        {
            System.out.println(reversed[i]);
        }
    }
}
