package Arrays;
public class MissingInArray {
    public static void main(String[] args) {
        
        int [] arr = {8,2,4,5,3,7,1};


        int  n = arr.length + 1;

       int sum = n*(n+1) /2;
       int ArraySum = 0;

       for (int i : arr) {
        ArraySum += i;
       }

       System.out.println(sum-ArraySum);



    }
    
}
