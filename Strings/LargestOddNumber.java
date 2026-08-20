package Strings;
public class LargestOddNumber {
    public static String largestOddNumber(String s) {
        int right = s.length() - 1;
        for (int i = right; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                return s.substring(0, i + 1);
            }
    }
    return "";
}

    public static void main(String[] args) {
        String s = "35698242";
        String result = largestOddNumber(s);
        System.out.println(result);
}
}


        