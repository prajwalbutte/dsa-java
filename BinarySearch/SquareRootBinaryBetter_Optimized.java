package BinarySearch;

public class SquareRootBinaryBetter_Optimized {
    public static void main(String[] args) {
        
        int n = 11;

        int low = 1;
        int high = n;
        int root = 0;

        while(low<=high){
            int mid = low + (high - low) / 2;

            if(mid == n/mid){
                root = mid;
                break;
            }
            else if(mid > n/mid){
                high = mid - 1;
            }
            else{
                low = mid + 1;  
            }

        }
        System.out.println(root);
    }
    
}
