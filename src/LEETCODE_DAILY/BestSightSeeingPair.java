package LEETCODE_DAILY;

public class BestSightSeeingPair {
    public static int maxScoreSightseeingPair(int[] values) {
        int len = values.length;
        if (len == 2) {
            return values[0] + values[1] -1;
        }

        int pSum[] = new int[len];
        pSum[0] = values[0];
        for (int i = 1; i < len; i++) {
            pSum[i] = values[i] + pSum[i - 1];
        }

        int ans = 0;
        int i = 0, j = 1;
        while (j < len) {
            int sum1 = 0;
            int sum2 = 0;
            if (j == 1) {
                sum1 = pSum[1] - 1;
            } else {
                sum1 = pSum[j] - pSum[j - 2] + ((j-1) - j);
                sum2 = values[j] + values[i] + (i - j);

            }
            ans = Math.max(ans, Math.max(sum1, sum2));
            if (i == 0) i++;
              else if (values[i] < values[i + 1]) {
                i++;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ar = {8, 1, 5, 2, 6};
//        int[] ar = {5, 3, 1};
//        int[] ar = {7,1,10,6,3,5,10,2};
        System.out.println(maxScoreSightseeingPair(ar));
    }
}
