import java.util.Scanner;

public class MissingNumber {
    public static int  findMissingNumber(int []array, int n){
        int actualsum=0;
        for(int i=0;i<n-1;i++){
            actualsum=actualsum+array[i];
        }
        int expectedsum= n*(n+1)/2;

        int missingnumber= expectedsum-actualsum;
        return missingnumber;
        

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        int[] array = new int[n - 1]; 
        
        System.out.println("Enter " + (n-1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            array[i] = sc.nextInt();
        }
        int missingnumber= findMissingNumber(array,n);
        System.out.println("missing number is " +missingnumber);
        sc.close();
    }
}
