public class ZigZag {
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
    
    
    public void AddFirst(int Data){
        Node newNode = new Node(Data);

        if(Head == null){
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;
        Head = newNode;
    }

    public void print(){    
        if (Head == null) {
            System.out.println("Linkedlist is empty !");
            return;
        }

        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.Data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    
    public void zigZag(){
        // find mid 
        Node slow = Head;
        Node fast = Head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid =slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // alternate merging
        Node leftH = Head;
        Node rightH = prev;
        Node nextL , nextR ;
        
        while (rightH != null && leftH != null) {
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            rightH = nextR;
            leftH = nextL;
        }
    }

    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.AddFirst(7);
        ll.AddFirst(6);
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
