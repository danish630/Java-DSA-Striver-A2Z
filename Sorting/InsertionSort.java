package Sorting;

public class InsertionSort {
    public static void insertionSort(int array[], int n){
        for(int i=1;i<n;i++){
            int key=array[i];
            int j=i-1;
            while(array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int array[] = {5, 4, 3, 2, 1};
        int n = array.length;

        insertionSort(array, n);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}

