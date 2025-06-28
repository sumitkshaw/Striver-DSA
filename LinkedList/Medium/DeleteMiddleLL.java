import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class DeleteMiddleLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of elements
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        head = deleteMiddle(head); // delete middle node

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        sc.close();
    }

    public static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Remove the middle node
        prev.next = slow.next;
        return head;
    }
}
