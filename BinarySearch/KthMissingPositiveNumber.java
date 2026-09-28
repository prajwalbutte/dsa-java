package BinarySearch;
public class KthMissingPositiveNumber {

    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k = 5;

        int low = 0;
        int high = arr.length - 1;

        while(low<=high){
            int mid = low + (high-low)/2;

            int correctValue = mid + 1;
            int missing = arr[mid] - correctValue;

            if(missing>=k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        int kth = high + 1 + k;
        System.out.println(kth);
    }
}