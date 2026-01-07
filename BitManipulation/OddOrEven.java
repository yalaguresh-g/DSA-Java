package BitManipulation;

public class OddOrEven {
    public static void OddOrEven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("The given number is Even");
        }
        else{
            System.out.println("The Given number is Odd");
        }
    }
    
    public static void main(String[] args) {
        OddOrEven(4);
        OddOrEven(3);
        OddOrEven(9);
        OddOrEven(124);
        
    }
}
