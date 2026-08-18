package Strings;

public class FrequencyOfCharacter {

    public static int[] frequency(String s) {
        int[] freq = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        String s = "banana";
        int[] freq = frequency(s);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) 
                System.out.println((char) (i + 'a') + ": " + freq[i]);
            
        }

    }
}
