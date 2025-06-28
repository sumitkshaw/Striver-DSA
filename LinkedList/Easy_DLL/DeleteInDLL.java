import java.util.Scanner;

class Node {
        int data;
        Node prev;
        Node next;

        Node(int x) {
            data = x;
            prev = null;
            next = null;
        }
    }

public class DeleteInDLL {
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
        int key = sc.nextInt(); // Read the key to delete
        head = deleteNode(head, key); 

        // Print the updated list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        sc.close();
    }

    public static Node deleteNode(Node head, int key) {
        if (head == null) return null;

        Node temp = head;
        int count = 1;

        while (temp != null) {
            if (count == key) {
                if(temp.prev ==null){
                    head = temp.next;
                    if(head !=null){
                        head.prev = null;
                    }
                }
                else{
                    temp.prev.next = temp.next;
                    if(temp.next !=null){
                        temp.next.prev = temp.prev;
                    }
                }    
            }
            temp = temp.next;
            count++;
        }

        return head;
    }
}

// DELETE A NODE IF DATA OF NODE IS GIVEN

        // if (head == null) return null;

        // Node temp = head;

        // // If the node to be deleted is the head
        // if (temp.data == key) {
        //     head = temp.next; // Move head to the next node
        //     if (head != null) head.prev = null; // Update prev of new head
        //     return head;
        // }

        // // Traverse the list to find the node to delete
        // while (temp != null && temp.data != key) {
        //     temp = temp.next;
        // }

        // // If the node was not found
        // if (temp == null) return head;

        // // Unlink the node from the list
        // if (temp.prev != null) temp.prev.next = temp.next; // Update next of previous node
        // if (temp.next != null) temp.next.prev = temp.prev; // Update prev of next node

        // return head; // Return the updated list