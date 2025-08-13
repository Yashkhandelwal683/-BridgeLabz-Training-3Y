import java.util.Scanner;

public class UniversityFeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the course fee (INR): ");
        double fee = sc.nextDouble();

       
        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();

       
        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;

 
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);

        sc.close();
    }
}
