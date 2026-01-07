
package Arrays;

public class BinarySearch {
    public static int binarysearch(int number[],int key){
        int start=0, end=number.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if (number[mid]==key) {
                return mid;
            }
            else if (number[mid] < key) { // right
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=14;
        //System.out.println("Index for key is:"+binarysearch(number, key));
        int Index = binarysearch(number, key);
        if (Index == -1) {
            System.out.println("Not found");
        }
        else{
            System.out.println("Index is Found at :"+ Index);
        }
    }
}
