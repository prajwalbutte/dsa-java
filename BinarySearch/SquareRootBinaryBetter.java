package BinarySearch;

public class SquareRootBinaryBetter {
    public static void main(String[] args) {
        
        int x = 16;
        int low = 0;
        int high = x;
        int root = 0;

        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid == x){
                root = mid;
                break;
                
                
                
            }
            else if(mid*mid > x){
               high = mid - 1;
            }
            else{
                low = mid + 1;
                
                
            }
        } 
        System.out.println(root);
    }
    
}
