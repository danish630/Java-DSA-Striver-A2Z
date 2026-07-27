public class Permutation {

    public static void nextPermutation(int[] arr) {

        int n = arr.length;
        int pivot = -1;

        // Step 1: Find the Pivot
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot exists, reverse the whole array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the smallest element greater than pivot
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(arr, pivot + 1, n - 1);
    }

    // Swap Function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse Function
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 2};

        nextPermutation(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}