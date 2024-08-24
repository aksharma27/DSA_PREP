package PATTERNS;
import java.util.*;

class ZeroOne {
    public  static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        // boolean isLast = false;

        for (int idx = 1; idx <= 9; idx++) {
            int num = idx;
            int nextDigit = idx + 1;
            // if (isLast == true) return ans;
            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    ans.add(num);
                }
                ++nextDigit;
            }
        }
        ans.sort(null);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sequentialDigits(6789, 13000));
    }
}
