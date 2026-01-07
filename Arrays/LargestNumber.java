package Arrays;

public class LargestNumber {

    public static int getLargest(int number[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length ;i++){
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest =number[i];
            }
        }
        System.out.println("The smallest number is:"+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[]={2,3,4,5,6,5,8,45,2,7,8};
        int result=getLargest(number);
        System.out.println("The Largest Number is:"+result);
    }
}
