package loops_conditions;

public class Count {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,6,7,6,9};
//        int count = 0;
//        int tag = 6;
//        for(int i = 1;i<arr.length;i++){
//            if(arr[i] == tag){
//                    count++;
//            }
//
//        }
//            System.out.println(count);



        //checking repeating element
       /*
        int a = 123447;
        boolean[] seen = new boolean[10];
        while(a>0){
            int rem = a % 10;
            if(seen[rem]){
                System.out.println("rep element is " + rem);
                break;
            }
            seen[rem] = true;
            a = a/10;
        }

        */



        //counting repeated numbers
        /*
        int a = 123447;
        int[] freq = new int[10];
        while(a>0){
            int rem = a % 10;
            freq[rem]++;
            a = a/10;
        }
        for(int i =0;i<freq.length-1;i++){
            if(freq[i] > 1){
                System.out.println(i+" occured "+freq[i]+" times");
            }
        }

         */



        //reverse number

        int n = 213456789;
        int ans = 0;
        while(n>0){
            int r = n % 10;
//            System.out.print(r);
            n = n /10;
            ans = ans * 10 + r;
        }
        System.out.println(ans);




    }
}
