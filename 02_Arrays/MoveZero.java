import java.util.Scanner;

public class MoveZero {

    public static void shifted( int array[]){
        int index=0;
        for ( int i =0;i< array.length; i++){
            if(array[i]!=0){
                array[index]= array[i];
                index++;
            }

        }
        while (index< array.length) {
            array[index]=0;
            index++;
            
        }
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

        shifted(array);

       for( int value : array){
         System.out.print(value + "\t");
        }
        System.out.println();
       

        sc.close();

    }
}
