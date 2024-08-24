package BinarySearchRevision;

public class FindPeak {
    static int findPeak (int[] arr) {
        int s = 0, e = arr.length - 1;
        int mid = 0;
        while (s < e) {
            mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid+1]) e = mid;
            else s = mid + 1;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,3,2,0};
        int ans = findPeak(arr);
        System.out.println(ans);
    }
}
