package Sorting;
import java.util.ArrayList;

public class MoveZerosToEndArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {1,0,-2,3,0,4,8,6,10,12};
        int n = arr.length;
    
        for(int i= 0;i<n;i++){
            if(arr[i] != 0){
                ans.add(arr[i]);
            }

        }
        System.out.println(ans);

    }
    
}
