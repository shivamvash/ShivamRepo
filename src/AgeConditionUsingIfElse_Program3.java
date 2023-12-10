import java.util.Scanner;

public class AgeConditionUsingIfElse_Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the User Age : ");
       int Age= sc.nextInt();

       if (Age>18){

        System.out.println("Adult");
    }
    else{
        System.out.println("Not Adult");
    }

    }
}
