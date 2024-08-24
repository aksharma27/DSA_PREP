//package DP;
//
////AMAZON SUMMER SCHOOL'23 :
////given cities from 1 to N, an Array A[] represents the cost for each city. One can go from city i to (i+1)th city or (i + 3)th city.
////find the min cost to reach the Nth city. cost = abs(cost[i] - cost[j])
//
////CONSTRAINT : cost.length >= 3
//
//public class MinCostToReachDest {
//    public static void main(String[] args) {
//        int[] cost = {4, 12, 13, 18, 10, 12};
//        System.out.println(minCost(cost););
//    }
//
//    static int minCost (int[] cost) {
//        int[] dp = new int[cost.length + 1];
//        dp[0] = 0; //no cost,
//        dp[1] = Math.abs(cost[1] - cost[0]);
////        dp[2] = Math.abs()
////        dp[2] = Math.min(dp[1], Math.min());
//        for (int i = 2; i < cost.length; i++) {
//            dp[i] = Math.min(Math.abs(cost[i] - cost[i - 1]) + dp[i - 1], Math.abs(cost[i] - cost[i - 3]) + dp[i - 3]);
//        }
//        return dp[cost.length];
//    }
//}
