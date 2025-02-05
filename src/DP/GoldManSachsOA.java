package DP;

public class GoldManSachsOA
{
//    https://www.desiqna.in/13008/goldman-sachs-sde-oa-ctc-30-lac-2023-dp
    public static void main(String[] args) {
        int[] ar = {2,10,8,-5,10, 5};
        System.out.println(findMax(ar));
    }

    static int findMax (int[] ar) {
        int n = ar.length;

        int dp[][] = new int[n + 2][7];
//        1 => backward
//        2 => forwared

        dp[0][2] = ar[0];   //forward
        dp[0][1] = Integer.MAX_VALUE;
        dp[1][2] = Integer.MAX_VALUE;
        dp[1][1] = dp[0][2] + ar[1] + ar[2];        //i-1 -> i+1 -> i

        int i = 2;
        while (i < n) {
            dp[i][2] = ar[i] + Math.min(dp[i - 2][1], dp[i-2][2]);
            dp[i][1] = ar[i] + ar[i + 1] + dp[i - 1][2];

            i++;
        }
        dp[n][2] = ar[n-1] + Math.min(dp[i - 2][2], dp[i - 2][1]);
        dp[n][1] = Integer.MAX_VALUE;       //since dp[n][backward] not possible : as n+1 does not exists, so i cannot come from i+1 to i
        return (int) Math.min(dp[n][2], Math.min(dp[n-1][2], dp[n-1][1]));
    }
}
