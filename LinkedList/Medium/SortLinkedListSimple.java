import java.util.*;

class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class SortLinkedListSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        head = sortList(head);
        printList(head);
        sc.close();
    }

    public static Node sortList(Node head) {
        List<Integer> list = new ArrayList<>();

        // Extract values from linked list
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        // Sort the values
        Collections.sort(list);

        // Refill the linked list
        temp = head;
        for (int val : list) {
            temp.data = val;
            temp = temp.next;
        }

        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
