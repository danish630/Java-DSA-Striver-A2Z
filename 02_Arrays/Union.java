import java.util.Scanner;

public class Union {
    public static int checkunion(int array1[], int array2[] , int result[]){

        int i=0,k=0,j=0;
        while (i<array1.length && j<array2.length) {
            if (array1[i] < array2[j]) {
    if (k == 0 || result[k-1] != array1[i]) {
        result[k] = array1[i];
        k++;
    }
    i++;
    }
    else if (array1[i] > array2[j]) {
    if (k == 0 || result[k-1] != array2[j]) {
        result[k] = array2[j];
        k++;
    }
    j++;
    }
    else {
    if (k == 0 || result[k-1] != array1[i]) {
        result[k] = array1[i];
        k++;
    }
    i++; j++;
    }

            
        }

        while (i < array1.length) {
            if (k == 0 || result[k-1] != array1[i]) {
                result[k] = array1[i];
                k++;
            }
            i++;
        }

        while (j < array2.length) {
            if (k == 0 || result[k-1] != array2[j]) {
                result[k] = array2[j];
                k++;
            }
            j++;
        }

        return k;
        
        

    }
    public static void main(String[] args) {
        // int array1[]={1,2,2,3,4};
        // int array2[]={4,5,5,6,7};
        
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array: ");
        int size1 = sc.nextInt();

        int array1[] = new int[size1];

        System.out.println("Enter " + size1 + " elements:");

        for(int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.print("Enter size of 2nd array: ");
         int size2 = sc.nextInt();
        int array2[] = new int[size2];
        System.out.println("Enter " + size2 + " elements:");

        for(int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        int result[]=new int [array1.length + array2.length];


        
       int count = checkunion(array1,array2,result);
       System.out.println("Union  of both the arrays :");
       for(int idx=0;idx<count;idx++){
        
        System.out.print("  " +result[idx]);
       }
    }

    }

