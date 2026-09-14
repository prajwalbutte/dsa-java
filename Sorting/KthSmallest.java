package Sorting;
import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {
        
        int []a = {7,10,4,3,20,15};
        int k = 3;

        Arrays.sort(a);

         System.out.print(a[k-1]);
        
    }
    
}
