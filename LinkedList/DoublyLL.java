public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    // add first 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        while (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    // print 
    public void printLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // add last
    public void AddLast(int Data){
        Node newNode = new Node(Data);
        size++;

        if(tail == null){
            head = tail = newNode;
            return;   
        }

        tail.next = newNode;
        tail = newNode;
    }
    public int RemoveFirst(){
        if (head == null) {
            System.out.println("DLL is empty!");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--; 
        return val;
    }
    public void ReverseDLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;

    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.printLL();
        dll.ReverseDLL();
        dll.printLL();
        System.out.println(dll.size);
        // dll.RemoveFirst();
        // dll.printLL();
        // System.out.println(dll.size);
    }
}
