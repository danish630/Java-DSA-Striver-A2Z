import java.util.Scanner;

public class ReverseElement {

    // 1. Create a static method instead of a class
    // It takes an integer array as an argument and returns nothing (void)
    public static void printReverse(int[] array) {
        System.out.println("Reversed elements:");
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
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

        // 2. Call the method and pass the array to it
        printReverse(array);
        
        sc.close(); // It's good practice to close the scanner when done
    }
}