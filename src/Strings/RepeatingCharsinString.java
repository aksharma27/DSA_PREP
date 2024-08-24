package Strings;
import java.util.*;

import java.util.HashMap;

public class RepeatingCharsinString {
    public static void main(String[] args) {
            repeating("geeksforgeeks");
    }

    static void repeating(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (freq.containsKey(cur)) freq.put(cur, freq.get(cur) + 1);
            else freq.put(cur, 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
