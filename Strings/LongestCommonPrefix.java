package Strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        java.util.Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (i < last.length && first[i] == last[i]) {
                result.append(first[i]);
            } else {
                break;
            }
        }
        return result.toString();
    }

        public static void main(String[] args) {
        String[] strs = {"flower", "flow", "floight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
