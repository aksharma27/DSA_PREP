package LEETCODE_DAILY;

public class MinDaysMBouquets {
    public static void main(String[] args) {
        int days[] = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(days, m, k));
    }

        public static int minDays(int[] bloomDay, int m, int k) {
            if ((long) m * k > bloomDay.length) {
                return -1;
            }

            int low = 1, high = (int) 1e9;
            while (low < high) {
                int mid = low + (high - low) / 2;

                if (isPossibleBouquets(bloomDay, m, k, mid)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            };

            return low;
        }
        private static boolean isPossibleBouquets(int[] bloomDay, int m, int k, int day) {
            int total = 0;

            for (int i = 0; i < bloomDay.length; i++) {
                int count = 0;
                while (i < bloomDay.length && count < k && bloomDay[i] <= day) {
                    count++;
                    i++;
                }

                if (count == k) {
                    total++;
                    i--;
                }

                if (total >= m) {
                    return true;
                }
            }

            return false;
        }

}
