import java.util.Scanner;

class BuyAndStock{
    public static int checkPrice(int array[], int n){
        int minprice =array[0];
        int maxprofit=0;
        int currentprofit;


        for(int i=1;i<n;i++){
            if(array[i]<minprice){
                minprice=array[i];
            }
            else{
                currentprofit=array[i]-minprice;
                maxprofit=Math.max(maxprofit, currentprofit);
            }

        }
        return maxprofit;

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
        int n= array.length;
        int result = checkPrice(array, n);
        System.out.println(" "+ result);
        sc.close();

    }
}