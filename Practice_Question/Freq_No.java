package Practice_Question;

public class Freq_No {
    public static boolean check(int arr[]){
        int n=arr.length;
        for(int i=0 ; i<n ; i++) {
            int count= 0;
            for(int j=i ; j<n ; j++){
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
           if (count>=2) {
            return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,7,8,7};
        System.out.println(check(arr));;
    }
}
