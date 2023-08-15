package Hashing;

import java.util.*;

public class ArcesiumOA {
//    Arcesium OA : check if 2 strings can be made equal by swapping even index with even indicex or odd with odd

    //-> divide both the string into 2 pairs each -> odd index chars in one map, even with even
    //-> compare even map of A with even map of B
    //-> compare odd map of A with odd map of B
//    if anyone of them returns false then false, else true
    static boolean check (String a, String b) {
        // if length of 2 strings are not equal then false :
        if (a.length() != b.length()) return false;
        //create 4 maps, 2even and 2 odd
        Map<Character, Integer> evenA = new HashMap<>();
        Map<Character, Integer> evenB = new HashMap<>();
        Map<Character, Integer> oddA = new HashMap<>();
        Map<Character, Integer> oddB = new HashMap<>();

        //store even and odd of A
        int i = 0;
        while (i < a.length()) {
            char ch = a.charAt(i);
            //store even
            if (i % 2 == 0) {
                evenA.put(ch, evenA.getOrDefault(ch, 0)+1);
            }else { //store odd
                oddA.put(ch, evenB.getOrDefault(ch, 0)+1);
            }
            i++;
        }

        int j = 0;
        //store even ond odd of B
        while (j < b.length()) {
            char ch = b.charAt(j);
            //store even
            if (j % 2 == 0) {
                evenB.put(ch, evenA.getOrDefault(ch, 0)+1);
            }else { //store odd
                oddB.put(ch, evenB.getOrDefault(ch, 0)+1);
            }

            j++;
        }
        return evenA.equals(evenB) && oddA.equals(oddB);
    }

    public static void main(String[] args) {
//        String a = "zyz";
//        String b = "yzz";
        String a = "cdab";
        String b = "dcba";
        System.out.println(check(a,b));
    }
}
