package DP;

public class GoogleSDE3 {
//    Q) given a Number N, we can reduce it
//    by 1 in y dollars, or divide it by  3 in x dollars, or div by 5 in z dollars, or divide by 7 in b dollars. Find the min way to reach 1.

    public static void main(String[] args) {
        System.out.println(minWays(15, 100, 1, 50, 100000));
    }

    static int minWays (int n, int y, int x, int z, int b) {
        int[] dp = new int[n + 1];
//        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;

        for (int i = 2; i <= n; i++) {
            int a1 = dp[i-1] + y;
            int a2 = Integer.MAX_VALUE;
            int a3 = Integer.MAX_VALUE;
            int a4 = Integer.MAX_VALUE;

            if (i % 3 == 0)
                a2 = dp[i / 3] + x;
            if (i % 5 == 0)
                a3 = dp[i / 5] + z;
            if (i % 7 == 0)
                a4 = dp[i / 7] + b;
            dp[i] = Math.min(a1, Math.min (a4, Math.min(a3, a4)));
        }
        return dp[n];
    }
}
