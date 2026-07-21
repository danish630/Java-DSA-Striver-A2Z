import java.util.HashMap;

public class TwoSum {
    public static int [] findpairs(int array[], int target){
       HashMap<Integer ,Integer>map = new HashMap<>();
       for(int i=0; i<array.length;i++){
        int need = target-array[i];
        if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
           
            map.put(array[i], i);
        }
        
        return new int[] { -1, -1 };

    }
    public static void main(String[] args) {
        int array[]={10,12,25,32};
        int target =22;

        int result[] = findpairs(array,target);
        System.out.println(result[0] + " " + result[1]);
    }
}
