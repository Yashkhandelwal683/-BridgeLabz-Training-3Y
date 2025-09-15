import java.util.ArrayList;
public class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    public School(String name) {
        this.name = name;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
}
