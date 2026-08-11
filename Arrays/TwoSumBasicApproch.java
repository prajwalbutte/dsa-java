package Arrays;

public class TwoSumBasicApproch {
    public static void main(String[] args) {
        
        int []nums = {1,5,8,-3};
        int target = 2;

         for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    System.out.println("Target "+target+" found at indexes "+i+" "+j);

                }
            }
         }
        
    }
    
}
