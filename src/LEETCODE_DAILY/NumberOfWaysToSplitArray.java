package LEETCODE_DAILY;

public class NumberOfWaysToSplitArray {
    public static int waysToSplitArray(int[] nums) {
        //take the psum array :
        int n = nums.length;
        int[] psum = new int[n];

        for (int i = 0; i < n; i++){    ///calculate psum
            psum[i] = i == 0 ? nums[i] : psum[i - 1] + nums[i];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;
            if (i < n - 1) {
                leftSum = psum[i];
                rightSum = psum[n - 1] - leftSum;
                if (leftSum >= rightSum) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//              System.out.println(waysToSplitArray(ar));
    }
}