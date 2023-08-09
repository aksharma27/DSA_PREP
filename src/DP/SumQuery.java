package DP;

public class SumQuery {
//    We are given an array of integers(a[n]) . We are given multiple queries of the form : (1, i) which means we need to output the sum of all numbers from index- ‘1’ to index ‘i’ of the array.
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        int[] dp = new int[arr.length+1];
//        dp[0] = arr[0];
        dp[arr.length] = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) dp[i] = arr[i];
            else dp[i] = arr[i] + dp[i-1];
        }
        int query = 5;      //sum of elements from 0 to 2, i.e., 4+5+1 = 10
        System.out.println(dp[query]);
    }
}
