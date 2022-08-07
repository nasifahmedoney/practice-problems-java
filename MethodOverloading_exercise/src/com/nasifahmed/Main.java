package com.nasifahmed;

public class Main {
    //const value declaration
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        String twoParameters = getDurationString(200, 50);
        System.out.println("This is from two parameter method: " + twoParameters);

        String oneParameter = getDurationString(4000);
        System.out.println("This is from one parameter method: " + oneParameter);
    }
    public static String getDurationString(int min, int sec)
    {
        if((min >= 0) && (sec >= 0 && sec <= 59) )
        {
            int hr = min / 60;
            int mn = min % 60;
            int sc = sec;

            return (hr+"h " + mn+"m " + sc +"s" );
        }
        else
        {
            return ("Invalid Value");
        }
    }

    public static String getDurationString(int seconds)
    {
        if(seconds >= 0)
        {
            int mins = seconds / 60;
            int secs = seconds % 60;
            String newstring = getDurationString(mins, secs);

            return newstring;
        }
        else
        {
            return "Invalid Value";
        }
    }
}
