public class TwoDarr {
    public static void CountNum(int[][] arr){
        int N = arr.length;
        int M = arr[0].length;
        int count = 0;
        for(int i = 0; i<N ; i++){
            for(int j = 0 ; j< M ; j++){
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("count of 7 is " + count);
    }
    public static void main(String[] args) {
        int[][] arr = {{4,7,8},{8,8,7}};
        CountNum(arr);
    }
}
