
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;

    Node (int x){
        data = x;
        next = null;
        prev = null;
    }
}

public class RemoveAllDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for(int i=0; i<n;i++){
            Node newNode = new Node(sc.nextInt());
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                newNode.prev = tail;
                tail = tail.next;
            }
        }
        int x = sc.nextInt();
        head = remove(head,x);

        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        sc.close();
    }
    public static Node remove(Node head, int x) {
        Node current = head;

        while (current != null) {
            Node next = current.next; // ✅ Save next node reference

            if (current.data == x) {
                if (current.prev == null) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
            }
            current = next; // ✅ Always move to the saved next node
        }
        return head;
    }
}
