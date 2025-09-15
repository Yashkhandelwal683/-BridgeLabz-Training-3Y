import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("A001", "John Doe", 10000));
        accounts.add(new CurrentAccount("A002", "Jane Smith", 5000));

        for(BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getHolderName() + ", Balance: " + acc.getBalance() + ", Interest: " + acc.calculateInterest());
        }
    }
}
