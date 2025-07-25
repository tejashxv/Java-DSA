package function_methods;
import java.util.*;

public class Qna {
    public static void main(String[] args) {
        //prime num
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num:");
        int num = sc.nextInt();
//        Isprime(num);
//        IsPalindrome(num);
          IsArmstrong(num);
    }
    static void Isprime(int num){


        boolean isPrime = true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("its prime");
        }else{
            System.out.println("not");
        }
    }

    static void IsPalindrome(int num){
        int temp = num;
        int n = 0;
        while(num > 0){
            int rem = num % 10;
            n = (n*10) + rem;
            num = num / 10;
        }
        System.out.println(n);
        if(n==temp){
            System.out.println("it is pal");
        }else{
            System.out.println("it is not pal");
        }
    }

    static void IsArmstrong(int num){
        int len = String.valueOf(Math.abs(num)).length();
        int temp = num;
        double new_num = 0;
        while(num>0){
            int rem = num%10;
            System.out.println(rem);
            new_num = new_num + Math.pow(rem,len);
            num = num/10;

        }
        int n = (int) new_num;
        System.out.println(n+" "+temp);
        if(n==temp){
            System.out.println("it is armstrong");
        }else{
            System.out.println("it is not");
        }
    }

}
