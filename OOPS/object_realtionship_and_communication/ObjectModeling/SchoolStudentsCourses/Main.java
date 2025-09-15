public class Main {
    public static void main(String[] args) {
        School school = new School("Happy School");
        Student s1 = new Student("John");
        Student s2 = new Student("Alice");
        school.addStudent(s1);
        school.addStudent(s2);
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);
        s1.viewCourses();
        s2.viewCourses();
        c1.viewStudents();
        c2.viewStudents();
    }
}
