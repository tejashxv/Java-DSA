package function_methods;
import java.util.*;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,4,5,6,7,8,9);
        multi(2,3,"A","B");
    }

    static void multi(int a, int b, String ...v){ //variable length args always called at the end
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }

//    static void fun(int ...a){
//        System.out.println(Arrays.toString(a));
//    }
}
