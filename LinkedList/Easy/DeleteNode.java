import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // Index of node to delete (not value!)

        Node head = buildList(arr);
        Node nodeToDelete = getNodeAt(head, k);

        if (nodeToDelete != null && nodeToDelete.next != null) {
            deleteNode(nodeToDelete);
        }

        printList(head);
        sc.close();
    }

    public static Node buildList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    // Gets node at index k (0-based)
    public static Node getNodeAt(Node head, int k) {
        int i = 0;
        Node curr = head;
        while (curr != null && i < k) {
            curr = curr.next;
            i++;
        }
        return curr;
    }

    // LeetCode-style deleteNode by reference
    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
