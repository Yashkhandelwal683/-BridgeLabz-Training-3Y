import java.util.Scanner;

public class KmToMiles {
    public static final double CONVERSION_RATE = 0.621371;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        double miles = km * CONVERSION_RATE;
        System.out.println(km + " km = " + miles + " miles");
        sc.close();
    }
}
