package Arrays;
public class practise {
    public static void main(String[] args) {
        int arr[] = {8,-4,-45,25,8,9,365};
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);

        // int ans = 1;
        // int n = arr.length;
        // for(int i = 0; i < n; i++){
        //     ans = ans * arr[i];
        // }
        // System.out.println(ans);
    }
}