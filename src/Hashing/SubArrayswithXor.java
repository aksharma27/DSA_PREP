package Hashing;
import java.util.*;

public class SubArrayswithXor {
    public static int solve(int[] A, int B) {
        int xorSum = A[0];
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int idx = 1; idx < A.length; idx++) {
                if (A[idx] == B) count++;
            xorSum ^= A[idx];
            if (xorSum == B) count++;
            if (freq.containsKey(xorSum ^ B)) {
                count+=freq.get(xorSum^B);
            }
            freq.put(xorSum, freq.getOrDefault(xorSum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ar = { 4, 2, 2, 6, 4 };
        System.out.println(solve(ar, 6));
    }
}
