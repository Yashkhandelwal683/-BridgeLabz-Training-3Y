import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    public Bank(String name) {
        this.name = name;
    }
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " in " + name);
    }
}
