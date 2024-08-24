package SLIDING_WINDOW;

public class AllSubarraySumGreaterEqaualK {
    public static void main(String[] args) {
        int[] arr = {1, 11, 2, 3, 15};
        System.out.println(findSubarrayGreaterK(arr, 13));
    }

    static int findSubarrayGreaterK (int[] arr, int K) {
        int left = 0, right = 0;
        int sum = 0, ans = 0;
        int n = arr.length;
        while (right < arr.length) {
            sum += arr[right];
            if (sum >= K) {
                ans += n - right + 1;


            //if reached final index : return from here, no need to check further :
                if (right == n - 1) return ans;

                //increment left counter
                while (left < right && sum >= K) {
                    sum -= arr[left];
                    left++;
                }
            }
            right++;
        }
        return ans;
    }
}
