package Arrays;

public class PrintNegativeNumbers {
    public static void main(String[] args) {
        int[] x = {1,3,4,-4,-27,-3,8};
    
        for(int i=0;i<x.length;i++){
            if(x[i]<0){
                System.out.println(x[i]+ " ");
            }
        }
        
    }
}
