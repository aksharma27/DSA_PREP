package SLIDING_WINDOW;

public class MaxP {
    static int maxProd (int[] arr) {
        int maxP = 0, curr = 1;
        if (arr.length == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length;j++) {
                if (arr[j] != 0) {
                    curr *= arr[j];
                    maxP = Math.max(maxP, curr);
                }
//                else curr = 1;
            }
            curr = 1;
        }
        return maxP;
    }

    public static void main(String[] args) {
        int arr[] = {-3, 2, 5, 3, 9, 0};
        System.out.println(maxProd(arr));
    }
}
