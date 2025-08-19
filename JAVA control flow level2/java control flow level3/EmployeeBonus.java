import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your Years of Service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Congratulations! You are eligible for a bonus of ₹" + bonus);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        sc.close();
    }
}
