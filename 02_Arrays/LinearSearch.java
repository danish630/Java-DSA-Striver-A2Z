import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int []array, int target){
        for(int i =0;i<array.length;i++){
        if(array[i]==target){
           return i;
        }
    }
    return -1;


    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(" enter the target value ");
        int target =sc.nextInt();

        int count =linearsearch(array,target);
        System.out.println(" the index of an target value is : " +count);
        sc.close();
    }
}
