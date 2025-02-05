package DP;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GoogleOaODDJOURNEY {
//    Find the number of journeys where you start from index 1 and end at index ‘n’ and the sum of every journey should be odd..
public static void main(String[] args) {
   int[] ar = {0, 2, 3, 5, 8, 10};  // 1 index array
    System.out.println(countOddJourneys(ar));

}

    public static int countOddJourneys(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n + 1][2];

        if (arr[1] % 2 == 0) {
            dp[1][0] = 1;
        } else {
            dp[1][1] = 1;
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] % 2 == 0) {
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0];     //even + even= even
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];     //even + odd = odd
            } else {
                dp[i][0] = dp[i - 1][1] + dp[i - 2][1];     //odd + odd = even
                dp[i][1] = dp[i - 1][0] + dp[i - 2][0];     //odd + even = odd
            }
        }
        return dp[n - 1][1];
    }
}