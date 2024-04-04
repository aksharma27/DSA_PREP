package SLIDING_WINDOW;

public class AmazonOA2 {
//    Given list of movies, and a variable k representing maximum allowed difference, we need to group the movies into
//    groups. No groups can have movies which has difference amongst them greater than m. We need to return minimum number
//    of groups which follows the condition.
//
//    Example - movies = [1,5,4,6,8,9,2], k=3;
//    output = 3 [groups-(1,2,4),(5,6,8),(9)]

    public static void main(String[] args) {
        int[] movies = {1, 5, 4, 6, 8, 9, 2};
        int k = 3;
        int result = findGroups(movies, k);
        System.out.println(result);
    }

    static int findGroups (int[] arr, int K) {
//        approach : sort the array --> find when the right - left is > K, when > K, increment left till right - 1 and increment group + 1
        int groups = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] - arr[left] > K) {
                while (left < right - 1) left++;
                groups++;
            }
        }
        return groups;
    }
}
