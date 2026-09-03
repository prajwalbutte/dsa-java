package Arrays;

public class WaveArray {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};  // Expected output {2,1,4,3,5}

        int n = arr.length;

        for(int i = 0;i<=n;i+=2){
            if(i == n-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
            
        }

    }
    
}
