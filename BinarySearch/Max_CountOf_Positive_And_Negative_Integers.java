package BinarySearch;

public class Max_CountOf_Positive_And_Negative_Integers {

    public static void main(String[] args) {

        int[] arr = {-5,-4,-3,-1,0,0,0,1,2,3,4,5,6};

        int n = arr.length;

        int low = 0;
        int high = n - 1;

        int negcount = 0;
        int pos_count = 0;

        // Count negative numbers
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= 0) {
                // Go left
                high = mid - 1;
            }
            else {
                // All elements from 0 to mid are negative
                negcount = mid + 1;
                low = mid + 1;
            }
        }

        // RESET low and high
        low = 0;
        high = n - 1;

        // Count positive numbers
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] <= 0) {
                // Go right
                low = mid + 1;
            }
            else {
                // All elements from mid to n-1 are positive
                pos_count = n - mid;
                high = mid - 1;
            }
        }

        System.out.println("Positive = " + pos_count);
        System.out.println("Negative = " + negcount);
    }
}