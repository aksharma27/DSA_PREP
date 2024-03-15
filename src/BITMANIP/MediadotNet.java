package BITMANIP;

import java.util.HashMap;
import java.util.*;

public class MediadotNet {
//    subset whose sum is K
public static void main(String[] args) {
    int[] arr = {8,4,4,2,2,1};

    Map<Integer, Integer> freq = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
    }

    int o = 0;
//    we want to know the ith bit of the target
    for (int i = 31; i >= 0; i--) {

    }
}
}
