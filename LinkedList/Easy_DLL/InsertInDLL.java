
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertInDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for (int i=0;i< n;i++){
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode; // Initialize head if it's the first node
                tail = head;    // Set tail to head
            } else {
                tail.next = newNode; // Link the new node at the end
                newNode.prev = tail; // Set the previous pointer of the new node
                tail = tail.next;     // Move tail to the new node
            }
        }
        head = insertAtPos(head, 10, 0); // Example: Insert 10 at position 0
        
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        sc.close();
    }
    public static Node insertAtPos(Node head, int data, int pos){
        Node temp = head;
        int count = 0;
        Node newNode = new Node(data);

        if(pos == 0){
            Node front = head.next;
            newNode.prev = head;
            newNode.next = front;
            head.next = newNode;
            if (front != null) front.prev = newNode;
            return head;
        }

        while(temp != null){
            count++;
            temp = temp.next;
            if(count == pos){
                break;
            }
        }

        if (temp == null) return head; // if position is out of range

        Node front = temp.next;

        if (front == null) {
            newNode.next = null;
            newNode.prev = temp;
            temp.next = newNode;
        } else {
            newNode.next = front;
            newNode.prev = temp;
            temp.next = newNode;
            front.prev = newNode;
        }

        return head;
    }

}
