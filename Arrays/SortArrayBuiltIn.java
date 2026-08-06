package Arrays;
import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {4,1,6,2,3,9,-3};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
}
