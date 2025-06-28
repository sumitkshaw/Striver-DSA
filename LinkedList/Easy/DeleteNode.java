import java.util.*;

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
public class DeleteNode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Length of the array

        Node head = null;
        Node tail = null;

        for(int i=0; i<n;i++){
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode; // Initialize head if it's the first node
                tail = head;    // Set tail to head
            } else {
                tail.next = newNode; // Link the new node at the end
                tail = tail.next;     // Move tail to the new node
            }   
        }

        int k = sc.nextInt(); // Value to delete from the linked list

        head = deletNode(head, k); // Call the function to delete the node

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " "); // Print the linked list
            current = current.next; // Move to the next node
        }
        sc.close();
    }

    public static Node deletNode(Node head, int k){
        if (head == null) return null; // If the list is empty, return null

        // If the head node is to be deleted
        if (head.data == k) {
            return head.next; // Return the next node as the new head
        }

        Node current = head;
        
        // Traverse the list to find the node to delete
        while (current.next != null && current.next.data != k) {
            current = current.next;
        }

        // If the node was found, delete it
        if (current.next != null) {
            current.next = current.next.next; // Bypass the node to delete it
        }

        return head; // Return the modified list
    }
}