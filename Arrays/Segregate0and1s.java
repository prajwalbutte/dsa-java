package Arrays;

public class Segregate0and1s {
    public static void main(String[] args) {
        

        int [] arr = {0,0,1,1,0,0,1,2,0};
        int zeros = 0;
        int ones = 0;

        for(int ele : arr){
            if(ele == 0){
                zeros++;
            }
            if(ele == 1){
                ones++;
            }
        }

        for(int i = 0;i<zeros;i++){
            arr[i] = 0;
        }

        for(int i = zeros;i<arr.length;i++){
            arr[i] = 1;
        }


        for (int i : arr) {
            System.out.print(i+" ");
        }





    }
    
}
