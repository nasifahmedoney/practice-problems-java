package com.nasifahmed;

public class Main {

    public static void main(String[] args) {
        int sh = 3;

        switch (sh) {
            case 1:
                System.out.println("Integer value 1 from sh variable. case 1");
                break;
            case 2:
                System.out.println("Integer value 2 from sh variable. case 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Multiple values case 3,4 5. Actual Value is " + sh);
                break;
            default:
                System.out.println("this is the default value");
                break;

        }

        char ch = 'F';
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("the character was: " + ch);
                break;
                default:
                    System.out.println("Character not found.");
        }
        //works with strings as well

        printDayOfTheWeek(6);
    }

    public static void printDayOfTheWeek(int day)
    {
        if(day > 6)
        {
            System.out.println("Invalid value");
        }
        else
        {
            switch (day)
            {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                    default:
                        System.out.println("Invalid value");
            }
        }
    }
}
