package DivideAndConquer;

public class SearchRotated {
    public static int Search(int arr[], int tar, int si, int ei){
        if (si > ei) {
            return -1;
        }

        int mid =si+(ei-si)/2;  // or (si+ei)/2

        // case found 
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a
            if (arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, tar, si, mid-1);
            }
            // case b
            else{
                return Search(arr, tar, mid+1, ei);
            }
        }
        // mid on L2

        else {
            // case c
            if (arr[mid]<= tar && tar <= arr[ei]) {
                return Search(arr, tar, mid+1, ei);
            }
            // case d
            else{
                return Search(arr, tar, si, mid-1);
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target=0;
        int tarInx = Search(arr, target, 0, arr.length-1);
        System.out.println(tarInx);
    }
}
