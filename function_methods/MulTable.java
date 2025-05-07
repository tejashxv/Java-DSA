package function_methods;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        printtable(num);
    }
    static void printtable(int a){
        for(int i = 1;i<=10;i++){
            System.out.println(a + "x" + i + "=" + a*i);
        }
    }
}
