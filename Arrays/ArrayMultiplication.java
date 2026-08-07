package Arrays;
public class ArrayMultiplication{
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7,8};

        //Multiply Array element with odd index 2 and 10 by even

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

            if(i%2==0){
                System.out.print(arr[i]*10 +" ");
            }
            else{
                System.out.print(arr[i]*2 +" ");
            }
        }
        
     
    }
}