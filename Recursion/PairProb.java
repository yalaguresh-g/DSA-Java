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
    
    public static void main(String[] args) {
    
        System.out.println(pairFrnds(5));

    }
}
