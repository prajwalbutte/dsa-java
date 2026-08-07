package Arrays;

public class ArraySearchingLinear {
    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5};

         int target = 1;

         boolean found = false;

         for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                found = true;
                break;
            }

            
           
         }
         if(found == true){
                System.out.println("Array element exist in Array");
            }
            else{
                System.out.println("Not exist!");
            }
    }
    
}
