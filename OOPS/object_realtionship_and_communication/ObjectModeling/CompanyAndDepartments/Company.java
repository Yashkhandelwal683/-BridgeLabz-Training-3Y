import java.util.ArrayList;
public class Company {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();
    public Company(String name) {
        this.name = name;
    }
    public void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        dept.addEmployee("Emp1");
        dept.addEmployee("Emp2");
        departments.add(dept);
    }
    public void showCompany() {
        System.out.println("Company: " + name);
        for(Department d : departments) {
            d.showEmployees();
        }
    }
}
