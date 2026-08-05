package Arrays;

public class ProductofArrayElements {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};

        int product = 1;
        for (int i = 0; i < x.length; i++) {
            product = product * x[i];
        }
        System.out.println("Product "+product);
    }
    
}
