package Stack;
import java.util.*;

//Q) Given an array of size “N” ; find the next greater element of each element of the array on the right hand side!


public class NextGreaterElements {
    public static void main(String[] args) {
        int[] arr = {6,5,80,90, 10, 100, 200};
        System.out.println(greaterRight(arr, arr.length));

    }

    static List<Integer> greaterRight (int[] arr, int n) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);
        int i = n - 2;
        while (i >= 0) {
            if (st.peek() > arr[i]) {
//                System.out.println(st.peek() + " " + arr[i]);
                //top element is the next right max element
                ans.add(st.peek());
                st.push(arr[i]);
            }
            else {
//                System.out.println(st.peek() + " " + arr[i]);
                while (!st.isEmpty() && st.peek() >= arr[i]) st.pop();
//                System.out.println(st.peek() + " " + arr[i]);
                if (!st.isEmpty()) ans.add(arr[i]);
                else ans.add(-1);
                st.push(arr[i]);    //push curr element, possible greater element for the next left element in the array
            }
            i--;
        }
        return ans;
    }
}
