package function_methods;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();

        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int choice = in.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        in.close();
    }

    // Function for addition
    static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    static double divide(double a, double b) {
        return a / b;
    }
}
