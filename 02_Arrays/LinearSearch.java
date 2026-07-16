public class LinearSearch {
    public static int linearsearch(int []array, int target){
        for(int i =0;i<array.length;i++){
        if(array[i]==target){
           return i;
        }
    }
    return -1;


    }
    public static void main(String[] args) {
        int array[]={54,25,69,32,45};
        int target=32;

        int count =linearsearch(array,target);
        System.out.println(count);
    }
}
