package Strings;

public class RemoveParenthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openCount++;
                if (openCount > 1) {
                    result.append(c);
                }
            } else if (c == ')') {
                openCount--;
                if (openCount >= 1) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "(()())";
        String result = removeOuterParentheses(s);
        System.out.println(result);
    }
}
