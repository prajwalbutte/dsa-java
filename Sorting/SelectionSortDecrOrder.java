package Sorting;

public class SelectionSortDecrOrder {

    public static void main(String[] args) {

        int[] arr = {8, 4, 1, 9, -3, 6, 5};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int max = arr[i];
            int idx = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}