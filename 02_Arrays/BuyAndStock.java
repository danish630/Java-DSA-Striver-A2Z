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
        int arrray[]={5,9,1,6,3,2,1};
        int n= arrray.length;
        int result = checkPrice(arrray, n);
        System.out.println(" "+ result);
        

    }
}