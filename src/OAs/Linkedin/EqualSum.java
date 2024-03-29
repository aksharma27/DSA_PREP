package OAs.Linkedin;

public class EqualSum {
//    find the smallest number in an array st, sum to the left is eqal to the sum to its right :
//    eg: [1,2,3,4,6] ==> sum to the left of 4 ==> 1+2+3 = 6 and sum to the right of 4 ==> 6
public static void main(String[] args) {
//    int[] a = {1,2,3,4,6};
//    int[] a = {1,2,1};
    int[] a = {1,2,3,3};
    int left = 0, right = a.length - 1;
    int leftSum = 0, rightSum = 0;
    int ans = -1;
    leftSum += a[left];
    rightSum += a[right];
    while (left < right) {
        if (leftSum < rightSum) {
            left++;
            leftSum += a[left];
        }
        else if (rightSum < leftSum) {
            right--;
            rightSum += a[right];
        }
        else if (left + 1 == right - 1) {
            ans = left + 1;
            break;
        }
    }
    System.out.println(ans);
}
}
