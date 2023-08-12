package Hashing;
import java.util.*;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String[] words = {"lc","cl","gg"};
        System.out.println(longestPalindrome(words));
    }
    static int longestPalindrome (String[] words) {
        int length = 0;
        Map<String, Integer> freq = new HashMap<>();
        for (String element : words) {
            String reverse = rev (element);
            if (freq.containsKey(reverse) && freq.get(reverse) > 0) {
                length += 4;
                freq.put(reverse, freq.get(reverse)-1);
            }
            else {
                freq.put(element, 1);
            }
            if (reverse.equals(element)) length = length + 2;


        }
        return length;
    }
    static String rev (String str) {
        String rev = new String("");
        rev += str.charAt(1);
        rev += str.charAt(0);
        return rev;
    }

}
