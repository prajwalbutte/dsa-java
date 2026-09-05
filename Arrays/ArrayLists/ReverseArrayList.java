package Arrays.ArrayLists;
import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        

        System.out.println(arr);

        int i = 0 ;
        int j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }

        System.out.println(arr);

        

        

    }
}
