package function_methods;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
//       String name = "Tejash";
//        change("Tejash");
//        System.out.println(name);

        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
//
//    static void change(String name){
//        name = "Aditi";
//    }

    static void change(int[] array){
        array[0] = 100;

    }

}
