package Recursion;

public class PracticeQue {
    public static void allOcurrance(int arr[], int key,int i){
        if (i== arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i+" ");
        }
        allOcurrance(arr, key, i+1);
    }

    // 4th que . We are given a string S, we need to find the count of all contiguous substrings
// starting and ending with the same character

     public static int CountSubString(String str, int i, int j, int n){
        if (n== 1 || n <= 0) {
            return n;
        }

        int res = CountSubString(str, i+1, j, n-1) +
                CountSubString(str, i, j-1, n-1) -
                CountSubString(str, i+1, j-1, n-2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }    
        return res;
     }
    public static void main(String[] args) {
        // int arr[]= {3,2,4,5,6,2,7,2,1,1,1,1,1,1,1,};
        // int key=1;
        // allOcurrance(arr, key, 0);
        // System.out.println();
        
        // 4th Questionasi
        String str="abcab";
        int n=str.length();
        System.out.println(CountSubString(str, 0, n-1, n));
    }
}
