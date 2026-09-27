package Sorting;

public class BinaryArray_Sorting {
    public static void main(String[] args) {
        
        int arr[] = {1,0,1,1,0}; // 0,0,1,1,1

        int i = 0;
        int j = arr.length - 1;

        while(i<j){
            if(arr[i] == 0){
                i++;
            }
            else if(arr[j] == 1){
                j--;
            }
            else{ //arr[i] = 1 and arr[j] = 0 swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }
        for (int ele : arr) {
            System.out.print(ele+" ");
            
        }


    }
    
}
