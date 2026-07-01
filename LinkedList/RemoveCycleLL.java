public class RemoveCycleLL {
    public static class Node {
        int Data;
        Node next;

        public Node(int Data) {
            this.Data = Data;
            this.next = null;
        }
    }

    public static Node Head;

    public static boolean isCycle() {
        Node slow = Head;
        Node fast = Head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = Head;
        Node fast = Head;
        boolean cycle = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return;
        }

        // Step 2: Find starting point of cycle
        slow = Head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        Head = new Node(1);
        Head.next = new Node(2);
        Node temp = new Node(3);
        Head.next.next = temp;
        Head.next.next.next = new Node(4);
        Head.next.next.next.next = new Node(5);
        Head.next.next.next.next.next = temp;

        // Create cycle (5 → 3)
        Head.next.next.next.next = temp;

        System.out.println("Before remove cycle is : "+isCycle()); // true
        removeCycle();
        System.out.println("Aftre remove cycle is : "+isCycle()); // false
    }
}