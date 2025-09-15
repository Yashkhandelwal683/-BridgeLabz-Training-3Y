public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        Customer c1 = new Customer("John", 5000);
        Customer c2 = new Customer("Alice", 3000);
        bank.openAccount(c1);
        bank.openAccount(c2);
        c1.viewBalance();
        c2.viewBalance();
    }
}
