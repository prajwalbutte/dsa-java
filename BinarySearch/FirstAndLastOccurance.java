package BinarySearch;

import java.util.ArrayList;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        
        ArrayList<Integer> ans = new ArrayList<>();

        int [] arr = {1,3,5,5,5,5,67,123,125};
        int low1 = 0;
        int low2 = 0;
        int high1 = arr.length - 1;
        int high2 = arr.length - 1;
        int idxf = -1;
        int idxL = -1;
        int target = 5;
        // int target = 55;

        while(low1<=high1){
            int mid = (low1+high1)/2;

            if(arr[mid]< target){
                low1 = mid + 1;
            }
            else if(arr[mid]> target){
                high1 = mid -1;
            }
            else{
                idxf = mid;
                high1 = mid - 1;
            }
        }
        while(low2<=high2){
            int mid = (low2+high2)/2;

            if(arr[mid]< target){
                low2 = mid + 1;
            }
            else if(arr[mid]> target){
                high2 = mid -1;
            }
            else{
                idxL = mid;
                low2 = mid + 1;
            }
        }
        ans.add(idxf);
        ans.add(idxL);
        System.out.println(ans);
    }
    
}
