package RSL;

import java.util.Arrays;

public class OddStr {
    public static void main(String[] args) {
        String input = "1010";
        String output = createMaxOddBinary(input);
        System.out.println(output);
    }

    public static String createMaxOddBinary(String input) {
        char[] chars = input.toCharArray();
        int countZeroes = 0;
        int countOnes = 0;

        // Count the number of 0s and 1s
        for (char c : chars) {
            if (c == '0') {
                countZeroes++;
            } else if (c == '1') {
                countOnes++;
            }
        }

        // Create the max odd binary number
        StringBuilder result = new StringBuilder();

        // Append all 0s first
        for (int i = 0; i < countOnes - 1; i++) {
            result.append('1');
            System.out.println(result);
        }

        // Append all 1s except one
        for (int i = 0; i < countZeroes; i++) {
            result.append('0');
        }

        // Append the last 1 to ensure the number is odd
        result.append('1');

        return result.toString();
    }
}

