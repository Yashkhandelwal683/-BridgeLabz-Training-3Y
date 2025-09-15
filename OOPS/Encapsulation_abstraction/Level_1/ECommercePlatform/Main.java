import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "Jeans", 2000));
        products.add(new Groceries(103, "Rice", 1000));

        for(Product p : products) {
            double tax = 0;
            if(p instanceof Taxable) {
                tax = ((Taxable)p).calculateTax();
            }
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println("Product: " + p.getName() + ", Final Price: " + finalPrice);
        }
    }
}
