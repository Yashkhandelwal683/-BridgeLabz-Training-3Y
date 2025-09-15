import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "Alice", 50000));
        employees.add(new PartTimeEmployee(2, "Bob", 2000, 20));

        for(Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
