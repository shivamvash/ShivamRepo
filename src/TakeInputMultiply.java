import java.util.Scanner;  // Ye Package - Group of code hota hai jisko hum use karte hai scanner class use krte time..

public class TakeInputMultiply {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); // Scanner Class use ki hai User se Input lete time.!

        System.out.println("Enter First Number");
        int a = sc.nextInt();  // User jo input dalega wo es format me save hoga.!

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int sum=a*b;

        System.out.println(sum);

    }
}
