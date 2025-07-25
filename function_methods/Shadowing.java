package function_methods;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; //line 4 x is shadowed by this
        System.out.println(x);
        fun();
    }


    static void fun(){
        System.out.println(x);

    }

}
