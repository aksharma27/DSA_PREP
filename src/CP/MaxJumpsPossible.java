package CP;

public class MaxJumpsPossible {
    public static void main(String[] args) {
//        int[] ar = {4, 0, 1, 0, 0, 0, 2, 5};
//        int[] ar = {0, 1, 0};
        int[] ar = {2, 2, 2, 2, 1, 0};
        System.out.println(maxJumps(ar, ar.length));
    }

    static int maxJumps (int[] ar, int n) {
        int goal = n - 1;
        int ans = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (i + ar[i] >= goal) {
                goal = i;
                ans++;
            }
        }
        return goal == 0 ? ans : -1;
    }
}


//A[n] = {2, 3, 5, 8, 9, 2, 6, 7, 6, 8}
//pawn > 0

//cond : x+1 or x + Ax -> only possible if Ax is greater than 0
//req : find the maximum number of jumps possible so that our pawn can reach the last position.

//[4, 0, 1, 0, 0, 0, 2, 5] -> -1
//[4, 0, 1, 0, 2, 1, 2, 5] -> 2

