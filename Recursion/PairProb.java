package Recursion;

public class PairProb {
    public static int pairFrnds(int n){
        // Base case 
        if (n==1 || n==2) {
            return n;
        }
        // // single choice
        // int fnm1 = pairFrnds(n-1);
        // // pair choice
        // int fnm2 = pairFrnds(n-2);
        // int pairway = (n-1) * fnm2;
        // // total ways 

        // int totalway = fnm1 + pairway;
        // return totalway;
        return pairFrnds(n-1) + (n-1)*pairFrnds(n-2);
        
    }
    public static void printBinString(int n, int lastplace , String str){
        // base case
        if (n==0) {
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str+"0");
        if (n==0) {
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinString(3, 0, "");
       // System.out.println(pairFrnds(5));
    //    System.out.println(printBinString(3, 0, new StringBuilder("")));

    }
}
