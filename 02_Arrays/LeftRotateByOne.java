import java.util.Scanner;

/**
 * MoveLeft
 */
public class LeftRotateByOne {

    public static void Rotate(int[] array){
        int temp = array[0];
        for ( int i =1; i<array.length; i++){
            array[i-1]=array[i];
        }

        array[array.length-1] = temp;
        


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
        sc.close();

        Rotate(array);
        for( int value : array){
         System.out.print(value + "\t");
        }

        
    }
}