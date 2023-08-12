package Hashing;
import java.util.*;

//given a log entry s and a target word t, target can be obtained by selecting some subsets of words from the string s and removing them
//from s. Determine the max no. of times the word t can be removed from the given log entry.(bo s and t has lower case only)


public class AmazonOA {
    public static void main(String[] args) {
//        String s = "mononom";
//        String t = "mon";
        String t = "abbc";
        String s = "abcbacbbac";
        //create a map and store all chars of string s with it's freqency :

        //
        Map<Character, Integer> freq = new HashMap<>();
        for (int idx = 0; idx < s.length(); idx++) {
            freq.put(s.charAt(idx), freq.getOrDefault(s.charAt(idx), 0)+1);
        }

        Map<Character, Integer> freq2 = new HashMap<>();
        for (int idx = 0; idx < t.length(); idx++) {
            freq2.put(t.charAt(idx), freq2.getOrDefault(t.charAt(idx), 0)+1);
        }

        //iterate through the map until it's size is just less than t
        //if any char from target t is not present in the map, then stop and return the max count
        int maxtime = Integer.MAX_VALUE;
        for (int idx = 0; idx < t.length(); idx++) {
            char ch = t.charAt(idx);
            if (!freq.containsKey(ch)) break;
             int val = freq.get(ch) / freq2.get(ch);
             maxtime = Math.min (maxtime, val);
        }
        System.out.println(maxtime);
    }
}
