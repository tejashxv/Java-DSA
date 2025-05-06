package Switch;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Employee number: ");
        int e_no = in.nextInt();

        System.out.print("Enter Emp. Department: ");
        in.nextLine();
        String dep = in.nextLine().toLowerCase();

        switch(e_no) {
            case 1:
                System.out.println("Employee: Tejash Yadav");
                break;
            case 2:
                System.out.println("Employee: Aditi Kauser");
                break;
            case 3:
                System.out.println("Employee: ID 3");
                switch(dep) {
                    case "it":
                        System.out.println("Department: IT");
                        break;
                    case "management":
                        System.out.println("Department: Management");
                        break;
                    default:
                        System.out.println("Unknown Department");
                }
                break;
            default:
                System.out.println("Invalid Employee Number");
        }

        in.close();
    }
}
