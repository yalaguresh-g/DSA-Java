package Strings;

public class SubString {
    public static String subString(String str , int si, int ei){
        String substring = "";
        for(int i=si ; i<ei ; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args) {
        String str ="HelloWorld";
        System.out.println(subString(str, 3, 5));
    }
}
