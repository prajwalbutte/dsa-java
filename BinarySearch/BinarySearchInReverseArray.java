package BinarySearch;

public class BinarySearchInReverseArray {
    public static void main(String[] args) {
        
        int arr [] = {5,4,3,2,1};
        int target = 4;
        boolean found = false;

        int  low = 0;
        int high = arr.length - 1;

       while(low<=high){
        int mid = (low+high)/2;

        if(arr[mid] == target){
            found = true;
            break;
        }
        else if(arr[mid]<target){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }


       }
       if(found == true){
        System.out.println("Target found");
       }
       else{
        System.out.println("Not found");
       }

    }
    
}
