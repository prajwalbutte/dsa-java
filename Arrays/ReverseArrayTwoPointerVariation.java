package Arrays;
public class ReverseArrayTwoPointerVariation{
    public static void main(String[] args) {
        
        int []arr = {3,19,56,9,83,18,24,35,14};

        int i = 2;
        int j = 5;

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