package Recursion;

public class Print1toN {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
       
    }
    public static void main(String[] args) {
        int n = 5; 
        printNumbers(n);
}
}

