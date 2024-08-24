package DP;

public class IntuitOAdhoni {
    public static void main(String[] args) {
        int[][] players = {
                {1,2,13, 10},
                {15, 26, 7, 48},
                {99, 86, 11, 12},
                {92, 89, 9, 99}
        };

//        2D prefix : min value in part [1...i][1...j]
        int n = players.length;
        int m = players[0].length;
        int ans = Integer.MAX_VALUE;
        int[][] prefix = new int[n+1][m+1];
        for (int i = 1; i < n ; i ++) {
            for (int j = 1; j < m; j++) {
                prefix[i][j] = Math.min(players[i][j], Math.min(prefix[i-1][j], prefix[i][j-1]));
            }
        }
        int answer = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int end = players[i][j];
                int start = Integer.MAX_VALUE;
                start = Math.min(prefix[i][j-1], prefix[i-1][j]);
                answer = end - start;
                ans = Math.max(ans, answer);
            }
        }
        System.out.println(ans);

    }
}
