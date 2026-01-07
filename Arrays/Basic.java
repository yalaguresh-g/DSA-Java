package Arrays;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size = sc.nextInt();
       int Num[] = new int[size];
       //input
       for(int i=0; i<size ; i++){
        Num[i]=sc.nextInt();
       }
        
       //output
        for(int i=0; i<3; i++){
            System.out.println("Array Elments are :" + Num[i]);

        }
    }
}
