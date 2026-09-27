package BinarySearch;

public class Search_SortedAndRotated_Array {

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,8,9,10,1,2,3};
        int n = arr.length;
        int idx = -1;

        int low = 0;
        int high = n-1;
        int target = 9;

        while(low<=high){
           int mid = (low) + (high - low)/2;

           if(arr[low] <= arr[mid]){
            if(arr[low]<=target && arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
           }
           else{
            if(arr[mid] < target && arr[high]>=target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
           }
        }
       


    }
    
}
