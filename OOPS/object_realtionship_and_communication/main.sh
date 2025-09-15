#!/bin/bash

BASE_DIR="./ObjectModeling"

echo "Creating Java problem solutions in $BASE_DIR..."

mkdir -p "$BASE_DIR"

########################################
# Assisted Problems
########################################

# Problem 1: Library and Books (Aggregation)
mkdir -p "$BASE_DIR/LibraryAndBooks"
cat > "$BASE_DIR/LibraryAndBooks/Book.java" << EOL
public class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}
EOL

cat > "$BASE_DIR/LibraryAndBooks/Library.java" << EOL
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public void showBooks() {
        for(Book b : books) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor());
        }
    }
}
EOL

cat > "$BASE_DIR/LibraryAndBooks/Main.java" << EOL
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Author A");
        Book b2 = new Book("Advanced Java", "Author B");
        Library lib1 = new Library();
        Library lib2 = new Library();
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b1);
        System.out.println("Library 1:");
        lib1.showBooks();
        System.out.println("Library 2:");
        lib2.showBooks();
    }
}
EOL

# Problem 2: Bank and Account Holders (Association)
mkdir -p "$BASE_DIR/BankAndCustomers"
cat > "$BASE_DIR/BankAndCustomers/Customer.java" << EOL
public class Customer {
    private String name;
    private double balance;
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void viewBalance() {
        System.out.println(name + " has balance: " + balance);
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public String getName() {
        return name;
    }
}
EOL

cat > "$BASE_DIR/BankAndCustomers/Bank.java" << EOL
import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    public Bank(String name) {
        this.name = name;
    }
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " in " + name);
    }
}
EOL

cat > "$BASE_DIR/BankAndCustomers/Main.java" << EOL
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        Customer c1 = new Customer("John", 5000);
        Customer c2 = new Customer("Alice", 3000);
        bank.openAccount(c1);
        bank.openAccount(c2);
        c1.viewBalance();
        c2.viewBalance();
    }
}
EOL

# Problem 3: Company and Departments (Composition)
mkdir -p "$BASE_DIR/CompanyAndDepartments"
cat > "$BASE_DIR/CompanyAndDepartments/Employee.java" << EOL
public class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
EOL

cat > "$BASE_DIR/CompanyAndDepartments/Department.java" << EOL
import java.util.ArrayList;
public class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    public Department(String name) {
        this.name = name;
    }
    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }
    public void showEmployees() {
        System.out.println("Department: " + name);
        for(Employee e : employees) {
            System.out.println(" - " + e.getName());
        }
    }
}
EOL

cat > "$BASE_DIR/CompanyAndDepartments/Company.java" << EOL
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
EOL

cat > "$BASE_DIR/CompanyAndDepartments/Main.java" << EOL
public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        company.addDepartment("IT");
        company.addDepartment("HR");
        company.showCompany();
    }
}
EOL

########################################
# Self Problems
########################################

# Problem 1: School and Students with Courses (Association and Aggregation)
mkdir -p "$BASE_DIR/SchoolStudentsCourses"
cat > "$BASE_DIR/SchoolStudentsCourses/Student.java" << EOL
import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();
    public Student(String name) {
        this.name = name;
    }
    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }
    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for(Course c : courses) {
            System.out.println(" - " + c.getName());
        }
    }
}
EOL

cat > "$BASE_DIR/SchoolStudentsCourses/Course.java" << EOL
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
EOL

cat > "$BASE_DIR/SchoolStudentsCourses/School.java" << EOL
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
EOL

cat > "$BASE_DIR/SchoolStudentsCourses/Main.java" << EOL
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
EOL

# Problem 2: University with Faculties and Departments (Composition and Aggregation)
mkdir -p "$BASE_DIR/UniversityFacultiesDepartments"
cat > "$BASE_DIR/UniversityFacultiesDepartments/Department.java" << EOL
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
EOL

cat > "$BASE_DIR/UniversityFacultiesDepartments/Faculty.java" << EOL
public class Faculty {
    private String name;
    public Faculty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
EOL

cat > "$BASE_DIR/UniversityFacultiesDepartments/University.java" << EOL
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
EOL

cat > "$BASE_DIR/UniversityFacultiesDepartments/Main.java" << EOL
public class Main {
    public static void main(String[] args) {
        University uni = new University("Global Uni");
        uni.addDepartment("Engineering");
        uni.addDepartment("Arts");
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Jones");
        System.out.println("Facult
