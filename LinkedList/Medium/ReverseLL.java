import java.util.Scanner;

public class ReverseLL {
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
        head = reverse(head);
        Node current = head;

        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        sc.close();
    }
    public static Node reverse(Node head){

        if(head == null){
            return null;
        }

        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
