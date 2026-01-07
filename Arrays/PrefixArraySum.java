package Arrays;

public class PrefixArraySum {
    public static void PrefixSum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[number.length];

        prefix[0]= number[0];

        //calculate prefix arrya
        for(int i=1; i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }


        for(int i=0; i<number.length ;i++){
            int start=i;
            for(int j=0 ; j<number.length ;j++){
                int end=j;
                currSum= start==0 ? prefix[end] : prefix[end]+prefix[start-1];
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum is : " + maxSum);
    }

    public static void kadanes(int number[]){

        int ms=Integer.MIN_VALUE; // maxSum
        int cs=0;  // currSum

        for(int i=0; i<number.length;i++){
            cs=cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("our max subArray sum is : "+ms);
    }
    public static void main(String[] args) {
        int number []={-1,-1,-2,-3};
        //maxSubarraySum(number);
        kadanes(number);
   
    }
}
