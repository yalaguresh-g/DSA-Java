package Strings;

import java.util.Scanner;

public class StringsBasic {
    public static void printLater(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name= sc.nextLine();
        // System.out.println("Name is :" + name.length());

        String fName= "Ajith";
        String lName = "Kumar";
        String FName = fName +" " +lName;
        //System.out.println(FName.charAt(6));

        printLater(FName);
    }
}
