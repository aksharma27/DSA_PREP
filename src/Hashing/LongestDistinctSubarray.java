package Hashing;
import java.util.*;

public class LongestDistinctSubarray {
    public static void main(String[] args) {
//        B = [ 3 2 4 5 2 6 7 8 9 10]
//        O/P - 8
        int[] arr = {1,2,4,5,6,4,7,8,9,10};
//        BRUTE FORCE :-
//        int len = 0;
//        int max = 0;

//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            map.clear();
//
//            for (int j = i; j < arr.length; j++) {
//
//                if(!map.containsKey(arr[j])) {
//                    map.put(arr[j], map.getOrDefault(arr[i], 0) + 1);
//                    len = j - i + 1;
//                    max = Math.max(max, len);
//                }
//                else break;
//            }
//        }

        int i = 0, j = 0;
        int max = 0;
//        map<number, index>
        Map<Integer, Integer> index = new HashMap<>();
        while (i < arr.length && j < arr.length) {
            if (!index.containsKey(arr[j])) {
                index.put(arr[j], j);
                int len = j - i + 1;
                max = Math.max(max, len);
                j = j + 1;
            } else {
                //number has occured again
                int idx = index.get(arr[j]);
                while (i <= idx) {
                    index.remove(arr[i]);
                    i++;
                }
//                i = idx + 1;
                index.put(arr[j], j);
                j = j + 1;
            }
        }
        System.out.println(max);
    }
}
