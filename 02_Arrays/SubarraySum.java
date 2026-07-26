import java.util.Scanner;

public class SubarraySum {

    public static int checkSubarray(int array[], int n){
        int sum=0;
        int max= array[0];
        for(int i=0; i<n;i++){
            sum=sum+array[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
          
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter " + size + " elements:");

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int n =array.length;
        int result=checkSubarray(array, n);
        System.out.println( "  "+ result);
        sc.close();

    }
}
