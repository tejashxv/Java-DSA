package loops_conditions;

public class Largest {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 30;
//        if(a > b && a >c){
//            System.out.println(a + " is greater");
//        }else if(b>a && b >c){
//            System.out.println(b + " is greater");
//
//        }else{
//            System.out.println(c + " is greater");
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
