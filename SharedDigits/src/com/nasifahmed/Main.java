package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigits(88,44));
    }
    public static boolean hasSharedDigits(int start, int end)
    {
        if(start >=10 && end <= 99)
        {
            int startdigits = start % 10;
            do
            {
                int enddigits = end % 10;

                if(enddigits == startdigits)
                {
                    return true;
                }
                else
                {
                    enddigits = end / 10;
                    if (enddigits == startdigits)
                    {
                        return true;
                    }
                }
                start /= 10;
                startdigits = start;
            }while (start > 0);
            return false;
        }
        else
        {
            return false;
        }
    }
}
