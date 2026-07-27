import java.util.ArrayList;
import java.util.Collections;
public class Leaders {
    public static ArrayList<Integer> findLeaders(int array[], int n){
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxRight = array[n-1];
        leaders.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(array[i]>maxRight){
                maxRight=array[i];
                leaders.add(maxRight);

            }
        }
        Collections.reverse(leaders);
        return leaders;

    }
    public static void main(String[] args) {
        int array[] = {16, 17, 4, 3, 5, 2};
        int n = array.length;
        ArrayList<Integer> leaders = findLeaders(array, n);
        System.out.println("Leaders: " + leaders);
    }

}
