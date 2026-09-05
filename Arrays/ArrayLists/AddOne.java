
package Arrays.ArrayLists;

import java.util.Vector;

public class AddOne {

    Vector<Integer> addOne(int[] arr) {

        Vector<Integer> ans = new Vector<>();

        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {

            int sum = arr[i] + carry;

            ans.add(sum % 10);
            carry = sum / 10;
        }

        if (carry == 1) {
            ans.add(1);
        }

        // Reverse the answer because we processed from right to left
        Vector<Integer> result = new Vector<>();

        for (int i = ans.size() - 1; i >= 0; i--) {
            result.add(ans.get(i));
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {9, 9, 9};

        AddOne obj = new AddOne();

        Vector<Integer> result = obj.addOne(arr);

        System.out.println(result);
    }
}

