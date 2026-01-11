package DivideAndConquer;

public class MergeSort {
    public static void printMergeSort(int arr[], int si, int ei){
        // base case
        if (si >= ei) {
            return;
        }
        
        int mid= si + (ei - si)/2; // mid= (si + ei)/2
        printMergeSort(arr, si, mid);  // left part of array
        printMergeSort(arr, mid+1, ei); // right part of array
        merge(arr, si, ei, mid);


    }

    public static void merge(int arr[] , int si, int ei, int mid){
        int temp[] = new int [ei-si+1];
        int i=si; // iterator for left part
        int j=mid+1;  // iterator for right part 
        int k=0; // iterator for temp arr

        while (i <= mid && j<=ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // left remaining part
        while (i <= mid ) {
            temp[k++] =arr[i++];
        }
        
        // right reamining part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for(k=0, i=si; k< temp.length; k++, i++){
            arr[i]= temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,2,3,-1,-10,22,54,8,9,5,4,2,-2};
        printMergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
