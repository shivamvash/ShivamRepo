
import java.util.Scanner;
public class EvenOddCondition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number : ");
        float Num= sc.nextFloat();

        if (Num%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
