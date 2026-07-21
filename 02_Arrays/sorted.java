import java.util.Scanner;

public class sorted {

    public static boolean checksorted (int array[]){
        boolean isSorted = true;
        for( int i=0;i< array.length-1;i++){
            if( array[i+1] < array[i])
                isSorted = false;
        }
        return  isSorted;
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


        boolean checkresult = checksorted(array);
        System.out.println(" The array is " +checkresult);
        sc.close();
    }
    
 }

// class sorted{
//     public static void bubbleSort(int array[], int n){
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1-i;j++){
//                 if(array[j+1]<array[j]){
//                     int temp = array[j];
//                     array[j] = array[j+1];
//                     array[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int array[]={5,2,4,6,3,1};
//         int n=array.length;
//        bubbleSort(array,n);
//         for ( int value : array){
//             System.out.println(" "+ value);
//         }
//     }
// }