package Strings;

public class Palandrome {
    public static boolean isPalandrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "mom";
        System.out.println("The palandrome is :" + isPalandrome(str));
    }
}
