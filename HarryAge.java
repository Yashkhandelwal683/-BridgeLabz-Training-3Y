import java.util.Scanner;

public class HarryAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = input.nextInt();

        int age = currentYear - birthYear;
        System.out.println("Harry's age in " + currentYear + " is " + age);

        input.close();
    }
}
