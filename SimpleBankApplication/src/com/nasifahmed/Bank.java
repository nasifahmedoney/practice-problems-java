package com.nasifahmed;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Branch> branchList = new ArrayList<Branch>();

    private static Scanner scanner = new Scanner(System.in);

    public void addNewBranch()
    {

        System.out.println("Enter new branch name: ");
        String branchName = scanner.nextLine();

        if(branchList.size() >= 1)
        {
            for(int i = 0; i < branchList.size(); i++)
            {
                if(branchList.get(i).getBranchName() == branchName)
                {
                    System.out.println("Branch already exists.");
                }
            }
            branchList.add(new Branch(branchName));
            System.out.println("A new branch " + branchName + " has been added to the branch list..");
        }
        else
        {
            branchList.add(new Branch(branchName));
            System.out.println("A new branch " + branchName + " has been added to the branch list");
        }
    }

    public void addCustomerToBranchWithTransaction()
    {
        System.out.println("Enter branch name: ");
        String bName = scanner.nextLine();

        System.out.println("Enter new Customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter initial transaction amount: ");
        double initialTransactionAmount = scanner.nextDouble();
        scanner.nextLine();

        boolean found = false;
        for(Branch branch : branchList)
        {
            if(branch.getBranchName().equals(bName))
            {
                branch.getCustomerList().add(new Customer(customerName, initialTransactionAmount));

                System.out.println("A new customer has been added to " + bName + '\n' +
                        "Customer name: " + customerName + '\n' +
                        "Initial transaction: " + branch.getCustomerInitialTransaction(customerName) );
                found = true;
            }
        }
        if(found == false)
        {
            System.out.println("No branch found named: " + bName);
        }

    }

    public int getBranchListsize()
    {
        return branchList.size();
    }

    public void getBranches()
    {
        for(Branch branch : branchList)
        {
            System.out.println("Branch names: " + branch.getBranchName());
        }
    }

    public void addAdditionalTransactions(String branchName, String customerName)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            System.out.println("Branch found: " + branch.getBranchName());
            Customer customer = branch.findCustomer(customerName);
            if(customer != null)
            {
                System.out.println("Customer found: " + customer.getCustomerName());
                System.out.println("Enter transaction amount: ");
                double transactionAmount = scanner.nextDouble();
                scanner.nextLine();
                customer.addTransactions(transactionAmount);
                System.out.println("Deposit/Withdraw more: press enter to continue or type exit to exit");
                String str = scanner.nextLine();
                while(!str.equals("exit"))
                {
                    System.out.println("Enter transaction amount: ");
                    transactionAmount = scanner.nextDouble();
                    scanner.nextLine();
                    customer.addTransactions(transactionAmount);
                    System.out.println("press enter to continue or type exit to exit");
                    str = scanner.nextLine();
                }
                System.out.println("Customer: " + customer.getCustomerName() + ", has following transactions ");
                customer.displayTransactions(customer.getTransactions());
            }
            else
            {
                System.out.println("No customer found.");
            }
        }
        else
        {
            System.out.println("Branch not found.");
        }
    }

    public Branch findBranch(String branchName)
    {
        for(Branch branch : branchList)
        {
            if(branch.getBranchName().equals(branchName))
            {
                return branch;
            }
        }
        return null;
    }

    public void listOfCustomerInABranch(String branchName)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            branch.displayCustomerList();
        }
        else
        {
            System.out.println("branch not found.");
        }
    }
}
