package Arrays;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {

        int [] arr = {1,2,4,5};

        // int sum = Arrays.stream(arr).sum();
        // System.out.println(sum);

        // int product = 1;
        // for(int i = 0;i<arr.length;i++){
        //     product *= arr[i];
        // }
        // System.out.println(product);

        // int max = arr[0];
        // int min = arr[0];
        // System.out.println(max);

        // for ( int i = 0; i < arr.length; i++) {
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        //     if(arr[i] < min){
        //         min = arr[i];

        //     }
        // }
        // System.out.println(max);
        // System.out.println(min);

        // for (int i = 0; i < arr.length; i++) {
        //     if(i % 2 == 0){
        //         arr[i] *= 10 ;
        //     }
        //     if(i % 2 != 0){
        //         arr[i] *= 2;
        //     }

        // }
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        // int target = 3;
        // int found = -1;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == target) {
        //         found = 1;
        //         break;
        //     }
            
        // }

        // if(found == 1){
        //     System.out.println("Found");
        // }
        // else{
        //     System.out.println("Not found");
        // }

        // int sum = 3;
        // for (int i = 0; i < arr.length; i++) {
        //     for(int j = i+1;j<arr.length-1;j++){
        //         if(arr[i]+arr[j] == sum){
        //             System.out.println(i+" "+j);
        //         }
        //     }
        // }

        int max = arr[0];
int secondMax = Integer.MIN_VALUE;

// Find maximum
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}

// Find second maximum
for (int i = 0; i < arr.length; i++) {
    if (arr[i] > secondMax && arr[i] != max) {
        secondMax = arr[i];
    }
}

System.out.println(secondMax);
    



        

    }
    
}
