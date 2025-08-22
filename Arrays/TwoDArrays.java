package Arrays;
import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];

        for(int row=0;row<arr.length;row++){
            //for column
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

//        for(int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // Prints a new line after each row
//        }

        System.out.println(Arrays.deepToString(arr));


        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
