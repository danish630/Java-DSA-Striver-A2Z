import java.util.Scanner;

public class EliminateDuplicate {

    public static int checkduplicate(int []array){
        int n =array.length;
        int i =0;
        for( int j=1;j<n;j++){
            if(array[j]!=array[i]){
                i++;
                array[i]=array[j];
            }
        }   
        return i+1;
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
        
        sc.close();
        // int array[]={1,1,2,2,3,3,4,4};
        int count =checkduplicate(array);
        System.out.println(" ");
       for( int i=0;i<count;i++){
        System.out.println(array[i]);

       }
    }
}

