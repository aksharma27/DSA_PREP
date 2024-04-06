package SLIDING_WINDOW;

public class SubarraySumLessThanK {
//    Number of subarrays having sum less than K :
//
//    Given an array of non-negative numbers and a non-negative number k, find the number of subarrays having sum less than k
//    Input : arr[] = {2, 5, 6}
//    K = 10
//    Output : 4
//    The subarrays are {2}, {5}, {6} and
//    {2, 5},
//
//    Input : arr[] = {1, 11, 2, 3, 15}
//    K = 10
//    Output : 4
//    {1}, {2}, {3} and {2, 3}

    public static void main(String[] args) {
//        int[] a = {2,5,6};
        int[] a = {1, 11, 2, 3, 15};
        System.out.println(findSubarrays(a, 6));
    }

    static int findSubarrays (int[] arr, int k) {
        int left = 0, right = 0;
        int sum = 0;
        int ans = 0;
        //iterate through the array and find the sum :
        while (right < arr.length) {
            sum += arr[right];
            //if sum < K ==> count valid subarrays by : right - left + 1 :
            if (sum < k) {
                ans += right - left + 1;
            }
            else {
                //else increment left counter and decrement sum value in each step until we reach sum < k
                while (sum >= k && left < right) {
                    sum -= arr[left];
                    left++;
                }
                if (sum < k && sum != 0) ans += right - left + 1;   // putting if condition, coz, there might be a single element > K, and left and right pointing to it still > k, so we cannot
//                add it to our ans, so check if it is < k or not then only add it, also sum should be non - negative
            }
            right++;
        }
        return ans;
    }
}
