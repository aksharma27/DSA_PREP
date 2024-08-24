package BinarySearchRevision;

public class SearchMountain {
    static int peak (int[] arr) {
        int s = 0, e = arr.length - 1;
        int mid = 0;
        while (s < e) {
            mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid+1]) e = mid;
            else s = mid + 1;
        }
        return s;
    }

    static int findPeak(int[] arr, int target) {
        int peak = peak(arr);
        boolean found = false;
        found = false;
        int s = 0, e = peak;
        int mid = 0;
        while (s <=  e) {
            mid = s + (e-s)/2;
            if (arr[mid] == target) {
                return mid;
//                found = true;
            }
            if (arr[mid] > target) s = mid - 1;
            else e = mid + 1;
        }
        if (!found) {
             s = peak+1;
             e = arr.length - 1;
             while (s <= e) {
                 mid = s + (e - s) / 2;
                 if (arr[mid] == target) return mid;
                 if (arr[mid] > target) s = mid + 1;
                 else e = mid - 1;
             }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,3,2,0};

    }
}
