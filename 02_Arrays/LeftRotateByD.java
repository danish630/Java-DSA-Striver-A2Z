import java.util.Scanner;

public class LeftRotateByD {

    public static void rotate(int array[] , int d){
        int n = array.length;
        d = d % n;
        int []temp =  new int[d];
        for(int i=0;i<d;i++){
            temp[i]=array[i];

        }
        for(int i=d;i<n;i++){
            array[i - d] = array[i];
        }
        for(int i=n-d;i<n;i++){
            array[i] = temp[i - (n - d)];
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

        
        System.out.println(" Enter the value of D");
        int d = sc.nextInt();

        
        rotate(array, d);
        System.out.println("  ");
        for(int value : array){
            System.out.println(value + "\t");

        }
        sc.close();
        

        


    }
}
