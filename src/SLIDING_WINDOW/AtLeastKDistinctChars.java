package SLIDING_WINDOW;

import java.util.*;

public class AtLeastKDistinctChars {
//    Count number of substrings having at least K distinct characters
//
//    Given a string S consisting of N characters and a positive integer K, the task is to count the number of substrings having at least K distinct characters.
//            Input: S = “abcca”, K = 3
//    Output: 4
//    Explanation:
//    The substrings that contain at least K(= 3) distinct characters are:
//
//            “abc”: Count of distinct characters = 3.
//“abcc”: Count of distinct characters = 3.
//“abcca”: Count of distinct characters = 3.
//“bcca”: Count of distinct characters = 3.
public static void main(String[] args) {
    String s = "abccdeeefa";
    int k = 3;
    System.out.println(findSubarrays(s, k));
}
    static int findSubarrays (String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int ans = 0;
        int right = 0;      //leftChar, i = right
        int left = 0;      //end / right
//        for (int i = 0; i < s.length(); i++) {
          while (right < s.length()) {
            char cur = s.charAt(right);
            freq.put(cur, freq.getOrDefault(cur, 0) + 1);
            right++;
//            if (i < s.length() && freq.size() >= k) ans++;
//            if (i == s.length() - 1) {
                while (freq.size() >= k) {
                    char leftChar = s.charAt(left);
//                    j++;
                    freq.put(leftChar, freq.get(leftChar) - 1);
                    if (freq.get(leftChar) == 0) freq.remove(leftChar);
                    ans += s.length() - right + 1;
                    left++;
                }
            }
//        }
        return ans;
    }
}
