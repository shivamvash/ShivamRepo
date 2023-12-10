import java.util.Scanner;
public class ConditionGreaterLess_Prog5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter The First Number");
        float Num1= sc.nextFloat();

        System.out.println("Enter The Second Number");
        float Num2= sc.nextFloat();

        if (Num1==Num2){
            System.out.println("Both Numbers are Equal Number");
        }
            else {
                if (Num1>Num2){
                    System.out.println("First Number is Greater");
                }
                    else {
                    System.out.println("First Number is Less");
            }

        }
    }
}
