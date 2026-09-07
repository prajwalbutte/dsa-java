package Arrays;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {

        int [] arr = {1,3,4,5};

        // int sum = Arrays.stream(arr).sum();
        // System.out.println(sum);

        // int product = 1;
        // for(int i = 0;i<arr.length;i++){
        //     product *= arr[i];
        // }
        // System.out.println(product);

        int max = arr[0];
        int min = arr[0];
        System.out.println(max);

        for ( int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);

        

    }
    
}
