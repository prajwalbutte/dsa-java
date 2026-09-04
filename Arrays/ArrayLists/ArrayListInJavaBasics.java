package Arrays.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(20);
        arr.add(18);
        arr.add(34);
        arr.add(76);
        arr.add(10);


        System.out.println(arr.get(3));  //arr[2]

        arr.set(0, 2); //arr[0] = 2;


        System.out.println(arr);


        int n = arr.size(); // arr.length;


        for (Integer integer : arr) {
            System.out.print(integer+ " ");
            
        }

        for(int i = 0 ; i<n ; i++){
            System.out.print(arr.get(i)+ " ");
        }

        arr.add(78);
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);


        arr.remove(arr.size()-1); // not used n becoz it got increased
        System.out.println(arr);



        Collections.reverse(arr);
        System.out.println(arr);

    }
}
