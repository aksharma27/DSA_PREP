package TwoPointers;

import java.util.*;

public class FlipkartOAMaxSubarrayDistinctNum {
//    Q :-  Given an array of size “N”; find the longest subarray which has all distinct number in it
//
//    B = [ 3 2 4 5 2 6 7 8 9 10]
//
//    O/P - 8

    //BRUTE FORCE : using nested for loops : check index 1, check max subarray from idx 1, from idx2 check max subarray from2 and so on, return the max subarray

//    OPTIMAL : in one iteration, store all elements in a hashmap + initial occur idx
//        if somewhere in the iteration, there is already one occurence of that index, do i++ and increment the update the first occurence of that element with current index value

//    code
    static int findMaxSubarrayWithDistinct (int[] arr, int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int max = 0;
        int i = 0, j = 0;       //left, right pointers resp
        Map<Integer, Integer> idx = new HashMap<>();
        while (i < n && j < n) {
            if (!idx.containsKey(arr[j])) {
                idx.put(arr[j], j);
                int len = j - i + 1;
                max = Math.max(len, max);
                j++;
            } else {
                int index = idx.get(arr[j]);
                //increment i till first occurence of a[j] i.e, index ;
                while (i <= index) {
                    idx.remove(arr[j]);
                    i++;
                }
                i = index + 1;
                idx.put(arr[j], j);
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2,6,7,8,9,10};
        System.out.println(findMaxSubarrayWithDistinct(arr, arr.length));
    }
}
