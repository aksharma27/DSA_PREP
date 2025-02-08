package DP;

public class GoogleSDE3 {
//    Q) given a Number N, we can reduce it
//    by 1 in y dollars, or divide it by  3 in x dollars, or div by 5 in z dollars, or divide by 7 in b dollars. Find the min way to reach 1.

    public static void main(String[] args) {
        System.out.println(minWays(15, 100, 50, 85, 1));
    }

    static int minWays (int n, int y, int x, int z, int b) { //y -1, /3-x, /5-z, /7-b
        int[] dp = new int[n + 1];
//        int[]
        dp[1] = 0;
        int i = 2;
        while (i <= n) {
            int v1 = dp[i - 1] + y;
            int v2 = Integer.MAX_VALUE;
            int v3 = Integer.MAX_VALUE;
            int v4 = Integer.MAX_VALUE;
            if (i % 3 == 0) {
                v2 = dp[i / 3] + x;
            }
            if (i % 5 == 0) {
                v3 = dp[i / 5] + z;
            }
            if (i % 7 == 0) {
                v4 = dp[i / 7] + b;
            }
            dp[i] = Math.min(v1, Math.min(v2, Math.min(v3, v4)));
            i++;
        }
        return dp[n];
    }
}
