import java.util.*;

class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class RemoveNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: length of linked list
        int n = sc.nextInt();
        Node head = null, tail = null;

        // Build the linked list
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        int k = sc.nextInt(); // n-th node from end to remove
        head = Remove(head, k); // Call the function
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        sc.close();
    }

    public static Node Remove(Node head, int n) {
        // Create a dummy node to handle edge cases like removing head
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy, slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast != null)
                fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        if (slow.next != null)
            slow.next = slow.next.next;

        return dummy.next;
    }

}
