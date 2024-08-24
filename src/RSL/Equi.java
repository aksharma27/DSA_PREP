package RSL;

public class Equi {
    public static void main(String[] args) {
        int[] input = {10, 1, 1, 9};
        int result = findEqui(input);
        System.out.println(result);
    }

    public static int findEqui (int[] arr) {
        int total= 0;
        for (int num : arr) {
            total += num;
        }

        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];

            if (left== total) {
                return arr[i];
            }

            left += arr[i];
        }

        return 0;
    }
}

