package Switch;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = in.nextLine();

      /*  if(str.equals("tejash")){
            System.out.println("names is tejash");
        }

       */


         switch (str){
             case "tejash":
                 System.out.println("names is tejash");
                 break;
             case "aditi":
                 System.out.println("names aditi");
                 break;
             default:
                 System.out.println("name notrhingf");
         }


        System.out.print("Enter Day: ");
         int day = in.nextInt();
         switch (day){
             case 1 -> System.out.println("Monday");
             case 2 -> System.out.println("tuesday");
             case 3 -> System.out.println("wednesday");
             case 4 -> System.out.println("thursday");
             case 5 -> System.out.println("friday");
             case 6 -> System.out.println("saturday");
             case 7 -> System.out.println("sunday");
             default -> System.out.println("nothing");
         }


         switch(day){
             case 1,2,3,4,5 -> System.out.println("it is weekday");
             case 6,7 -> System.out.println("weekend");
             default -> System.out.println("none");
        }


        //nested switch case


    }
}
