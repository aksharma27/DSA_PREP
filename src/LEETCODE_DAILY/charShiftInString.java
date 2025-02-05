package LEETCODE_DAILY;

public class charShiftInString {
    public static String shiftingLetters(String s, int[][] shifts) {
        //BRUTE FORCE :
        int row = shifts.length;
        for (int i = 0; i < row; i++) {
            int start = shifts[i][0];
            int end = shifts[i][1];
            int direction = shifts[i][2];
            StringBuilder ans = new StringBuilder(s);
            for (int j = start; j <= end; j++) {
                char cur = ans.charAt(j);
                if (direction == 1) {
                    if (cur == 'z') {
                        cur = 'a';
                    }
                    else cur += 1;
                }
                else if (direction == 0) {
                    if (cur == 'a') {
                        cur = 'z';
                    }
                    else cur -= 1;
                }
                ans.setCharAt(j, cur);
            }
        }
        return s.toString();
    }


    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = {{0, 0, 0}, {1, 1, 1}};
        System.out.println(shiftingLetters(s, shifts));
    }
}
