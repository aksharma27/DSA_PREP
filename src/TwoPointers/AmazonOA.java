package TwoPointers;

public class AmazonOA {
//    Given 2 Strings, s1 & s2. Find how many chars are req to added in s1, so that s2 becomes a subsequence of s1 :
public static void main(String[] args) {
    String s1 = "abcz";
    String s2 = "azdb";
    int ans = findSubseq(s1, s2);
    System.out.println(ans);
}

static int findSubseq(String s1, String s2) {
    int i = 0, j = 0;
    while (i < s1.length() && j < s2.length()) {
        if (s1.charAt(i) == s2.charAt(j)) {
            i++;
            j++;
        } else i++;
    }
    return s2.length() - j;
}
}
