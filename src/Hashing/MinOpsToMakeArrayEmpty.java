package Hashing;
import java.util.*;

public class MinOpsToMakeArrayEmpty {
    public static int minOperations(int[] nums) {
        //create a map and store the key and its occurences
        // map(key, occur) ==> traverse through the map and
        //  if occur % 3 == 0 ==> get it's quotient and add to ans
        // if occur % 2 == 0 ==> get its quotient and add to the ans
        // else return -1

        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        int steps = 0;
        //now traverse through the map :
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            //get freq of curr element :
            int t = entry.getValue();

            //if only 1 occurrence of any element => not possible
            if (t == 1) return -1;
            //calculate no of ops needed to make the freq div by 3
            steps += t / 3;     //eg: 5/3 = 1
            if (t % 3 != 0) {
                //increment the counter for remaining elements: eg: 5%3=2 != 0, so add one step ==> 1+1 = 2
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,2,3,4};
        System.out.println(minOperations(nums));
    }
}
