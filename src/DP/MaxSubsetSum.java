package DP;

public class MaxSubsetSum {
//    Given an array of integers(positive as well as negative) ,select some elements from
//this array(select a subset) such that:-
//
//            1. Sum of those elements is maximum(Sum of the subset is maximum) .
//            2. No two elements in the subset should be consecutive.

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8};
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = arr[2] + arr[0];
        for (int i = 3; i < arr.length; i++) {
            if (dp[i] == 0) dp[i] = arr[i];
            dp[i] = Math.max(dp[i-1], dp[i] + dp[i-2]);
        }
        System.out.println(dp[arr.length-1]);
    }

}
