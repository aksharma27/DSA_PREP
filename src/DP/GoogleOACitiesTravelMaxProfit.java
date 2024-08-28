package DP;
import java.util.*;

//You work as a consultant and have clients in cityA and cityB. On a given day,
//        say i, you can either
//        work in cityA and make Ai dollars or you can work in cityB and make Bi dollars. You can also spend
//        the day traveling between cityA and cityB in which case your earnings that day are 0.
//
//
//
//        Given Al,A2, ....An and B1, B2,....., Bn, return a schedule S of N days which maximizes your earnings,
//        You can start either in cityA or cityB.
//
//        You need to print the final maximum earning
//
//        Example1: A = [23, 4,5 ,101] B = [21,1,10, 100] The optimal schedule S here would be ->"ATBB"
//        Example 2:
//        A[25,10,15,10,70] B = [5,5,50,5,30] The optimal schedule S here would be-> "ATBTA"
//
//        Follow up :-> solve the problem for 3 cities A,B,C

//Dollars are positive.
public class GoogleOACitiesTravelMaxProfit {
    public static void main(String[] args) {
        int[] a = {23, 4, 5, 101};
        int[] b = {21, 1, 10, 100};
        System.out.println(findMaxProfit(a, b));
    }
    static int findMaxProfit (int[] A, int[] B) {
        int n = A.length;
        int[][] dp = new int[n][2];
        dp[0][0] = A[0];
        dp[0][1] = B[1];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0] + A[i], dp[i - 1][1] + A[i]);
            dp[i][1] = Math.max(dp[i - 1][0] + B[i], dp[i - 1][1] + B[i]);
        }
        return (int)Math.max(dp[n - 1][0], dp[n - 1][1]);
    }
}
