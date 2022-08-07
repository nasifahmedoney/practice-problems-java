package com.nasifahmed;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Branch() {
    }

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }


    public Customer findCustomer(String customerName)
    {
        for(Customer customer : customerList)
        {
            if(customer.getCustomerName().equals(customerName))
            {
                return customer;
            }
        }
        return null;
    }

	public Double getCustomerInitialTransaction(String CustomerName)
	{
		for(int i = 0; i < customerList.size(); i++)
		{
			if(customerList.get(i).getCustomerName() == CustomerName)
			{
				return customerList.get(i).getTransactions().get(0);
			}
		}
        return -1.00;
	}

    public void displayCustomerList()
    {
        for(Customer customer : customerList)
        {
            System.out.println(customer.getCustomerName());
        }
    }

}
