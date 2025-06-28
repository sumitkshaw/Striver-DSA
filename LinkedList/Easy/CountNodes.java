
import java.util.Scanner;


class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class CountNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Length of the linked list
        Node head = null;
        Node tail = null;
        for(int i=0; i<n; i++){
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode; // Initialize head if it's the first node
                tail = head;    // Set tail to head
            } else {
                tail.next = newNode; // Link the new node at the end
                tail = tail.next;     // Move tail to the new node
            }   
        }
        int count = countNodes(head); // Call the function to count nodes
        System.out.println(count); // Print the count of nodes
    }
    public static int countNodes(Node head) {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}
