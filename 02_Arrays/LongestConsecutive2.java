import java.util.HashSet;
public class LongestConsecutive2 {
    public static int longestConsecutive(int[] array){
        int longestlength = 1;
        

        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestlength = Math.max(longestlength, currentStreak);
            }
        }

        return longestlength;
    }
    public static void main(String[] args) {
        int array[] = {100, 4, 200, 1, 3, 2};
        int n = array.length;
        int longestStreak = longestConsecutive(array);
        System.out.println("Longest consecutive sequence length: " + longestStreak);
    }
}
