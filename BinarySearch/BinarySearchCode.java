package BinarySearch;

public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        int target = 6;

        int n = arr.length;

        int low = 0;
        int high = n - 1;

        int found = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target)
                high = mid - 1;
            else if (arr[mid] < target)
                low = mid + 1;
            else if (arr[mid] == target) {
                found = 1;
                break;
            }

        }
        if (found != -1) {
            System.out.println("Target Element found!");
        } else {
            System.out.println("Not fo");
        }
    }

}
