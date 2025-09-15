import java.util.ArrayList;
public class University {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();
    public University(String name) {
        this.name = name;
    }
    public void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        dept.addEmployee("Emp1");
        dept.addEmployee("Emp2");
        departments.add(dept);
    }
    public void showDepartments() {
        System.out.println("University " + name + " departments:");
        for(Department d : departments) {
            d.showEmployees();
        }
    }
}
