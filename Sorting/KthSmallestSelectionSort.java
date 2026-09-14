package Sorting;
import java.util.*;

public class KthSmallestSelectionSort {
    public static void main(String[] args) {
        
        int []a = {7,10,4,3,20,15};
        int k = 3;
        int n = a.length;

        for(int i= 0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int minidx = i;

            for(int j = i;j<n;j++){
                if(a[j] < min){
                    min = a[j];
                    minidx = j;

                }
            }
            int temp = a[i];
            a[i] = a[minidx];
            a[minidx] = temp;
        }

        for (int i : a) {
            System.out.print(i+" ");
            
        };
        System.out.println();

        System.out.println(a[k-1]);
        
    }
    
}
