package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }

    public static boolean isOdd(int number)
    {
        if(number < 1)
        {
            return  false;
        }
        else if(number % 2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int sumOdd(int start, int end)
    {
        if( (start <= end) && (start > 0 && end > 0) )
        {
            int sum = 0;
            for (int i = start; i <= end; i++)
            {
                boolean oddnumber = isOdd(i);
                if(oddnumber == true)
                {
                    sum = sum+ i;
                }
            }
            return sum;
        }
        else
        {
            return -1;
        }
    }

}
