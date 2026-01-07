package BasicSortingAlgorithm;   // package always comes first
import java.util.Arrays;
import java.util.Collections;

public class Insertion_Sorting {

    public static void insertSort(Integer arr[]){
        for(int i=1 ; i<arr.length ;i++){
            int curr =arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] =curr;
        }
    }
    
    public static void ArrPrint( Integer arr[]){
        for( int i=0 ; i<arr.length; i++){
            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = {5,4,3,1,2,4,65,9};
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        ArrPrint(arr);
    }
}
