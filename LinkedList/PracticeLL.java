import java.security.PublicKey;

public class PracticeLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data){
        // step 1 create node 
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        
        // step 2 newnode next - > head
        newNode.next = head;
        // Step3 head = newnode
        head = newNode;

    }

    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail =newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print LL 
    public void printLL(){
        Node temp = head;
        if (temp == null) {
            System.out.println("LL is empty");
        }
        
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add middle - at index

    public void addMiddle(int idx , int data){
        if (idx == 0) {
            addFirst(data);
            return; 
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if( size == 1){
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;
        }
        int val = head.data;
        size--;
        head = head.next ;
        return val;
    }
    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev = size - 2
        Node prev = head;
        for(int i = 0 ; i < size -2 ; i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int SearchIter(int key){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found 
        return -1;
    }


    /// Recursiv Searching
    public int recursiveSearch(int key){
        return Helper(head , key);
    }

    public int Helper(Node head, int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = Helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public static void main(String[] args) {
        PracticeLL ll = new PracticeLL();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(15);
        ll.addFirst(20);
        ll.addMiddle(0, 8);
        ll.addLast(80);
        ll.printLL();
        // System.out.println(ll.SearchIter(01));
        // System.out.println(ll.SearchIter(15));
        System.out.println(ll.recursiveSearch(15));
        System.out.println(ll.recursiveSearch(45));

    }
}
