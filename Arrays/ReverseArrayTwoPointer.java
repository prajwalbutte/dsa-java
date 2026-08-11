package Arrays;

public class ReverseArrayTwoPointer {
    public static void main(String[] args) {
        
        int[] arr = {6,8,1,2,4,9};
        int n = arr.length;

        int i = 0;
        int j = n-1;

       
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int e : arr){
            System.out.print(e+" ");
        }

        
        
    }
}
