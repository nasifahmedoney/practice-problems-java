package com.nasifahmed;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count <= 10)
        {
            System.out.println("Enter Number#" + count + " :");
            boolean isInteger = scanner.hasNextInt();
            if(isInteger == true)
            {
                int addToSum = scanner.nextInt();
                scanner.nextLine();
                sum = sum + addToSum;
                count++;
            }
            else
            {
                System.out.println("invalid Input");
                scanner.nextLine();
            }
        }
        System.out.println("The sum of numbers: " + sum);
        scanner.close();
    }
}
