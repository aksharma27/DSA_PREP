package Hashing;
import java.util.*;

public class SubArrayWithSumK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int prefix = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if (prefix == k) count++;

            if (freq.containsKey(prefix - k)){
                count += freq.get(prefix-k);

            }
            freq.put(prefix, freq.getOrDefault(prefix, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(subarraySum(arr, 2));
    }
}
