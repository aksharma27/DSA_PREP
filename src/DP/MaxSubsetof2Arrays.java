package DP;

public class MaxSubsetof2Arrays {
    public static void main(String[] args) {
        int[] a1 = {1,5,3,21234};
        int[] a2 ={-4509,200,3,40};
        int dp[] = new int[4];
        dp[0] = 1;
        dp[1] = 200;

        for (int i = 2; i < 4; i++) {
            dp[i] = Math.max(Math.max(a1[i], a2[i]) + dp[i-2], dp[i-1]);
        }
        System.out.println(dp[3]);
    }
}
