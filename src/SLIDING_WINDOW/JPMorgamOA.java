package SLIDING_WINDOW;

public class JPMorgamOA {
//    https://www.desiqna.in/12812/morgan-sde1-coding-questions-and-solutions-india-april-2023
public static void main(String[] args) {
//    int[] stock = {5,3,5,7,8};
    int[] stock = {1,2,3,2,1,5,8,10};
    int k = 3;
    int ans = findSubarrays(stock, k);
    System.out.println(ans);
}

static int findSubarrays (int[] arr, int k) {
    //first check if A[r] < A[r-1] ==> not good subarray : shift window by doing left++ till left == right
//    Now, if window size is hit, increment counter, else right++;
//    do not do right++, before checking window size, as, it will not do a check of A[right] < A[right-1} and give result > actual result
    int left = 0, right = 1;
    int count = 0;
    while (right < arr.length) {
        if (arr[right] < arr[right - 1]) {
            while (left != right) left++;
        }
        if (right - left + 1 == k) {
            left++;
            count++;
        }
        right++;  //r++ toh har ek step me hoga
    }
    return count;
}
}

//constrinats :
//arr.size is always > 1
