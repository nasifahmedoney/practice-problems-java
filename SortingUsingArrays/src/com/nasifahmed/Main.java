package com.nasifahmed;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {7,3,4,4,7,1,3,1,2};

        //sortedArray(array);
        //sortedArrayAscend(array);

        int[] userinput = getIntegers(5);

        System.out.println("Sorted array: ");
        sortedArray(userinput);
    }

    public static int[] getIntegers(int arrayelements)
    {
        System.out.println("Please enter " + arrayelements + " numbers: ");
        int[] values = new int[arrayelements];

        for(int i = 0; i < values.length; i++)
        {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printarray(int[] array)
    {
        System.out.println("Array elements are: ");
        for(int i = 0; i <array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    /*
    *  2 3 1 4 2 = 4 3 2 2 1
    * */
    public static void sortedArray(int[] array)
    {
        int[] sorted = new int[array.length];
        int largestinteger = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i; j < array.length; j++)
            {
                if(array[i] >= array[j])
                {
                    largestinteger = array[i];
//                    array[i] = array[j];
                }
                else
                {
                    largestinteger = array[j];
                    array[j] = array[i];
                    array[i] = largestinteger;
                }
            }
            sorted[i] = largestinteger;
        }

        for (int i = 0; i < sorted.length; i++)
        {
            System.out.println(sorted[i]);
        }
    }
    /*
     *  2 3 1 4 2 = 1 2 2 3 4
     * */
    public static void sortedArrayAscend(int[] array)
    {
        int[] sorted = new int[array.length];
        int smallestinteger = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i; j < array.length; j++)
            {
                if(array[i] <= array[j])
                {
                    smallestinteger = array[i];
                }
                else
                {
                    smallestinteger = array[j];
                    array[j] = array[i];
                    array[i] = smallestinteger;
                }
            }
            sorted[i] = smallestinteger;
        }

        for (int i = 0; i < sorted.length; i++)
        {
            System.out.println(sorted[i]);
        }
    }
}
