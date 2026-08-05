package Arrays;

public class MaximumElementInArray {

    public static void main(String[] args) {
        
        int [] x = {1,2,7,4,32};
        int maximum_element = x[0];

        for (int i = 0; i < x.length; i++) {
            if(x[i]>maximum_element){
                maximum_element = x[i];
            }
            
        }
        System.out.println(maximum_element);
    }
}