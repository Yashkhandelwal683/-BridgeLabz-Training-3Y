import java.util.Scanner;

public class ProfitLossCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Cost Price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

    
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");

        sc.close();
    }
}
