package com.nasifahmed;

public class Main {

    /*
    public static void main(String[] args)
    {
        //System.out.println(dosum());
        int result = dosum();
        System.out.println(result);
    }

    public static int dosum()
    {
        int a= 2;
        int b= 3;

        int result = a + b;

        return result;
    }
    */
    /*
    public static void main(String[] args)
    {
        int res1 = dosum(3,4, 5);
        int res2 = dosum(4,5, 6);

        if(res1 == res2)
        {
            System.out.println("result is Equal");
        }
        else if(res1 > res2)
        {
            System.out.println("Here is the greater result, res1: " + res1);
        }
        else
        {
            System.out.println("Here is the greater result, res2: " + res2);
        }
    }

    public static int dosum(int a, int b, int c)
    {

        int result = a + b + c;

        return result;
    }
    */
    public static void main(String[] args)
    {
        int pos = calchighscoreposition(50);
        displayHighScorepos("asdads", pos);
    }

    public static void displayHighScorepos(String name, int position)
    {
        System.out.println(name + " Position " + position);
    }

    public static int calchighscoreposition(int pscore)
    {
        if(pscore > 1000)
        {
            return 1;
        }
        else if(pscore > 500 && pscore < 1000)
        {
            return 2;
        }
        else if(pscore > 100 && pscore < 500)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }
}
