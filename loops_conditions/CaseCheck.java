package loops_conditions;
import java.util.Scanner;


public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter char");
         String c = input.next();
        System.out.println(c.trim());
         char ch = c.charAt(0);
         System.out.println(Character.isLowerCase(ch));
         System.out.println(ch);

    }
}
