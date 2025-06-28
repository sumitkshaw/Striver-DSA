import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class SearchInLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of nodes
        int n = sc.nextInt();
        Node head = null, tail = null;

        // Input: elements of the linked list
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        // Input: key to search
        int key = sc.nextInt();

        // Search and output result
        boolean found = searchKey(head, key);
        System.out.println(found);

        sc.close();
    }

    static boolean searchKey(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
