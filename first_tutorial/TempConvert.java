package first_tutorial;
import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temp value: ");
        float temp = input.nextFloat();
        
        System.out.println("----Select temperature 1 or 2----");
        System.out.println("1 - Celcius");
        System.out.println("2 - Farheiniet");
        System.out.println("enter Your choice: ");
        int num = input.nextInt();
        
         
        System.out.println("----Convert it into? Select 1 or 2----");
        System.out.println("1 - Celcius");
        System.out.println("2 - Farheiniet");
        System.out.println("enter Your choice: ");
        int num1;


        if (input.hasNextInt()) {
            num1 = input.nextInt();
            if (num1 != 1 && num1 != 2) {
                System.out.println("Invalid input. Please select 1 for Celsius or 2 for Fahrenheit.");
                input.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter 1 or 2.");
            input.next(); // Consume the invalid input
            input.close();
            return;
        }

        if(num==num1){
            System.out.println("The temperature is already in the selected unit: " + temp + (num == 1 ? " Celsius" : " Fahrenheit"));
        } else if (num == 1 && num1 == 2) {
            float fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Converted Temperature: " + fahrenheit + " Fahrenheit");
        } else if (num == 2 && num1 == 1) {
            float celsius = (temp - 32) * 5 / 9;
            System.out.println("Converted Temperature: " + celsius + " Celsius");
        }


    }
}
