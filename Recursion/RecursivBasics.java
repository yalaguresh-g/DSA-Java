package Recursion;

public class RecursivBasics {
    public static void printDec(int n){
        if (n==1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n +" ");
    }
    public static int fact(int n){
        if (n==0 || n==1) {
            return 1;            
        }
        int fn = n * fact(n-1);
        return fn; 
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));;
    }
}
