class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    String maturityDate;

    FixedDepositAccount(String accountNumber, double balance, String maturityDate) {
        super(accountNumber, balance);
        this.maturityDate = maturityDate;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("A1001", 5000, 3.5);
        CheckingAccount ca = new CheckingAccount("A1002", 2000, 1000);
        FixedDepositAccount fd = new FixedDepositAccount("A1003", 10000, "2026-12-31");

        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
    }
}
