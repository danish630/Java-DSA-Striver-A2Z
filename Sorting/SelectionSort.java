package Sorting;

public class SelectionSort {

    public static void selectionSort(int array[], int n){
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[minindex]){
                    minindex=j;
                }
            }
            int temp=array[i];
            array[i]=array[minindex];
            array[minindex]=temp;
        }
        
    }
    public static void main(String[] args) {
        int array[] = {5, 4, 3, 2, 1};
        int n = array.length;

        selectionSort(array, n);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}

