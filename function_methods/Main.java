package function_methods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Sum();
    int number = Sum2(12,34);
        System.out.println(number);
    }

    /*

     return_types name(){
         // body
         return statement
      }

     */

     static int Sum2(int n1,int n2){
         return n1+n2;
     }

       static void Sum(){
            Scanner in = new Scanner(System.in);
            int num1, num2, sum;
            System.out.print("Enter num1: ");
            num1 = in.nextInt();
            System.out.print("Enter Num2: ");
            num2 = in.nextInt();
            sum = num1 + num2;
            System.out.println("Sum is: " + sum);

        }

}
