package DP;

public class Jump1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 10; arr[2] = 20; arr[3] = 400; arr[4] = 20;
        System.out.println(minJumps(arr));
    }
    static int minJumps (int[] heights) {
        int n = heights.length;
        int[] dp = new int[n+1];
        dp[1] = heights[1];
        dp[2] = Math.abs(heights[1]-heights[2]);
        for (int idx = 3; idx <= n;idx++) {
            dp[idx] = Math.min(Math.abs(heights[idx]-heights[idx-1]) + dp[idx-1], Math.abs(heights[idx] - heights[idx-2]) + dp[idx-2]);
        }
        return dp[n];
    }
}
