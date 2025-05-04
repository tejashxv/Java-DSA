import java.util.Arrays;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter num: ");

            // Validate input
            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                return;
            }
            int num = input.nextInt();

            // Check for valid array size
            if (num < 2) {
                System.out.println("Please enter a number greater than or equal to 2.");
                return;
            }

            // Create Fibonacci array
            int[] arr = new int[num];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < num; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

            System.out.println("Fibonacci Sequence: " + Arrays.toString(arr));
        } finally {
            input.close();
        }
    }
}