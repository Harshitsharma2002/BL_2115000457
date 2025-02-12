

import java.util.ArrayList;

class Bank {
    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.name + " at " + bankName);
    }

    public void displayCustomers() {
        System.out.println(customers);
        System.out.println("Customers at " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.name);
        }
    }
}

class BankAccount {
    final String accountNumber;
    double balance;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void viewBalance() {
        System.out.println("Account: " + accountNumber + " | Balance: $" + balance);
    }
}

class Customer {
    String name;
    ArrayList<BankAccount> accounts;
    Bank bank;

    Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        this.accounts = new ArrayList<>();
        bank.openAccount(this);
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account " + account.accountNumber + " added for " + name);
    }

    public void viewAccounts() {
        System.out.println(name + "'s Accounts:");
        for (BankAccount account : accounts) {
            account.viewBalance();
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI Bank");
        Bank hdfc = new Bank("HDFC Bank");

        Customer harshit = new Customer("Harshit sharma", sbi);
        Customer vinod = new Customer("Vinod Sharma", hdfc);

        BankAccount acc1 = new BankAccount("SBI12345", 5000);
        BankAccount acc2 = new BankAccount("HDFC67890", 8000);

        harshit.addAccount(acc1);
        vinod.addAccount(acc2);

        sbi.displayCustomers();
        hdfc.displayCustomers();

        harshit.viewAccounts();
        vinod.viewAccounts();
    }
}