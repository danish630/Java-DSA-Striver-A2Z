import java.util.Scanner;

public class RightRotateByD {

    public static void rotate(int array[], int d ){
        int n = array.length;
        d = d % n;
        int temp[] =  new int[d];
        for(int i =n-d; i<n;i++){
            temp[i - (n - d)]= array[i];
        }
        for(int i=n-d-1;i>=0;i--){
            array[i+d]=array[i];

        }
        for( int i =0;i<d;i++){
            array[i]=temp[i];
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
        System.out.println(" enter the value of D ");
        int d = sc.nextInt();

        rotate(array,d);
        for(int value : array){
            System.out.println(value);
        }




        sc.close();
    }
}
