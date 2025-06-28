import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class PaliindromeLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        boolean result = isPalindrome(head);
        System.out.println(result);
        sc.close();
    }
    
    public static boolean isPalindrome(Node head){
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        Node secondHalf = reverse(slow);

        // Step 3: Compare both halves
        Node firstHalf = head;
        Node temp = secondHalf;
        while (temp != null) {
            if (firstHalf.data != temp.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
