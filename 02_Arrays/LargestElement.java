import java.util.Scanner;

public class LargestElement {

    public static int findlargestnumber(int array[]){
         int largest= array[0];

        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];

    }
    }
    return largest;
}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the size of the array");
        int size = scanner.nextInt();
        int array[]= new int[size];

        System.out.println("enter the value of array");
        for(int  i=0;i< size;i++){
            array[i] =scanner.nextInt();
        }
        
       int  largestvalue = findlargestnumber(array);
       System.out.println("the largest value  of array is " +largestvalue);
       scanner.close();
    


    }
}
        
    
    

