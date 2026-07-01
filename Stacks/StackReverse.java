import java.util.*;
public class StackReverse {
    public static String reverseStack(String str){
        Stack<Character> c = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            c.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!c.isEmpty()) {
            char curr = c.pop();
            result.append(curr);
        }
        return result.toString();
    } 
    public static void main(String[] args) {
        String str = "Yalaguresh";
        String res = reverseStack(str);
        System.out.println(res);

    }
}
