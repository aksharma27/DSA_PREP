package Hashing;
import java.util.*;
public class GoogleOASDE2 {
    //You're given array A of N ints, find number of special pairs in array A. A pair of 2 indexes i and j are called
    //special if  : (i<j) and A[A[A[i]]] == A[A[A[j]]]

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                freq.put(a[a[a[i]]], freq.getOrDefault(a[a[a[i]]],0)+1);
            }

            int pairs = 0;
            for (int i = n-1; i >= 0; i--) {
                if (freq.containsKey(a[a[a[i]]]) && freq.get(a[a[a[i]]]) > 0) {
                    pairs += freq.get(a[a[a[i]]]);
                    freq.put(a[a[a[i]]], freq.get(a[a[a[i]]])-1);
                }
            }
            System.out.println(pairs);
        }
    }
}
