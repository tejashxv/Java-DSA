package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[arr.length];

        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            arr2[j] = arr[i];
        }
        System.out.print(Arrays.toString(arr2));
    }
}
