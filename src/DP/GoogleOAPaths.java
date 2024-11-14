package DP;

public class GoogleOAPaths {



    //    Q) Given an array of size N. we start from 0 and end at n-1. can make jumps of size 1, 3, & 5. Array has
//    positive as well as negative nos. find the max sum of the journey.
    public static void main(String[] args) {
        int[] arr = {1, -3, -8, -5, -10, 100, -5, 8};
        System.out.println(findMax(arr, arr.length));

    }

    static int findMax (int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1] + arr[0];
        dp[2] = arr[2] + dp[1];
        dp[3] = Math.max(arr[3] + dp[3-3], arr[3] + dp[3-1]);
        dp[4] = Math.max(arr[4] + dp[4 - 3], arr[4] + dp[4 - 1]);

        for (int i = 5; i < n; i++)  {
            dp[i] = Math.max(dp[i - 1] + arr[i], Math.max(dp[i - 3] + arr[i], dp[i - 5] + arr[i]));
        }
        return dp[n - 1];
    }
}
