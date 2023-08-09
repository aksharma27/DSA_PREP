package DP;

public class MinOpstoReduceto1 {
    public static void main(String[] args) {
        int x = 93;
        System.out.println(reduce(x));
    }
    static int reduce (int x) {
//        Min number of operations to reduce the given number to 1 : We’re given a number ‘X’ At each step we’re allowed to :
//        i) Decrement the given nmbr by 1 (ii)Decrement by 2 (iii)Divide the nmbr by  7 only if it is divisible by 7
        int[] dp = new int[x+1];
        dp[1] = 0;
        dp[2] = 1;
        int i = 3;
        while (i <= x) {
            if (i % 7 == 0) {
                dp [i] = Math.min(Math.min(dp[i-1] +1, dp[i-2] + 1), dp[i/7]+1);
            } else {
                dp[i] = Math.min (dp[i-1]+1, dp[i-2]+1);
            }
            i++;
        }
        return dp[x];
    }
}
