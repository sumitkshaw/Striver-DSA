import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int x) {
        data = x;
        next = null;
    }
}

public class ArrayToLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Length of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node head = arrayToLL(arr); // ✅ fixed method name
        Node temp = head;

        // ✅ Print the linked list
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }

    public static Node arrayToLL(int[] arr) { // ✅ fixed method name
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node tail = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }

        return head;
    }
}
