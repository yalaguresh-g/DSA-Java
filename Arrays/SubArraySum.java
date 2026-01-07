package Arrays;
                 
       // Brute Force

public class SubArraySum {
    public static void maxSubarraySum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length ;i++){
            for(int j=0 ; j<number.length ;j++){
                currSum=0;
                for(int k=i; k<=j ;k++){ // print 
                    currSum += number[k];       // subArray Sum
                }
                System.out.println("Subarray  ( "+i+","+j+" ) sum:" + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int number []={2,4,6,8,10};
        maxSubarraySum(number);
    }
}
