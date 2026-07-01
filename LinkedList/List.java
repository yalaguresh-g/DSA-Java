public class List {
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
    public static int size;

    public void AddFirst(int Data){
        Node newNode = new Node(Data);
        size++;

        if(Head == null){
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;
        Head = newNode;
    }

    public void AddLast(int Data){
        Node newNode = new Node(Data);
        size++;

        if(Tail == null){
            Head = Tail = newNode;
            return;   
        }

        Tail.next = newNode;
        Tail = newNode;
    }

    public void AddMiddle(int idx, int Data){
        if (idx == 0) {
            AddFirst(Data);
            return;
        }
        Node newNode = new Node(Data);
        size++;
        Node temp = Head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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
    public int RemoveFirst(){
        if (size == 0) {
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = Head.Data;
            Head = Tail = null;
            size = 0;
            return val; 
        }
        int val = Head.Data;
        Head = Head.next;
        size--;
        return val;
    }
    
    public int RemoveLast(){
        if (size == 0) {
            System.out.println("Linked List is empty!");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = Head.Data;
            Head = Tail = null;
            size = 0;
            return val;
        }
        // prev -> size -2
        Node Prev = Head;
        for(int i = 0 ; i < size -2; i++){
            Prev = Prev .next;
        }

        int val = Prev.next.Data;
        Prev.next = null;
        Tail = Prev ;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = Head;
        int i = 0;
        while (temp != null) {
            if (temp.Data == key) {
            return i;
        }
        temp = temp.next;
        i++;
        }
        return -1;
        
    }

    public void reverse(){
        Node prev = null;
        Node curr = Tail = Head;
        Node next ;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public void DeleteNthFromEnd(int n){
        int sz = 0;
        Node temp = Head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (sz == n) {
            Head = Head.next;
            sz++;
        }

        int i = 1;
        int itofind = sz - n;
        Node prev = Head;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node Head){
        Node slow = Head;
        Node fast = Head;

        while (fast != null && fast.next != null) {
            slow =slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if (Head == null || Head.next == null) {
            return true;
        }
        // step 1 find midNode 
        Node midNode = findMid(Head);
        // step 2: reverse 2nd half 
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = Head;

        // step 3: check if 1st half == 2nd half
        
        while (right != null) {
            if (right.Data != left.Data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }

    public static void main(String[] args) {
        List ll = new List();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
        

        // ll.RemoveFirst();
        // ll.print();
        // System.out.println(ll.size);

        // ll.RemoveLast();
        // ll.print();
        // System.out.println(ll.size);
        // ll.print();
        // System.out.println(ll.itrSearch(2));
        // System.out.println(ll.itrSearch(15));

    }
}