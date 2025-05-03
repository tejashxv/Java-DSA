package first_tutorial;
import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter number to add:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("addition of num1 and num2: " + (num1+num2));
    }
}
