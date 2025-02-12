abstract class BankAccount {
    private String accountNumber, holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
    }
}

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }

    public void applyForLoan() {
        System.out.println("Loan application submitted for: " + calculateLoanEligibility());
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("123456789", "Gaurav Patel", 5000);
        CurrentAccount acc2 = new CurrentAccount("987654321", "Gaurav Patel", 8000);

        acc1.displayDetails();
        System.out.println("Interest: $" + acc1.calculateInterest());
        System.out.println("---------------------------------");

        acc2.displayDetails();
        System.out.println("Interest: $" + acc2.calculateInterest());
        acc2.applyForLoan();
        // ((Loanable) acc2).applyForLoan();
        System.out.println("---------------------------------");
    }
}