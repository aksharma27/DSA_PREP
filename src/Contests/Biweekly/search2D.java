package Contests.Biweekly;
import java.util.*;

public class search2D {
        public static int subarraySum(int[] nums, int k) {
            //corner cases : if length of array = 0 -> I wil return 0

            //maintain a map<int, int> => map<pref_sum, first_occur>
            //if found same psum => count++;
            //if nums[idx] == k => count++;
            int maxSub = 0;
            int prefix = 0;
            Map<Integer, Integer> psum = new HashMap<>();
            for (int idx = 0; idx < nums.length; idx++) {
                if (nums[idx] == k) maxSub++;

                else {
                    prefix += nums[idx];
                    if (psum.containsKey(prefix)) {
                        maxSub++;
                    } else {
                        if (idx > 0 && prefix - nums[idx-1] == k) maxSub++;
                        if (prefix == k ) maxSub++;
                        psum.put(prefix, idx);
                    }
                }
            }
            return maxSub;
        }

    public static void main(String[] args) {

            int[] n = {1,1,1};
        System.out.println(subarraySum(n, 2));
    }
}
