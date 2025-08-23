package Arrays;

public class MaxVal {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,9,32,876,5467,56745,3,3245,6634,563,563,667,7,3,6,7};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
