package RSL;

public class StrngQstn {
    public static void main(String[] args) {
        String input = "i.like.this.program";
        String output = replaceAlternateWords(input);
        System.out.println(output);
    }

    public static String replaceAlternateWords(String input) {
        StringBuilder result = new StringBuilder();
        int len = input.length();
        int curidx = 0;
        boolean isWord = false;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '.') {
                if (isWord) {
                    if (curidx % 2 == 1) {
                        result.append("xyz");
                    } else {
                        result.append(word);
                    }
                    curidx++;
                    word.setLength(0);
//                    System.out.println(word);
                }
                result.append('.');
                isWord = false;
            } else {
                word.append(currentChar);
                isWord = true;
            }
        }

        if (isWord) {
            if (curidx % 2 == 1) {
                result.append("xyz");
            } else {
                result.append(word);
            }
        }
        System.out.println(result.toString());
        return result.toString();

    }
}

