package Arrays;
import java.util.*;


public class Arrays1 {
    public static void main(String[] args) {
      int[] arr = new int[5];
      for(int i = 1;i<arr.length;i++){
          arr[i] = i;
        }
      for(int j = 0;j< arr.length;j++){
          System.out.println(arr[j]);
      }

        // directly
        int[] rollno = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rollno));
    }
}
