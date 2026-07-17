import java.util.Scanner;

public class NumberOnce {
    public static int findNumber(int []array){
        int result=0;
        for(int i=0;i<array.length;i++){
            result=result^array[i];

        }
        return result;

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
        int numberappear= findNumber(array);
        System.out.println("the number apperas once " +numberappear);
        sc.close();

    }
}
