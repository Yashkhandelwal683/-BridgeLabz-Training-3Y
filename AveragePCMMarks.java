import java.util.Scanner;

public class AveragePCMMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Maths marks: ");
        double mathsMarks = sc.nextDouble();

        System.out.print("Enter Physics marks: ");
        double physicsMarks = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistryMarks = sc.nextDouble();

     
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3;

       
        System.out.println("Sam’s average mark in PCM is " + averageMarks);

        sc.close();
    }
}
