import java.util.Arrays; // We need this to print the final array result cleanly

public class TwoPointer {

    public static int[] twoSum(int[] array, int target) {
        
        int left = 0; 
        int right = array.length - 1;
        
        // The while loop must wrap ALL the logic
        while(left < right) {
            
            int currentSum = array[left] + array[right];
            
            if (currentSum == target) {
                // We found the perfect match! Return their positions.
                return new int[]{left, right}; 
            }
            else if (currentSum < target) {
                // Too small! Move the left pointer up to get a bigger number.
                left++; 
            }
            else {
                // Too big! Move the right pointer down to get a smaller number.
                right--; 
            }
        }
        
        // If the loop finishes and we found nothing, return an empty array
        return new int[]{}; 
    }

    public static void main(String[] args) {
        
        int[] array = {7, 9, 14, 20, 25};
        int target = 34; // Let's look for 14 + 20
        
        // 1. Call the method with a lowercase 't' (Java is case-sensitive)
        // 2. Pass BOTH the array and the target
        // 3. Save the result so we can print it
        int[] result = twoSum(array, target);
        
        System.out.println("The numbers are at indices: " + Arrays.toString(result));
    }
}