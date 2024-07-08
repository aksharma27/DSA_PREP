package Intervie;

public class Ques {
//    input: {3, 5, 7, 1, 10, 14, 6}, Output: 10
public static void main(String[] args) {
//    int[] input = {3, 5, 7, 1, 16, 14,12};
//    System.out.println(findSecLargest(input));
//    System.out.println(digits(12345));
    sum(12345);
//    digits(12345);
//    sum(12345);
//    System.out.println(findLeap(1900));
//    2000 - Leap Year
//    2004 - Leap Year
//    1999 - Not a Leap Year
//    1900 - Not a Leap Year
}

    static int findSecLargest (int[] arr) {
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                secMax = max;
                max = arr[i];
            }
            if (arr[i] > secMax && max > arr[i]) secMax = arr[i];
//            if (arr[arr.length - 1] > secMax && max > arr[arr.length - 1]) secMax = arr[arr.length - 1];
        }
        return secMax;
    }


    //QUES 2 :
    static void sum (int num) {
        int[] ar = digits(num);
        num = ar[0];


        String ans = "";
        int len = ar[1] - 1;
//        int len = digits(num) - 1;
//        System.out.println(len);
        while (num > 0) {
//            int quo = num / 10; //1234
//            System.out.println(num % 10);
//            System.out.println(quo);
//            num /= 10;
//            quo = quo * len;    //1234
//            len--;
//            ans += quo + " + ";
            if (num / 10 != 0) ans += (num % 10) * (int) Math.pow(10, len) + "+";
            else ans += (num % 10);
            num /= 10;
            len--;
        }
        System.out.println(ans);
//        if (digits == 0) return;
//        ans += sum (num / 10, digits - 1, ans);
    }
    static int[] digits (int num) {
        int digits = 0;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
            digits++;
        }
//        System.out.println(rev);
        int[] dig = {rev, digits};
        return dig;
    }

//    LEAP YEAR :
    static boolean findLeap (int year) {
        boolean ans = false;
//        if (year % 4 == 0) {
            ans = year % 4 == 0 ? ((year % 100 == 0 && (year & 400) != 0) ? false : true) : year % 4 == 0;
//            if (year % 100 == 0 && year % 400 != 0) ans = false;
//            else ans =true;
//        }
//        else if () ans = true;
        return ans;
    }
}
