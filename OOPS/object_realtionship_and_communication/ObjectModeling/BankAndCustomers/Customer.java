public class Customer {
    private String name;
    private double balance;
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void viewBalance() {
        System.out.println(name + " has balance: " + balance);
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public String getName() {
        return name;
    }
}
