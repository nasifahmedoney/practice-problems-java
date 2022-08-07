package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        /*System.out.println(reverse(12));
        System.out.println(getNumberOfDigits(100));*/

        numberToWords(12321);
    }
    public static void numberToWords(int number)
    {
        if(number < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int revNumber = reverse(number);
            if(getNumberOfDigits(number) == getNumberOfDigits(revNumber))
            {
                while(revNumber > 0)
                {
                    int printNumber = revNumber % 10;
                    switch (printNumber)
                    {
                        case 0:
                            System.out.println("Zero");break;
                        case 1:
                            System.out.println("One");break;
                        case 2:
                            System.out.println("Two");break;
                        case 3:
                            System.out.println("Three");break;
                        case 4:
                            System.out.println("Four");break;
                        case 5:
                            System.out.println("Five");break;
                        case 6:
                            System.out.println("Six");break;
                        case 7:
                            System.out.println("Seven");break;
                        case 8:
                            System.out.println("Eight");break;
                        case 9:
                            System.out.println("Nine");break;
                    }
                    revNumber = revNumber / 10;
                }
            }
            else
            {
                int addZeros = getNumberOfDigits(number) - getNumberOfDigits(revNumber);
                if(addZeros < 0)
                {
                    addZeros = addZeros * -1;
                }
                /*System.out.println("zero's to add: " + addZeros);*/
                while(revNumber > 0)
                {
                    int printNumber = revNumber % 10;
                    switch (printNumber)
                    {
                        case 0:
                            System.out.println("Zero");break;
                        case 1:
                            System.out.println("One");break;
                        case 2:
                            System.out.println("Two");break;
                        case 3:
                            System.out.println("Three");break;
                        case 4:
                            System.out.println("Four");break;
                        case 5:
                            System.out.println("Five");break;
                        case 6:
                            System.out.println("Six");break;
                        case 7:
                            System.out.println("Seven");break;
                        case 8:
                            System.out.println("Eight");break;
                        case 9:
                            System.out.println("Nine");break;
                    }
                    revNumber = revNumber / 10;
                }
                for(int i = 0; i < addZeros; i++)
                {
                    System.out.println("Zero");
                }

            }
        }
    }
    public static int reverse(int number)
    {
        int rev = 0;
        if(number < 0)
        {
            return -1;
        }
        else
        {
            while(number >0)
            {
                //a digit counter needed
                int lastDigit = number % 10;
                rev = (rev * 10)+ lastDigit;
                number = number / 10;
            }
        }
        return rev;
    }

    public static int getNumberOfDigits(int number)
    {
        int counter = 0;
        if(number < 0)
        {
            return -1;
        }
        else
        {
            while(number > 0)
            {
                counter++;
                number = number / 10;
            }
        }
        return counter;
    }

}
