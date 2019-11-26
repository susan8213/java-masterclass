package academy.learnprogramming;

import java.util.ArrayList;

class Bank{
    private ArrayList<Branch> branches = new ArrayList<>();

    public void addBranch(String name) {

        if (findBranch(name) != null) {
            System.out.println("No creating new branch since branch " + name + " is already existed.");
            return;
        }

        branches.add(new Branch(name));
        System.out.println("Create new Branch " + name);
    }

    public void addCustomer(String branchName, String customerName) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, 1000);
        } else {
            System.out.println("Branch " + branchName + " has not created yet.");
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, amount);
        } else {
            System.out.println("Branch " + branchName + " has not created yet.");
        }
    }

    private Branch findBranch(String name) {

        for (Branch branch : branches) {
            if (name.equals(branch.getName())) {
                return branch;
            }
        }

        return null;
    }

    public void showBranch(String name) {
        Branch branch = findBranch(name);
        if (branch != null) {
            System.out.println("*** Branch " + branch.getName() + " ***");
            branch.showCustomers();
        } else {
            System.out.println("Branch " + name + " has not created yet.");
        }
    }
}

class Branch{
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCustomerTransaction(String name, double amount) {

        Customer customer = findCustomer(name);
        if(customer != null) {
            customer.addTransaction(amount);
        } else {
            System.out.println("Add Customer [" + name + "]");
            customers.add(new Customer(name, amount));
        }
    }

    private Customer findCustomer(String name) {

        for (Customer customer : customers) {
            if (name.equals(customer.getName())) {
                return customer;
            }
        }

        return null;
    }

    public void showCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer [" + customer.getName() + "]: ");
            customer.showTransactions();
        }

    }
}

class Customer{
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double amount) {
        this.name = name;
        addTransaction(amount);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        System.out.println("Add Customer [" + name + "] transaction " + amount + ".");
        transactions.add(Double.valueOf(amount));
    }

    public void showTransactions() {
        for(int i=0; i<transactions.size(); i++){
            System.out.println("Transaction #" + (i+1) + ": " + transactions.get(i).doubleValue());
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank();
        bank.addBranch("Tesla");
        bank.addCustomer("Tesla", "Tim");
        bank.addCustomer("Tesla", "Mike");
        bank.addCustomer("Tesla", "Percy");


        bank.addCustomerTransaction("Tesla", "Tim", 44.22);
        bank.addCustomerTransaction("Tesla", "Tim", 12.44);
        bank.addCustomerTransaction("Tesla", "Mike", 1.665);

        bank.showBranch("Tesla");
    }
}
