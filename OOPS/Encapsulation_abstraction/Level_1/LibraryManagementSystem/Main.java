import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1, "Java Programming", "Author A"));
        items.add(new Magazine(2, "Tech Today", "Editor B"));
        items.add(new DVD(3, "Learning Java", "Producer C"));

        for(LibraryItem item : items) {
            System.out.println(item.getItemDetails() + ", Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}
