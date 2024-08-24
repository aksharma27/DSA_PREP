package OAs.AMAZON;

import java.util.*;

public class TargetWord {
    public static void main(String[] args) {
        System.out.println(findRearrangements("abacbc", "bca"));
//        System.out.println(findRearrangements("mononom", "mon"));
    }

    static int findRearrangements(String s, String tar) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tar.length(); i++) {
            if (mp.containsKey(tar.charAt(i))) min = Math.min(min, mp.get(tar.charAt(i)));
        }
        return min;
    }
}
