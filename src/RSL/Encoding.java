package RSL;

import java.util.Stack;

public class Encoding {
    public static void main(String[] args) {
//        String input = "3[a2[c]]";
        String input = "3[a]2[bc]";
        String output = decodeString(input);
        System.out.println(output);
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
//                System.out.println("Ch : " + k);
            } else if (ch == '[') {
                countStack.push(k);
//                System.out.println(k);
//                System.out.println(currentString);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = stringStack.pop();
                int currentK = countStack.pop();
                for (int i = 0; i < currentK; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}
