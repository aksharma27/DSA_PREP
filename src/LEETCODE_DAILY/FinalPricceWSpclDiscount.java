package LEETCODE_DAILY;

import java.util.Arrays;

public class FinalPricceWSpclDiscount {
    public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int j = i < n - 1 ? i + 1 : i;
            if (i == n - 1) {
                ans[i] = prices[i];
                break;
            }
            if (prices[j] <= prices[i]) {
                ans[i] = prices[i] - prices[j]; //discount applied
            } else {
                while (j < n && prices[i] < prices[j]) {
                    j++;
                }
                if (j < n) {        //checking for if j is not out of bound
                    ans[i] = prices[i] - prices[j];
                } else {        //required, if i is at the 2nd last element, and j is at the last element, ar[j] > ar[i] : then ans[i] should be ar[i] as we cannot further increment j as it is out of bounds
                    ans[i] = prices[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ar = {8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(finalPrices(ar)));
    }
}
