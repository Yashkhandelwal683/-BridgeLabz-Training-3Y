import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<FoodItem> items = new ArrayList<>();
        items.add(new VegItem("Paneer", 150, 2));
        items.add(new NonVegItem("Chicken", 250, 1));

        for(FoodItem item : items) {
            System.out.println(item.getItemDetails() + ", Total Price: " + item.calculateTotalPrice());
        }
    }
}
