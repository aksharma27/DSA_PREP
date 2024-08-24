package DP;

public class ReduceTo1 {
    //https://ideone.com/Mctn4Q
//    uber swe interview

    public static void main(String[] args) {
        System.out.println(reduceTo1(11));
    }

    static int reduceTo1 (int n) {
        int[] dp = new int[n + 1];
        dp[1] = 0; dp[2] = 1; dp[3] = 1; dp[4] = 2;
        for (int i = 5; i <= n; i++) {
            int prev1 = dp[i - 1] + 1;
            int prev2 = Integer.MAX_VALUE;
            int prev3 = Integer.MAX_VALUE;
            if (i % 2 == 0) {
                //div by 2 : so go to i/2 th index
                prev2 = 1 + dp[i / 2];
            }
            else if (i % 3 == 0) {
                prev3 = 1 + dp[i / 3];
            }
            dp[i] = Math.min(prev1, Math.min(prev2, prev3));
        }

        return dp[n];
    }

}
