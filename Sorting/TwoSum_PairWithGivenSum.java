package Sorting;
import java.util.Arrays;

public class TwoSum_PairWithGivenSum {
    public static void main(String[] args) {

        
        
        int[] arr = {0,-1,2,-3,1};
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        System.out.println();

        int i = 0;
        int j = arr.length -1 ;
        int target = -2;

        while (i<j) {
            if(arr[i]+arr[j] == target){
                
                System.out.println("Target "+target+" found at index "+i+" and "+j);
                break; 
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                System.out.println("Not found");
                break;

            }
            
        }


    
    }
    
}
