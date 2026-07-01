public class CyclicLL {
    public static class Node{
        int Data;
        Node next;

        public Node(int Data){
            this.Data = Data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public static boolean isCycle(){
        Node slow = Head;
        Node fast = Head;
        while (slow != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
        return false;
    }
    public static void main(String[] args) {
        Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
        Head.next.next.next = Head; // 1->2->3->1
        System.out.println(isCycle());
    }
}
