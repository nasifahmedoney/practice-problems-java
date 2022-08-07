package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
	    int[] array = generateArray(10);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println(getSum(array));
    }

    //create array
    public static int[] generateArray(int number)
    {
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = i+10;
        }

        return array;
    }

    public static double getSum(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return (double) sum / (double) array.length;
    }


}
