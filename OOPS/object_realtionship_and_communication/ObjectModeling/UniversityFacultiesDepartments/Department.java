import java.util.ArrayList;
public class Department {
    private String name;
    private ArrayList<String> employees = new ArrayList<>();
    public Department(String name) {
        this.name = name;
    }
    public void addEmployee(String empName) {
        employees.add(empName);
    }
    public void showEmployees() {
        System.out.println("Department " + name + " employees:");
        for(String emp : employees) {
            System.out.println(" - " + emp);
        }
    }
}
