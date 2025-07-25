package function_methods;

public class OverLoading {
    public static void main(String[] args) {
        fun(1);
        fun("A");

    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }



}
