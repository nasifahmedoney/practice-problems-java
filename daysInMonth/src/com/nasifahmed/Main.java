package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2018));
    }

    public static boolean isLeapYear(int year)
    {
        if(year<1 || year > 9999)
        {
            return false;
        }
        else if(((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0))
        {
            return true;
        }
        else
            return false;
    }

    public static int getDaysInMonth(int month, int yr)
    {
        if(month >= 1 && month <= 12)
        {
            boolean isleapyear = isLeapYear(yr);
            if(isleapyear == true)
            {
                switch(month)
                {
                    case 1:
                        return 31;
                    case 2:
                        return 29;
                    default:
                        return -1;
                }
            }
            else
            {
                switch(month)
                {
                    case 1:
                        return 31;
                    case 2:
                        return 28;
                    default:
                        return -1;
                }
            }
        }
        else
        {
            return -1;
        }
    }

}
