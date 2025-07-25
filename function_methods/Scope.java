package function_methods;

public class Scope {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        {
          //  int a = 14; //already initialized outside the block
            a = 17; //reassigned the reference variable to some other value
            System.out.println(a);
            int c = 16; //initialized inside the block will remain inside the block but can chnge the value

        }
        System.out.println(a);
//        System.out.println(c); //cannot print c outside the block
    }
}
