package Sorting;

public class CheckIfSorted {
    public static void main(String[] args) {

        int flag = -1;
        int arr[] = {-1,0,1,2};
        for (int i = 0;i<arr.length-1;i++) {
            if(arr[i] > arr[i+1]){
                flag = 1;
            }

        }
        if(flag == 1){
            System.out.println("Array is Not sorted");
        }
        else{
            System.out.println("Array is sorted");
        }
    }
    
}
