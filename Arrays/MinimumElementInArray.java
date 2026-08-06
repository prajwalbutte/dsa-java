package Arrays;

public class MinimumElementInArray {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,6};
        
        int minimum_element = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum_element){
                minimum_element = arr[i];
            }
        }
        System.out.println(minimum_element);
    }
    
}
