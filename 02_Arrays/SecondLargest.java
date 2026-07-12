import java.util.Scanner;

public class SecondLargest {

    public static int Large ( int array[]){
        int largest = array[0];
        int SecondLargest = array[1];

        for(int i=0;i<array.length;i++){
            if( array[i]> largest){
               SecondLargest = largest;
            largest= array[i];

            }
            else if( array[i]>SecondLargest && array[i]!= largest){
                SecondLargest = array[i];
            }
        }
        return SecondLargest;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the Size of an Array ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter " + size + " elements:");

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int Secondmaxno = Large(array);

        System.out.println(" Second Largest number" + Secondmaxno);

        sc.close();
}
}
