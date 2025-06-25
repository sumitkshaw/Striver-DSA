import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt(); // Value to insert at the end
        int n = sc.nextInt(); // Length of the array
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node head = buildLinkedList(arr);        // Build initial linked list
        head = insertAtE(head, k);               // Insert k at the end
        printList(head);                         // Print final linked list
        sc.close();
    }

    // Builds linked list from array
    public static Node buildLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node tail = head;

        for (int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }

        return head;
    }

    // Inserts k at the end of the linked list
    public static Node insertAtE(Node head, int k) {
        Node newNode = new Node(k);

        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Prints the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
