package DP;

import java.util.Scanner;

public class GoogleOaODDJOURNEY {
//    Find the number of journeys where you start from index 1 and end at index ‘n’ and the sum of every journey should be odd..
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n+1];
    for (int i = 1; i <= n; i++) {
        a[i] = in.nextInt();
    }
    int[][] dp = new int[100005][3];

    //if a[i] % 2 == 0 ==> even ==> odd journey = curr(even) + odd journeys(i-1, i-2), oppsite for odd
    if (a[1] % 2 == 0) dp[1][2] = 1;
    else dp[1][1] = 1;

    int  i = 2;
    while (i <= n) {
        if (a[i] % 2 == 0) {    // curr is even
            //even journeys = even + even
            dp[i][2] = dp[i-2][2] + dp[i-1][2];
//            odd = even + odd
            dp[i][1] = dp[i-2][1] + dp[i-1][1];
        } else {    //curr is odd
            //even journeys = odd + odd
            dp[i][2] = dp[i-2][1] + dp[i-1][1];

            // odd journeys = odd + even
            dp[i][1] = dp[i-1][2] + dp[i-2][2];
        }
        i++;
    }
    System.out.println("Even journeys : " + dp[n][2] + ", Odd Journeys : " + dp[n][1]);
}
}
