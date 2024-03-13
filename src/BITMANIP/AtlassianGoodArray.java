package BITMANIP;

public class AtlassianGoodArray {
//    for an array of size N find the min no of operations to convert it into a good array :
public static void main(String[] args) {
//    int[] arr = {4,3,5,2};
//    int[] arr = {1,2,3,4,4};
    int[] arr = {1,3,3,1};

    int ops = findMinOps(arr, arr.length);
    System.out.println(ops);
}
    static int findMinOps (int[] arr, int n) {
        int minOps = 0;
        int[] MSBs = new int[31];
        for (int i = 0; i < n; i++) {
            int idx = indexOfMSB(arr[i]);
            minOps += MSBs[idx];
            MSBs[idx]++;
        }
        return minOps;
    }

    static int indexOfMSB (int num) {
        int idx = 0;
        while (num != 0) {
            num >>= 1;
            idx++;
        }
        return idx;
    }
}
