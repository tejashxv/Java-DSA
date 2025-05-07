package function_methods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sum();
        int a =Sum1();
        System.out.println("Return value is: " + a);
    }

   static int Sum1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
        return sum;
    }

    static void Sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);

    }



    /*

     return_types name(){
         // body
         return statement
      }

     */

}
