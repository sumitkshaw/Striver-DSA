import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class OddEvenLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length of the list
        int n = sc.nextInt();

        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        head = OddEven(head); // Reorder list
        printList(head);      // Output result
        sc.close();
    }

    public static Node OddEven(Node head) {
        if (head == null || head.next == null) return head;

        Node odd = head;
        Node evenHead = head.next;
        Node even = evenHead;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead; // Attach even list after odd
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
