package LEETCODE_DAILY;
import java.util.*;

public class String_Mathc {
    public static List<String> stringMatching(String[] words) {
        int len = words.length;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                     break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] ar = {"mass","as","hero","superhero", "ass"};
        System.out.println(stringMatching(ar));
    }
}
