package Arrays;
import java.util.Arrays;

public class SumofElementsWithoutVariable {

    // public static int sum(int[]arr,int index){
    //     if(index == arr.length){
    //         return 0;
    //     }
    //     return arr[index] + sum(arr,index + 1);
    // }
    // public static void main(String[] args) {
    //     // Using Recursion

    //     int [] arr = {1,2,3,4};
    //     System.out.println(sum(arr,0));
    // }

    public static void main(String[] args) {
         int[] x = {1,2,3,4};

         System.out.println(Arrays.stream(x).sum());
    }
}
