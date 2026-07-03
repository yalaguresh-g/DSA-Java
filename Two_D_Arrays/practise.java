package Two_D_Arrays;
public class practise {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16,45},
            {4}
        };
        int row = arr.length;
        for(int i=0; i<= row-1; i++) {
            int col = arr[i].length;
            for(int j=0; j<= col-1 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
