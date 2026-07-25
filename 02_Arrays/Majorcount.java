import java.util.Scanner;

public class Majorcount {
    public static int majorityElement(int array[], int n){
        int count=0;
        int candidate=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=array[i];
                count++;
            }
            else if(array[i]==candidate){
                count++;
            }
            else{
                count--;
            }

        }
        
        int frequency=0;
        for(int i=0;i<n;i++){
            if(array[i]==candidate){
                frequency++;
            }
        
        }
        if(frequency>n/2){
            return candidate;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size =sc.nextInt();

        int array[]= new int[size];
        System.out.println("enter the " +size+ " Element");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

       
        int n =array.length;

        int result=majorityElement(array, n);
        System.out.println(" ");
        System.out.println(result);
        sc.close();
    }
    
}
