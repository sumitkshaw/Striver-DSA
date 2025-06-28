
import java.util.Scanner;


class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node head = null;
        Node tail = null;
        for(int i=0; i<n; i++){
            Node newNode = new Node(scanner.nextInt());
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                newNode.prev = tail;
                tail =  tail.next;
            }    
        }
        head = removeDuplicates(head);
        Node current = head;

        while(current != null){
            System.out.print(current.data + "");
            current = current.next;
        }
        scanner.close();
        
    }
    public static Node removeDuplicates(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                Node duplicate = current.next.next;
                current.next = duplicate;
                if(duplicate != null) {
                    duplicate.prev = current;
                }
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
