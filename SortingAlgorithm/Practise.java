import java.util.Scanner;

/**
 * Practise
 */
public class Practise {
    public static void Selection_Sort(int arr[]){
        for(int i =0 ; i<arr.length-1 ; i++){
            int minPos = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter the array");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        Selection_Sort(arr);
        System.out.println("Sorted Array");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}