package SLIDING_WINDOW;

public class AmazonOA {
//    Given list of processes where each value representing memory consuption by the process and given one variable m representing
//    number of processes to be removed. We need to delete m number of processes from the list in contiguous manner and return minimum
//    amount of main memory used by all the proccesses running after deleting contiguous segment of processes.
//
//            Example - processes = {10,4,8,13,20}, m = 2;
//    output = 22 [removing 13 and 20 as its consuming large memory]
public static void main(String[] args) {
    int[] processes = {10,4,8,13,20};
    int m = 2;
    int removal = removeMaxSubarray(processes, m);
    int sum = 0;
    for (int el : processes) {
        sum += el;
    }
    sum = sum - removal;
    System.out.println(sum);

}
    static int removeMaxSubarray(int[] arr, int m) {
    //similar to max subarray of size K
        int i = 0;
        int sum = 0, max = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (j - i + 1 >= m) {
                if (j - i + 1 == m) max = Math.max(sum, max);
                sum -= arr[i];
                i++;
            }
        }
        return max;
    }
}
