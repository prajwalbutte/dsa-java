package BinarySearch;
public class Peak_Element_Of_Array {
    public static void main(String[] args) {
        
        int[]arr = {-1,0,1,2,3,5,6,8,-6,3 };

        int n = arr.length;
        int low = 1;
        int high = n-2;
        int peakidx = -1;

        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]){
                peakidx = mid;
                break;
            }
            else{
                low = mid+1;
            }
            
        }
        System.out.println(peakidx);
    
}
}
