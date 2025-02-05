package LEETCODE_DAILY;

import java.util.*;

public class CountVowelsInRange {
    public static int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n];
        //count prefix
        for (int i = 0; i < n; i++) {
            int wordLen = words[i].length();
            char first = words[i].charAt(0);
            char last = words[i].charAt(wordLen - 1);
            if (isVowel(first) && isVowel(last)) {
                prefix[i] = i == 0 ? 1 : prefix[i - 1] + 1;
            }
            else {
                prefix[i] = i == 0 ? 0 : prefix[i - 1];
            }

        }
        System.out.println(Arrays.toString(prefix));


        int qLen = queries.length;
        int[] ans = new int[qLen];
        for (int i = 0; i < qLen; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            ans[i] = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
        }
        return ans;
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {
                {0,2},
                {1,4},
                {1,1}
        };
        System.out.println(Arrays.toString(vowelStrings(words, queries)));
    }
}
