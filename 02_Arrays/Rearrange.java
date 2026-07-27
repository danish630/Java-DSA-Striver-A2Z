public class Rearrange { 
    public static int[] rearrange(int array[],int n){
        int ans[] = new int[n];
        int positiveIndex = 0;
        int negativeIndex = 1;
        for(int i=0;i<n;i++){
            if(array[i]>=0){
                ans[positiveIndex]=array[i];
                positiveIndex+=2;
            }
            else{
                ans[negativeIndex]=array[i];
                negativeIndex+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int array[] = {1, 2, -3, -4, -5,6};
        int n = array.length;
        array = rearrange(array, n);
        for(int result : array){
            System.out.println("  "+ result);
        }
        
        


    }

}
