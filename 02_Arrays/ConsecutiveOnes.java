import java.util.Scanner;

public class ConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int array[]){

        int count =0;
        int maxcount=0;
         for(int i =0; i<array.length;i++){
            if(array[i] == 1){
                count++;
                
            }
            else{
                count=0;
            }
            if(count>maxcount){
                maxcount=count;
            }

           
        }
        return maxcount;

    }
    public static void main(String[] args) {
        // int array[]={1,1,0,1,1,1,0,0};
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the size of the array");
        int size = scanner.nextInt();
        int array[]= new int[size];

        System.out.println("enter the value of array");
        for(int  i=0;i< size;i++){
            array[i] =scanner.nextInt();
        }
        
       
        
        int totalno=findMaxConsecutiveOnes(array);
        System.out.println(totalno);
        scanner.close();
        
    }
}
