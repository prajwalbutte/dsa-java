package BinarySearch;

public class Floor_In_Sorted_Array {
    public static void main(String[] args) {
        
        int [] arr = {1,2,4,10,10,19};
        int n = arr.length;
        int target = 5;

        int low = 0;
        int high = n - 1;
        int idxfloor = -1;

        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]>target){
                high = mid - 1;
                
                
            }
            else{
                idxfloor = mid;
                low = mid + 1;
                
            }
            
            
           
        }
        System.out.println(idxfloor);

        if(idxfloor == -1 ){
            System.out.println("Floor not exist!");
        }
    }
    
}
