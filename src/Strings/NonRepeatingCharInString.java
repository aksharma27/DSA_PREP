package Strings;

import java.util.*;

public class NonRepeatingCharInString {
    public static void main(String[] args) {
        System.out.println(nonRepeat("eeetcode"));
    }

    static int nonRepeat(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
//            freq.put(cur, freq.getOrDefault(cur, 0) + 1);
            if (freq.containsKey(cur)) {
                freq.put(cur, freq.get(cur) + 1);
            }
            else freq.put(cur, 1);
        }

////        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (freq.get(cur) == 1) return i;
        }
//        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
//            if (entry.getValue() == 1) return
//        }
        return -1;
    }
}
