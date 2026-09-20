package BinarySearch;

public class SquareRoot {

    public static void main(String[] args) {
        
        int n = 11;
        int root = 0;
        for (int i = 0; i <=n; i++) {
            if(i*i > n) break;
            root = i; 
            
        }
        System.out.println(root);
    }
    
}
