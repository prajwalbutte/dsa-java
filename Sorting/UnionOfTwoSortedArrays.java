package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,6,7};

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0 , j=0;

        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]<a[j]) {
                ans.add(a[i]);
                ans.add(b[j]);
                i++;
                j++;
                       
            }
            else{
                ans.add(b[j]);
                ans.add(a[i]);
                 i++;
                j++;
                


            }
            
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
    
}
