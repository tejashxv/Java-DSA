package function_methods;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number to check even odd: ");
        int num = in.nextInt();
        CheckEvenOdd(num);
    }

    static void CheckEvenOdd(int a){
        if(a % 2 == 0){
            System.out.println("it is even");

        }else{
            System.out.println("it is odd");
        }
    }
}
