package DP;

public class Jump12K {
//    https://atcoder.jp/contests/dp/tasks/dp_b


//(IMP)5) N stones, from 1  to n, having heights, min cost a frog can make to make to go to Nth step, if he can jump either 1 or 2 or 3 or … k stones at time. K is an integer
public static void main(String[] args) {
    int[] ar = {10, 30, 40, 50, 20};
    int n = ar.length;
    int k = 3;
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 0;
    for (int i = 2; i <= n; i++) {
        int min = Integer.MAX_VALUE;
        for (int j = 1; j <= k && i - j > 0; j++) {
//            if (i - j >= 1) {
                min = Math.min(min, dp[i - j] + Math.abs(ar[i - 1] - ar[i - j - 1]));
//            }
        }
        dp[i] = min;
    }
    System.out.println(dp[n]);
}
}
