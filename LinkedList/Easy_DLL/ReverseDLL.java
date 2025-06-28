import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;
    Node (int x){
        data = x;
        prev = null;
        next = null;
    }
}

public class ReverseDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Length of the linked list
        Node head = null;
        Node tail = null;

        for(int i=0; i<n;i++){
            Node newNode = new Node(sc.nextInt());
            if (head ==null){
                head = newNode;
                tail = head;
            }
            else{
                tail.next = newNode; // Link the new node at the end
                newNode.prev = tail; // Set the previous pointer of the new node
                tail = tail.next;     // Move tail to the new node
            }
        }
        head = reverseDLL(head); // Call the function to reverse the DLL
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        sc.close();
    }

    public static Node reverseDLL(Node head){
        if (head == null){
            return null;
        }
        Node current = head;
        Node newHead = head;

        while(current != null){
            Node prev = current.prev;
            current.prev = current.next; // Reverse the next pointer
            current.next = prev; // Reverse the prev pointer
            newHead = current; // Update newHead to the current node
            current = current.prev; // Move to the next node in the original order
        }
        return newHead;
    }
}
