package Hashing;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashSet;
import java.util.Set;

public class TotalRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,1,4,1,6};
        System.out.println(findRepeating(arr, 3));
    }
    static int findRepeating (int[] arr, int k) {
        int ans = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) ans++;
            else set.add(arr[i]);
            if (i - k + 1 == 0) {
                set.remove(arr[i - k + 1]);
            }
        }
        return ans;
    }
}
