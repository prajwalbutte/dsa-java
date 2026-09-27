package BinarySearch;
public class InsertPosition {
    public static void main(String[] args) {

        int arr[] = {1,3,5,6,10,12,16};
        int target = 11;

        int low = 0;
        int high = arr.length - 1;
        int found = -1;
        int insert = -1;

        while(low<=high){
            int mid = (low) + (high - low)/2;

            if(arr[mid] == target){
                found = mid;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        if(found!= -1){
            System.out.println("Target element found at"+ found);
        }
        else{
            System.out.println("Position"+ low);
        }
        
    }
    
}
