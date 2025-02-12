

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}


public class BankingSystem {
    public static void main(String[] args) {
        // Creating different types of accounts
        BankAccount savings = new SavingsAccount("SA12345", 5000, 4.5);
        BankAccount checking = new CheckingAccount("CA67890", 2000, 1000);
        BankAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000, 12);

        // Display account details
        System.out.println("Savings Account Details:");
        savings.displayAccountInfo();
        System.out.println("------------------------------");

        System.out.println("Checking Account Details:");
        checking.displayAccountInfo();
        System.out.println("------------------------------");

        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountInfo();
    }
}
