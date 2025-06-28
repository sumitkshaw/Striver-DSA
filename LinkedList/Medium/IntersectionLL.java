
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node (int x){
        data = x;
        next = null;
    }
}

public class IntersectionLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for(int i=0; i<n; i++){
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

        // SHIT TO MAKE A SHARED NODE WITH 2 LINKEDLIST 
        // NOT IN MOOD TO MAKE IT RIGHT NOW

        
    }
    public static Node intersection(Node headA, Node headB){
        if (headA == null || headB == null) {
            return null;
        }
        Node a = headA;
        Node b = headB;

        while(a!=b){
            if(a == null){
                a = headB;
            }
            else{
                a=a.next;
            }
            if(b == null){
                b = headA;
            }
            else{
                b = b.next;
            }
        }
        return a;
    }
}
