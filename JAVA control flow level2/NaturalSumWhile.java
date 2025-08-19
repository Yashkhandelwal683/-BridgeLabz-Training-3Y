import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0, i = 1;

            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System.out.println("Sum by formula = " + sumFormula);
            System.out.println("Sum by while loop = " + sumLoop);
            System.out.println("Results Match? " + (sumFormula == sumLoop));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
