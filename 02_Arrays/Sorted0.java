import java.util.Scanner;

public class Sorted0 {
    public static void sortedZeroOneTwo(int nums[], int n){
        int low=0;
        int mid=0;
        int high= n-1;
        while (mid <= high) {
            // If current element is 0, swap with low and move both low and mid forward
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            // If current element is 1, just move mid forward
            else if (nums[mid] == 1) {
                mid++;
            }
            // If current element is 2, swap with high and move only high backward
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

    }
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println(" Enter the Size of an array ");
        size=sc.nextInt();
        int nums[] = new int[size] ;
        System.out.println(" enter the " +size+ " of element include only 0,1,2");
        for(int i =0;i<size;i++){
            nums[i]= sc.nextInt();
        }
        int n =nums.length;

        sortedZeroOneTwo(nums, n);
        System.out.println("Sorted of 0s,1s and 2s");
        for(int value: nums){
            System.out.println(" " + value);
        }


        
    }
}
