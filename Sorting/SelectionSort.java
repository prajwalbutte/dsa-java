package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 8, 4, 1, 9, -3, 6, 5 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallest = arr[i];
            int index = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    index = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
       
    }

}
