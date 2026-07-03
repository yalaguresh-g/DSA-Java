package Patterns;
import java.util.Scanner;
public class PrintPattern {
    public static void Pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array list :");
        int n = sc.nextInt();
        Pattern1(n);
    }
}
