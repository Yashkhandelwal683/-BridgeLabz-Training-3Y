import java.util.ArrayList;
public class Course {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    public Course(String name) {
        this.name = name;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public String getName() {
        return name;
    }
    public void viewStudents() {
        System.out.println("Course " + name + " has students:");
        for(Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
