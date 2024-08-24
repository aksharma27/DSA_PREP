package Contests.POTD;
import java.util.*;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] num) {
        int[] nums = {1,2,3,4};
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int n = nums.length;
        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
            System.out.println(prefix[i]);
        }
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
            System.out.println(suffix[i]);
        }
        // System.out.print(Arrays.toString(prefix) );
        // System.out.print(Arrays.toString(suffix));
        return prefix;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

    }
}
