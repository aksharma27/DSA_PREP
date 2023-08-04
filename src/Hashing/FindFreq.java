package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FindFreq {
//    Find frequency of each number in the given array , but numbers can be as large as 1000000000
public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10 };
    getFreq(arr);
}
static void getFreq (int[] arr) {
    Map<Integer, Integer> mp = new HashMap<>();
    for (int index = 0; index < arr.length; index++) {
        if(!mp.containsKey(arr[index])) mp.put(arr[index], 1);
        else mp.put(arr[index], mp.get(arr[index])+1);
    }

    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        System.out.println("Freq of " + entry.getKey() + " is : " + entry.getValue());
    }
}
}
