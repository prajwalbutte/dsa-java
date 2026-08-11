package Arrays;

public class SecondMaximumElementInTheArray {
    public static void main(String[] args) {
        
        int[] nums = {2,3,10,10,4,8};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                max = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max && nums[i]!=max){
                secondMax = nums[i];
            }
        }
        System.out.println("Second Maximum Element is "+secondMax);
       
    }
    
}
