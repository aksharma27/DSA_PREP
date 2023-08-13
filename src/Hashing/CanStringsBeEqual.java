package Hashing;

import java.util.*;

public class CanStringsBeEqual {
//    Given 2 Strings, find if they can be made equal through swapping their character. Return true or false|
    static boolean isEqual (String a, String b) {
        //if len of a != len b => false
        if (a.length() != b.length()) return false;
        //create map for both strings and store freq of chars
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        //store freq :
        for (int idx = 0; idx < a.length(); idx++) {
            char ch = a.charAt(idx);
            mp1.put(ch, mp1.getOrDefault(ch, 0)+1);
        }

        for (int idx = 0; idx < b.length(); idx++) {
            char ch = a.charAt(idx);
            mp2.put(ch, mp2.getOrDefault(ch, 0)+1);
        }

        //check if all the chars have same freq, if any of the char is less of more return false there only
        //also if any element of mp1 is not in mp2 then also return false;
        for (int idx = 0; idx < b.length(); idx++) {
            char ch = b.charAt(idx);
            if (!mp1.containsKey(ch)) return false;
            if (mp1.containsKey(ch) && mp1.get(ch) != mp2.get(ch)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bggbdd";
        String b = "ggbbdd";
        System.out.println(isEqual(s, b));
    }
}
