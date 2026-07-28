import java.util.Arrays;
public class LongestConsecutive {
    public static int longestConsecutive(int[] array){
        int n = array.length;
        Arrays.sort(array);
        int maxlength = 1;
        int currentlength = 1;
        for(int i=1;i<n;i++){
            if(array[i]==array[i-1]){
                continue;
            }
            else if(array[i]==array[i-1]+1){
                currentlength++;
                maxlength = Math.max(maxlength, currentlength);
                
            }
            else{
              
                currentlength=1;
            }
        }
        maxlength = Math.max(maxlength, currentlength);
        return maxlength;

            
            
    } 
    public static void main(String[] args) {
        int[] array = {100,200, 1, 3, 2,4};
        int result = longestConsecutive(array);
        System.out.println("Length of the longest consecutive elements sequence: " + result);
    }
}
