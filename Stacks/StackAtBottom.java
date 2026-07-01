import java.util.*;

public class StackAtBottom {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reversStack(Stack<Integer> s){
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reversStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(10);
        pushAtBottom(s, 2);
        reversStack(s);
        printStack(s);
        
    }
}
