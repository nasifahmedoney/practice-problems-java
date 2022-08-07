package com.nasifahmed;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addNewBranch();
        bank.addNewBranch();
        bank.addNewBranch();
        System.out.println("\n");


        System.out.println("branch list size: " + bank.getBranchListsize());
        bank.getBranches();
        System.out.println("\n");


        System.out.println("Add a Customer with transaction ");
        bank.addCustomerToBranchWithTransaction();
        System.out.println("\n");
        System.out.println("Add another Customer with transaction ");
        bank.addCustomerToBranchWithTransaction();
        System.out.println("\n");
        System.out.println("Add another Customer with transaction ");
        bank.addCustomerToBranchWithTransaction();

        System.out.println("\n");

        System.out.println("Enter branch name and customer name to add additional transactions to a customer: ");

        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer name: ");
        String customer = scanner.nextLine();
        System.out.println("\n");

        bank.addAdditionalTransactions(branchName,customer);

        System.out.println("\n");

        System.out.println("Enter branch name to display list of customers: ");
        branchName = scanner.nextLine();

        bank.listOfCustomerInABranch(branchName);
    }
}
