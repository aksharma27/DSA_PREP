package RSL;

public class MinLength {
    public static void main(String[] args) {
//        System.out.println(minLength("ca")); // Output: 2
        System.out.println(minLength("aabccabba")); // Output: 3
    }

    public static int minLength(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char c = s.charAt(i);
            if (s.charAt(i) == s.charAt(j)) {
                while (i < j && s.charAt(i) == c) i++;
                System.out.println(" Debug " + s.charAt(i) + i);
                System.out.println("Debug : " + s.charAt(j) + j);
                while (i <= j && s.charAt(j) == c) j--;
            } else {
                break;
            }
        }
        return j - i + 1;
    }
}

