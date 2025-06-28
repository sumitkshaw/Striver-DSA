
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int x){
        data =x;
        next = null;
    }
}

public class MiddleLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for(int i =0; i<n; i++){
            Node newNode = new Node(sc.nextInt());
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
        head = middleNode(head);
        Node current = head;

        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        sc.close();
        
    }
    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
