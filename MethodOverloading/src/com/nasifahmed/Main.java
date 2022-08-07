package com.nasifahmed;


// method OVERLOADING
// using same method of same type with different parameters
public class Main {

    public static void main(String[] args) {
        int sum_2 = calc_sum(2,3);
        System.out.println("Sum of two numbers: " + sum_2);

        int sum_3 = calc_sum(4,5, 6);
        System.out.println("Sum of three numbers: " + sum_3);

        System.out.println(calc_sum("a"));

        calc_sum();

    }

    public static int calc_sum(int a, int b)
    {
        return a + b;
    }
    public static int calc_sum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static int calc_sum(String a)
    {
        int i = 1;
        return i;
    }
    public static int calc_sum()
    {
        System.out.println("This has no parameter");;
        return 0;
    }


}
