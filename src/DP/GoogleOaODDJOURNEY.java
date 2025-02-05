package DP;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GoogleOaODDJOURNEY {
//    Find the number of journeys where you start from index 1 and end at index ‘n’ and the sum of every journey should be odd..
public static void main(String[] args) {
   int[] ar = {0, 2, 3, 5, 8, 10};
    System.out.println(countOddJourneys(ar));

}

    public static int countOddJourneys(int[] arr) {
        int[][] dp = new int[arr.length + 1][arr.length + 1];
        if (arr[1] % 2 == 0) {      //even
            dp[1][0] = 1;       //even + even = even
            dp[1][1] = 0;       //even + odd = odd
        } else {
            dp[1][0] = 0;       //odd + even = odd
            dp[1][1] = 1;       //odd + odd = even
        }

        int i = 2;
        while (i < arr.length)
        {
            if (arr[i] % 2 != 0) {
                // curr is odd :
                dp[i][1] = dp[i - 1][0] + dp[i -2][0];
                dp[i][0] = dp[i - 1][1] + dp[i - 2][1];
            } else {
                //curr is even :
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            }
            i++;
        }
        return dp[arr.length - 1][1];
    }
}