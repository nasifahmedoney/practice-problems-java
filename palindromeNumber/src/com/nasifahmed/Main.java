package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321));//54321
    }

    public static boolean isPalindrome(int number)
    {
        int rev = 0;
        if(number < 0)
        {
            number = number * -1;
        }
        int actualnumber = number;
        while(number > 0)
        {
            int lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;

            number = number / 10;
        }
        int reversed = rev;
        while(actualnumber > 0 && reversed >0)
        {
            int lastrevdigit = reversed % 10;

            int lastnumberdigit = actualnumber % 10;

            if(lastrevdigit == lastnumberdigit)
            {
                actualnumber = actualnumber / 10;
                reversed = reversed / 10;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
